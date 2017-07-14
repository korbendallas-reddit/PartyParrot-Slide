package korbendallas.partyparrotslide;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;


public class ParrotObject {

    private Context context;
    private String parrotType;
    private Bitmap[] ppFrames;
    private int ppFrame = 0;
    private long lastTimeStamp = 0;
    private long lastFrameChange = 0;
    private Bitmap ppBitmap;
    private double ppScaleX;
    private double ppFPS = 20;
    private double frameLife;
    private boolean onBottom = true;
    private boolean isJumping = false;
    private long jumpStart = 0;
    private double jumpDuration = 0.4;
    private double ppRotation;
    private double x;
    private double y;
    private double maxY;
    private double minY;

    public ParrotObject(Context context, String type, double scaleX, double railTop, double railBottom) {
        this.context = context;
        this.ppScaleX = scaleX;
        this.frameLife = (double)1000 / (double)ppFPS;
        this.lastTimeStamp = System.currentTimeMillis();
        setType(type);
        this.minY = railTop;
        this.maxY = railBottom - (double)ppBitmap.getHeight();
        this.y = railBottom - (double)ppBitmap.getHeight();
        update();
    }

    public void setType(String type) {
        parrotType = type;
        Bitmap[] ppFramesTemp = new Bitmap[] {
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_01),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_02),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_03),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_04),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_05),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_06),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_07),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_08),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_09),
                BitmapFactory.decodeResource(context.getResources(), R.drawable.party_10)
        };
        switch (parrotType) {
            case "Party":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.party_10)
                };
                break;
            case "Gilded":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gilded_10)
                };
                break;
            case "Popcorn":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.popcorn_10)
                };
                break;
            case "Sad":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.sad_10)
                };
                break;
            case "Santa":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.santa_10)
                };
                break;
            case "Grinch":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.grinch_10)
                };
                break;
            case "Commie":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.commie_10)
                };
                break;
            case "Fiesta":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.fiesta_10)
                };
                break;
            case "Jester":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.jester_10)
                };
                break;
            case "Gentleman":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.gentleman_10)
                };
                break;
            case "Double":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.double_10)
                };
                break;
            case "Devil":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.devil_10)
                };
                break;
            case "Angel":
                ppFramesTemp = new Bitmap[] {
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_01),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_02),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_03),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_04),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_05),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_06),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_07),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_08),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_09),
                        BitmapFactory.decodeResource(context.getResources(), R.drawable.angel_10)
                };
                break;
        }

        // Scale the frame
        ppFrames = new Bitmap[] {
                Bitmap.createScaledBitmap(ppFramesTemp[0], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[1], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[2], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[3], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[4], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[5], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[6], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[7], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[8], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false),
                Bitmap.createScaledBitmap(ppFramesTemp[9], (int)(64 * ppScaleX), (int)(64 * ppScaleX), false)
        };
        ppBitmap = ppFrames[0];
    }

    public void update() {
        // Set frame
        long timestamp = System.currentTimeMillis();
        if ((double)((double)timestamp - (double)lastFrameChange) >= (double)frameLife) {
            ppFrame++;
            lastFrameChange = timestamp;
            if (ppFrame >= ppFrames.length) {
                ppFrame = 0;
            }
        }

        ppBitmap = ppFrames[ppFrame];

        // Handle jumps
        if (isJumping) {
            if (jumpStart == 0) {
                jumpStart = lastTimeStamp;
            }

            double currentJumpState = ((double)timestamp - (double)jumpStart) / (jumpDuration * (double)1000);

            if (onBottom) {
                y = (double) (maxY - ((maxY - minY) * currentJumpState));
                ppRotation = (currentJumpState * (double)180);
            } else {
                y = (double)(minY + ((maxY - minY) * currentJumpState));
                ppRotation = (double)180 + (currentJumpState * (double)180);
            }


            if (((double)timestamp - (double)jumpStart) / (double)1000 > jumpDuration) {
                jumpStart = 0;
                isJumping = false;
                if (onBottom) {
                    y = minY;
                    ppRotation = 180;
                    onBottom = false;
                } else {
                    y = maxY;
                    ppRotation = 0;
                    onBottom = true;
                }
            }
        }

        // Rotate
        Matrix matrix = new Matrix();
        matrix.postRotate((float)ppRotation);
        ppBitmap = Bitmap.createBitmap(ppBitmap, 0, 0, ppBitmap.getWidth(), ppBitmap.getHeight(), matrix, true);

        this.x = (54 * ppScaleX) - (ppBitmap.getWidth() / 2);
        lastTimeStamp = timestamp;
    }

    public void jump() {
        if (!isJumping) {
            isJumping = true;
        }
    }
    public boolean jumping() {
        return isJumping;
    }

    public Bitmap getBitmap() {
        return ppBitmap;
    }
    public int getX() {
        return (int)x;
    }
    public int getY() {
        return (int)y;
    }
    public double getWidth() {
        return ppBitmap.getWidth();
    }
    public double getHeight() {
        return ppBitmap.getHeight();
    }
}
