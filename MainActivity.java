package korbendallas.partyparrotslide;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    GameSurface gameSurface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.gameSurface = new GameSurface(this);
        this.setContentView(gameSurface);
    }

    @Override
    protected void onPause() {
        super.onPause();
        this.gameSurface.pause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.gameSurface.unPause();
    }
}
