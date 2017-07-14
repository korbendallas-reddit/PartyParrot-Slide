package korbendallas.partyparrotslide;


import android.graphics.Canvas;
import android.view.SurfaceHolder;


public class GameThread extends Thread {

    public Canvas canvas;
    private volatile boolean running;
    private GameSurface gameSurface;
    private SurfaceHolder surfaceHolder;


    public GameThread(GameSurface gameSurface, SurfaceHolder surfaceHolder)  {
        this.gameSurface = gameSurface;
        this.surfaceHolder = surfaceHolder;
    }

    @Override
    public void run()  {
        while(running)  {
            try {
                // Get Canvas from Holder and lock it
                canvas = this.surfaceHolder.lockCanvas();

                // Synchronized
                synchronized (canvas) {
                    this.gameSurface.update();
                    this.gameSurface.draw(canvas);
                }
            } catch (Exception e) {
                // Do nothing
            } finally {
                if (canvas != null) {
                    // Unlock Canvas
                    this.surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
        }
    }

    public void setRunning(boolean running)  {
        this.running = running;
    }
}
