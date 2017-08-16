package korbendallas.partyparrotslide;


import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.os.Build;
import android.os.PowerManager;
import android.view.Display;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Random;


public class GameSurface extends SurfaceView implements SurfaceHolder.Callback {

    private GameThread gameThread;
    private Context sContext;
    private SurfaceHolder sHolder;

    PowerManager powerManager;

    private SharedPreferences prefs;
    private SharedPreferences.Editor prefsEditor;

    private SoundPool soundPool;
    private int bonusSound;
    private int jumpSound;
    private int restartSound;
    private MediaPlayer mPlayer;

    private long lastDrawTime = 0;
    private int fps = 0;
    private int fpsLastUpdated = 100;

    private int displayWidth;
    private int displayHeight;
    private double displayScaleX;
    private double displayScaleY;

    private double railTop = 200;
    private double railBottom = 880;

    private Paint paint1;
    private Paint paint2;
    private static int[][] colors = new int[][] { {255, 255, 0, 0}, {255, 255, 4, 0}, {255, 255, 8, 0}, {255, 255, 13, 0}, {255, 255, 17, 0}, {255, 255, 21, 0}, {255, 255, 25, 0}, {255, 255, 30, 0}, {255, 255, 34, 0}, {255, 255, 38, 0}, {255, 255, 42, 0}, {255, 255, 47, 0}, {255, 255, 51, 0}, {255, 255, 55, 0}, {255, 255, 60, 0}, {255, 255, 64, 0}, {255, 255, 68, 0}, {255, 255, 72, 0}, {255, 255, 77, 0}, {255, 255, 81, 0}, {255, 255, 85, 0}, {255, 255, 89, 0}, {255, 255, 94, 0}, {255, 255, 98, 0}, {255, 255, 102, 0}, {255, 255, 106, 0}, {255, 255, 111, 0}, {255, 255, 115, 0}, {255, 255, 119, 0}, {255, 255, 123, 0}, {255, 255, 128, 0}, {255, 255, 132, 0}, {255, 255, 136, 0}, {255, 255, 140, 0}, {255, 255, 145, 0}, {255, 255, 149, 0}, {255, 255, 153, 0}, {255, 255, 157, 0}, {255, 255, 162, 0}, {255, 255, 166, 0}, {255, 255, 170, 0}, {255, 255, 174, 0}, {255, 255, 179, 0}, {255, 255, 183, 0}, {255, 255, 187, 0}, {255, 255, 191, 0}, {255, 255, 196, 0}, {255, 255, 200, 0}, {255, 255, 204, 0}, {255, 255, 208, 0}, {255, 255, 213, 0}, {255, 255, 217, 0}, {255, 255, 221, 0}, {255, 255, 225, 0}, {255, 255, 230, 0}, {255, 255, 234, 0}, {255, 255, 238, 0}, {255, 255, 242, 0}, {255, 255, 247, 0}, {255, 255, 251, 0}, {255, 255, 255, 0}, {255, 251, 255, 0}, {255, 247, 255, 0}, {255, 242, 255, 0}, {255, 238, 255, 0}, {255, 234, 255, 0}, {255, 230, 255, 0}, {255, 225, 255, 0}, {255, 221, 255, 0}, {255, 217, 255, 0}, {255, 213, 255, 0}, {255, 208, 255, 0}, {255, 204, 255, 0}, {255, 200, 255, 0}, {255, 196, 255, 0}, {255, 191, 255, 0}, {255, 187, 255, 0}, {255, 183, 255, 0}, {255, 179, 255, 0}, {255, 174, 255, 0}, {255, 170, 255, 0}, {255, 166, 255, 0}, {255, 162, 255, 0}, {255, 157, 255, 0}, {255, 153, 255, 0}, {255, 149, 255, 0}, {255, 145, 255, 0}, {255, 140, 255, 0}, {255, 136, 255, 0}, {255, 132, 255, 0}, {255, 128, 255, 0}, {255, 123, 255, 0}, {255, 119, 255, 0}, {255, 115, 255, 0}, {255, 111, 255, 0}, {255, 106, 255, 0}, {255, 102, 255, 0}, {255, 98, 255, 0}, {255, 94, 255, 0}, {255, 89, 255, 0}, {255, 85, 255, 0}, {255, 81, 255, 0}, {255, 77, 255, 0}, {255, 72, 255, 0}, {255, 68, 255, 0}, {255, 64, 255, 0}, {255, 60, 255, 0}, {255, 55, 255, 0}, {255, 51, 255, 0}, {255, 47, 255, 0}, {255, 42, 255, 0}, {255, 38, 255, 0}, {255, 34, 255, 0}, {255, 30, 255, 0}, {255, 25, 255, 0}, {255, 21, 255, 0}, {255, 17, 255, 0}, {255, 13, 255, 0}, {255, 8, 255, 0}, {255, 4, 255, 0}, {255, 0, 255, 0}, {255, 0, 255, 4}, {255, 0, 255, 8}, {255, 0, 255, 13}, {255, 0, 255, 17}, {255, 0, 255, 21}, {255, 0, 255, 25}, {255, 0, 255, 30}, {255, 0, 255, 34}, {255, 0, 255, 38}, {255, 0, 255, 42}, {255, 0, 255, 47}, {255, 0, 255, 51}, {255, 0, 255, 55}, {255, 0, 255, 60}, {255, 0, 255, 64}, {255, 0, 255, 68}, {255, 0, 255, 72}, {255, 0, 255, 77}, {255, 0, 255, 81}, {255, 0, 255, 85}, {255, 0, 255, 89}, {255, 0, 255, 94}, {255, 0, 255, 98}, {255, 0, 255, 102}, {255, 0, 255, 106}, {255, 0, 255, 111}, {255, 0, 255, 115}, {255, 0, 255, 119}, {255, 0, 255, 123}, {255, 0, 255, 128}, {255, 0, 255, 132}, {255, 0, 255, 136}, {255, 0, 255, 140}, {255, 0, 255, 145}, {255, 0, 255, 149}, {255, 0, 255, 153}, {255, 0, 255, 157}, {255, 0, 255, 162}, {255, 0, 255, 166}, {255, 0, 255, 170}, {255, 0, 255, 174}, {255, 0, 255, 179}, {255, 0, 255, 183}, {255, 0, 255, 187}, {255, 0, 255, 191}, {255, 0, 255, 196}, {255, 0, 255, 200}, {255, 0, 255, 204}, {255, 0, 255, 208}, {255, 0, 255, 213}, {255, 0, 255, 217}, {255, 0, 255, 221}, {255, 0, 255, 225}, {255, 0, 255, 230}, {255, 0, 255, 234}, {255, 0, 255, 238}, {255, 0, 255, 242}, {255, 0, 255, 247}, {255, 0, 255, 251}, {255, 0, 255, 255}, {255, 0, 251, 255}, {255, 0, 247, 255}, {255, 0, 242, 255}, {255, 0, 238, 255}, {255, 0, 234, 255}, {255, 0, 230, 255}, {255, 0, 225, 255}, {255, 0, 221, 255}, {255, 0, 217, 255}, {255, 0, 213, 255}, {255, 0, 208, 255}, {255, 0, 204, 255}, {255, 0, 200, 255}, {255, 0, 196, 255}, {255, 0, 191, 255}, {255, 0, 187, 255}, {255, 0, 183, 255}, {255, 0, 179, 255}, {255, 0, 174, 255}, {255, 0, 170, 255}, {255, 0, 166, 255}, {255, 0, 162, 255}, {255, 0, 157, 255}, {255, 0, 153, 255}, {255, 0, 149, 255}, {255, 0, 145, 255}, {255, 0, 140, 255}, {255, 0, 136, 255}, {255, 0, 132, 255}, {255, 0, 128, 255}, {255, 0, 123, 255}, {255, 0, 119, 255}, {255, 0, 115, 255}, {255, 0, 111, 255}, {255, 0, 106, 255}, {255, 0, 102, 255}, {255, 0, 98, 255}, {255, 0, 94, 255}, {255, 0, 89, 255}, {255, 0, 85, 255}, {255, 0, 81, 255}, {255, 0, 77, 255}, {255, 0, 72, 255}, {255, 0, 68, 255}, {255, 0, 64, 255}, {255, 0, 60, 255}, {255, 0, 55, 255}, {255, 0, 51, 255}, {255, 0, 47, 255}, {255, 0, 42, 255}, {255, 0, 38, 255}, {255, 0, 34, 255}, {255, 0, 30, 255}, {255, 0, 25, 255}, {255, 0, 21, 255}, {255, 0, 17, 255}, {255, 0, 13, 255}, {255, 0, 8, 255}, {255, 0, 4, 255}, {255, 0, 0, 255}, {255, 4, 0, 255}, {255, 8, 0, 255}, {255, 13, 0, 255}, {255, 17, 0, 255}, {255, 21, 0, 255}, {255, 25, 0, 255}, {255, 30, 0, 255}, {255, 34, 0, 255}, {255, 38, 0, 255}, {255, 42, 0, 255}, {255, 47, 0, 255}, {255, 51, 0, 255}, {255, 55, 0, 255}, {255, 60, 0, 255}, {255, 64, 0, 255}, {255, 68, 0, 255}, {255, 72, 0, 255}, {255, 77, 0, 255}, {255, 81, 0, 255}, {255, 85, 0, 255}, {255, 89, 0, 255}, {255, 94, 0, 255}, {255, 98, 0, 255}, {255, 102, 0, 255}, {255, 106, 0, 255}, {255, 111, 0, 255}, {255, 115, 0, 255}, {255, 119, 0, 255}, {255, 123, 0, 255}, {255, 128, 0, 255}, {255, 132, 0, 255}, {255, 136, 0, 255}, {255, 140, 0, 255}, {255, 145, 0, 255}, {255, 149, 0, 255}, {255, 153, 0, 255}, {255, 157, 0, 255}, {255, 162, 0, 255}, {255, 166, 0, 255}, {255, 170, 0, 255}, {255, 174, 0, 255}, {255, 179, 0, 255}, {255, 183, 0, 255}, {255, 187, 0, 255}, {255, 191, 0, 255}, {255, 196, 0, 255}, {255, 200, 0, 255}, {255, 204, 0, 255}, {255, 208, 0, 255}, {255, 213, 0, 255}, {255, 217, 0, 255}, {255, 221, 0, 255}, {255, 225, 0, 255}, {255, 230, 0, 255}, {255, 234, 0, 255}, {255, 238, 0, 255}, {255, 242, 0, 255}, {255, 247, 0, 255}, {255, 251, 0, 255}, {255, 255, 0, 255}, {255, 255, 0, 251}, {255, 255, 0, 247}, {255, 255, 0, 242}, {255, 255, 0, 238}, {255, 255, 0, 234}, {255, 255, 0, 230}, {255, 255, 0, 225}, {255, 255, 0, 221}, {255, 255, 0, 217}, {255, 255, 0, 213}, {255, 255, 0, 208}, {255, 255, 0, 204}, {255, 255, 0, 200}, {255, 255, 0, 196}, {255, 255, 0, 191}, {255, 255, 0, 187}, {255, 255, 0, 183}, {255, 255, 0, 179}, {255, 255, 0, 174}, {255, 255, 0, 170}, {255, 255, 0, 166}, {255, 255, 0, 162}, {255, 255, 0, 157}, {255, 255, 0, 153}, {255, 255, 0, 149}, {255, 255, 0, 145}, {255, 255, 0, 140}, {255, 255, 0, 136}, {255, 255, 0, 132}, {255, 255, 0, 128}, {255, 255, 0, 123}, {255, 255, 0, 119}, {255, 255, 0, 115}, {255, 255, 0, 111}, {255, 255, 0, 106}, {255, 255, 0, 102}, {255, 255, 0, 98}, {255, 255, 0, 94}, {255, 255, 0, 89}, {255, 255, 0, 85}, {255, 255, 0, 81}, {255, 255, 0, 77}, {255, 255, 0, 72}, {255, 255, 0, 68}, {255, 255, 0, 64}, {255, 255, 0, 60}, {255, 255, 0, 55}, {255, 255, 0, 51}, {255, 255, 0, 47}, {255, 255, 0, 42}, {255, 255, 0, 38}, {255, 255, 0, 34}, {255, 255, 0, 30}, {255, 255, 0, 25}, {255, 255, 0, 21}, {255, 255, 0, 17}, {255, 255, 0, 13}, {255, 255, 0, 8}, {255, 255, 0, 4} };
    private int currentColor = 0;

    private long score = 0;
    private long highScore = 0;
    private long lastUpdate = 0;

    private long lastSpawn = 0;
    private int spawnRate = 5000;
    private int spawnRateMin = 500;
    private int spawnRateIncrement = 100;
    private double slideSpeed = 100;
    private double slideSpeedMax = 2160;
    private double slideSpeedIncrement = 20;

    private Random random;
    private static String[] parrotTypes = { "Party", "Gilded", "Popcorn", "Sad", "Santa", "Grinch", "Commie", "Fiesta", "Jester", "Gentleman", "Double", "Devil", "Angel", "Science" };
    private static String[] emojiTypes = { "x0023", "x0030", "x0031", "x0032", "x0033", "x0034", "x0035", "x0036", "x0037", "x0038", "x0039", "x00a9", "x00ae", "x1f004", "x1f0cf", "x1f170", "x1f171", "x1f17e", "x1f17f", "x1f18e", "x1f191", "x1f192", "x1f193", "x1f194", "x1f195", "x1f196", "x1f197", "x1f198", "x1f199", "x1f19a", "x1f1e8_1f1f3", "x1f1e9_1f1ea", "x1f1ea_1f1f8", "x1f1eb_1f1f7", "x1f1ec_1f1e7", "x1f1ee_1f1f9", "x1f1ef_1f1f5", "x1f1f0_1f1f7", "x1f1f7_1f1fa", "x1f1fa_1f1f8", "x1f201", "x1f202", "x1f21a", "x1f22f", "x1f232", "x1f233", "x1f234", "x1f235", "x1f236", "x1f237", "x1f238", "x1f239", "x1f23a", "x1f250", "x1f251", "x1f300", "x1f301", "x1f302", "x1f303", "x1f304", "x1f305", "x1f306", "x1f307", "x1f308", "x1f309", "x1f30a", "x1f30b", "x1f30c", "x1f30d", "x1f30e", "x1f30f", "x1f310", "x1f311", "x1f312", "x1f313", "x1f314", "x1f315", "x1f316", "x1f317", "x1f318", "x1f319", "x1f31a", "x1f31b", "x1f31c", "x1f31d", "x1f31e", "x1f31f", "x1f320", "x1f330", "x1f331", "x1f332", "x1f333", "x1f334", "x1f335", "x1f337", "x1f338", "x1f339", "x1f33a", "x1f33b", "x1f33c", "x1f33d", "x1f33e", "x1f33f", "x1f340", "x1f341", "x1f342", "x1f343", "x1f344", "x1f345", "x1f346", "x1f347", "x1f348", "x1f349", "x1f34a", "x1f34b", "x1f34c", "x1f34d", "x1f34e", "x1f34f", "x1f350", "x1f351", "x1f352", "x1f353", "x1f354", "x1f355", "x1f356", "x1f357", "x1f358", "x1f359", "x1f35a", "x1f35b", "x1f35c", "x1f35d", "x1f35e", "x1f35f", "x1f360", "x1f361", "x1f362", "x1f363", "x1f364", "x1f365", "x1f366", "x1f367", "x1f368", "x1f369", "x1f36a", "x1f36b", "x1f36c", "x1f36d", "x1f36e", "x1f36f", "x1f370", "x1f371", "x1f372", "x1f373", "x1f374", "x1f375", "x1f376", "x1f377", "x1f378", "x1f379", "x1f37a", "x1f37b", "x1f37c", "x1f380", "x1f381", "x1f382", "x1f383", "x1f384", "x1f385", "x1f386", "x1f387", "x1f388", "x1f389", "x1f38a", "x1f38b", "x1f38c", "x1f38d", "x1f38e", "x1f38f", "x1f390", "x1f391", "x1f392", "x1f393", "x1f3a0", "x1f3a1", "x1f3a2", "x1f3a3", "x1f3a4", "x1f3a5", "x1f3a6", "x1f3a7", "x1f3a8", "x1f3a9", "x1f3aa", "x1f3ab", "x1f3ac", "x1f3ad", "x1f3ae", "x1f3af", "x1f3b0", "x1f3b1", "x1f3b2", "x1f3b3", "x1f3b4", "x1f3b5", "x1f3b6", "x1f3b7", "x1f3b8", "x1f3b9", "x1f3ba", "x1f3bb", "x1f3bc", "x1f3bd", "x1f3be", "x1f3bf", "x1f3c0", "x1f3c1", "x1f3c2", "x1f3c3", "x1f3c4", "x1f3c6", "x1f3c7", "x1f3c8", "x1f3c9", "x1f3ca", "x1f3e0", "x1f3e1", "x1f3e2", "x1f3e3", "x1f3e4", "x1f3e5", "x1f3e6", "x1f3e7", "x1f3e8", "x1f3e9", "x1f3ea", "x1f3eb", "x1f3ec", "x1f3ed", "x1f3ee", "x1f3ef", "x1f3f0", "x1f400", "x1f401", "x1f402", "x1f403", "x1f404", "x1f405", "x1f406", "x1f407", "x1f408", "x1f409", "x1f40a", "x1f40b", "x1f40c", "x1f40d", "x1f40e", "x1f40f", "x1f410", "x1f411", "x1f412", "x1f413", "x1f414", "x1f415", "x1f416", "x1f417", "x1f418", "x1f419", "x1f41a", "x1f41b", "x1f41c", "x1f41d", "x1f41e", "x1f41f", "x1f420", "x1f421", "x1f422", "x1f423", "x1f424", "x1f425", "x1f426", "x1f427", "x1f428", "x1f429", "x1f42a", "x1f42b", "x1f42c", "x1f42d", "x1f42e", "x1f42f", "x1f430", "x1f431", "x1f432", "x1f433", "x1f434", "x1f435", "x1f436", "x1f437", "x1f438", "x1f439", "x1f43a", "x1f43b", "x1f43c", "x1f43d", "x1f43e", "x1f440", "x1f442", "x1f443", "x1f444", "x1f445", "x1f446", "x1f447", "x1f448", "x1f449", "x1f44a", "x1f44b", "x1f44c", "x1f44d", "x1f44e", "x1f44f", "x1f450", "x1f451", "x1f452", "x1f453", "x1f454", "x1f455", "x1f456", "x1f457", "x1f458", "x1f459", "x1f45a", "x1f45b", "x1f45c", "x1f45d", "x1f45e", "x1f45f", "x1f460", "x1f461", "x1f462", "x1f463", "x1f464", "x1f465", "x1f466", "x1f467", "x1f468", "x1f469", "x1f46a", "x1f46b", "x1f46c", "x1f46d", "x1f46e", "x1f46f", "x1f470", "x1f471", "x1f472", "x1f473", "x1f474", "x1f475", "x1f476", "x1f477", "x1f478", "x1f479", "x1f47a", "x1f47b", "x1f47c", "x1f47d", "x1f47e", "x1f47f", "x1f480", "x1f481", "x1f482", "x1f483", "x1f484", "x1f485", "x1f486", "x1f487", "x1f488", "x1f489", "x1f48a", "x1f48b", "x1f48c", "x1f48d", "x1f48e", "x1f48f", "x1f490", "x1f491", "x1f492", "x1f493", "x1f494", "x1f495", "x1f496", "x1f497", "x1f498", "x1f499", "x1f49a", "x1f49b", "x1f49c", "x1f49d", "x1f49e", "x1f49f", "x1f4a0", "x1f4a1", "x1f4a2", "x1f4a3", "x1f4a4", "x1f4a5", "x1f4a6", "x1f4a7", "x1f4a8", "x1f4a9", "x1f4aa", "x1f4ab", "x1f4ac", "x1f4ad", "x1f4ae", "x1f4af", "x1f4b0", "x1f4b1", "x1f4b2", "x1f4b3", "x1f4b4", "x1f4b5", "x1f4b6", "x1f4b7", "x1f4b8", "x1f4b9", "x1f4ba", "x1f4bb", "x1f4bc", "x1f4bd", "x1f4be", "x1f4bf", "x1f4c0", "x1f4c1", "x1f4c2", "x1f4c3", "x1f4c4", "x1f4c5", "x1f4c6", "x1f4c7", "x1f4c8", "x1f4c9", "x1f4ca", "x1f4cb", "x1f4cc", "x1f4cd", "x1f4ce", "x1f4cf", "x1f4d0", "x1f4d1", "x1f4d2", "x1f4d3", "x1f4d4", "x1f4d5", "x1f4d6", "x1f4d7", "x1f4d8", "x1f4d9", "x1f4da", "x1f4db", "x1f4dc", "x1f4dd", "x1f4de", "x1f4df", "x1f4e0", "x1f4e1", "x1f4e2", "x1f4e3", "x1f4e4", "x1f4e5", "x1f4e6", "x1f4e7", "x1f4e8", "x1f4e9", "x1f4ea", "x1f4eb", "x1f4ec", "x1f4ed", "x1f4ee", "x1f4ef", "x1f4f0", "x1f4f1", "x1f4f2", "x1f4f3", "x1f4f4", "x1f4f5", "x1f4f6", "x1f4f7", "x1f4f9", "x1f4fa", "x1f4fb", "x1f4fc", "x1f500", "x1f501", "x1f502", "x1f503", "x1f504", "x1f505", "x1f506", "x1f507", "x1f508", "x1f509", "x1f50a", "x1f50b", "x1f50c", "x1f50d", "x1f50e", "x1f50f", "x1f510", "x1f511", "x1f512", "x1f513", "x1f514", "x1f515", "x1f516", "x1f517", "x1f518", "x1f519", "x1f51a", "x1f51b", "x1f51c", "x1f51d", "x1f51e", "x1f51f", "x1f520", "x1f521", "x1f522", "x1f523", "x1f524", "x1f525", "x1f526", "x1f527", "x1f528", "x1f529", "x1f52a", "x1f52b", "x1f52c", "x1f52d", "x1f52e", "x1f52f", "x1f530", "x1f531", "x1f532", "x1f533", "x1f534", "x1f535", "x1f536", "x1f537", "x1f538", "x1f539", "x1f53a", "x1f53b", "x1f53c", "x1f53d", "x1f550", "x1f551", "x1f552", "x1f553", "x1f554", "x1f555", "x1f556", "x1f557", "x1f558", "x1f559", "x1f55a", "x1f55b", "x1f55c", "x1f55d", "x1f55e", "x1f55f", "x1f560", "x1f561", "x1f562", "x1f563", "x1f564", "x1f565", "x1f566", "x1f567", "x1f5fb", "x1f5fc", "x1f5fd", "x1f5fe", "x1f5ff", "x1f600", "x1f601", "x1f602", "x1f603", "x1f604", "x1f605", "x1f606", "x1f607", "x1f608", "x1f609", "x1f60a", "x1f60b", "x1f60c", "x1f60d", "x1f60e", "x1f60f", "x1f610", "x1f611", "x1f612", "x1f613", "x1f614", "x1f615", "x1f616", "x1f617", "x1f618", "x1f619", "x1f61a", "x1f61b", "x1f61c", "x1f61d", "x1f61e", "x1f61f", "x1f620", "x1f621", "x1f622", "x1f623", "x1f624", "x1f625", "x1f626", "x1f627", "x1f628", "x1f629", "x1f62a", "x1f62b", "x1f62c", "x1f62d", "x1f62e", "x1f62f", "x1f630", "x1f631", "x1f632", "x1f633", "x1f634", "x1f635", "x1f636", "x1f637", "x1f638", "x1f639", "x1f63a", "x1f63b", "x1f63c", "x1f63d", "x1f63e", "x1f63f", "x1f640", "x1f645", "x1f646", "x1f647", "x1f648", "x1f649", "x1f64a", "x1f64b", "x1f64c", "x1f64d", "x1f64e", "x1f64f", "x1f680", "x1f681", "x1f682", "x1f683", "x1f684", "x1f685", "x1f686", "x1f687", "x1f688", "x1f689", "x1f68a", "x1f68b", "x1f68c", "x1f68d", "x1f68e", "x1f68f", "x1f690", "x1f691", "x1f692", "x1f693", "x1f694", "x1f695", "x1f696", "x1f697", "x1f698", "x1f699", "x1f69a", "x1f69b", "x1f69c", "x1f69d", "x1f69e", "x1f69f", "x1f6a0", "x1f6a1", "x1f6a2", "x1f6a3", "x1f6a4", "x1f6a5", "x1f6a6", "x1f6a7", "x1f6a8", "x1f6a9", "x1f6aa", "x1f6ab", "x1f6ac", "x1f6ad", "x1f6ae", "x1f6af", "x1f6b0", "x1f6b1", "x1f6b2", "x1f6b3", "x1f6b4", "x1f6b5", "x1f6b6", "x1f6b7", "x1f6b8", "x1f6b9", "x1f6ba", "x1f6bb", "x1f6bc", "x1f6bd", "x1f6be", "x1f6bf", "x1f6c0", "x1f6c1", "x1f6c2", "x1f6c3", "x1f6c4", "x1f6c5", "x203c", "x2049", "x2122", "x2139", "x2194", "x2195", "x2196", "x2197", "x2198", "x2199", "x21a9", "x21aa", "x231a", "x231b", "x23e9", "x23ea", "x23eb", "x23ec", "x23f0", "x23f3", "x24c2", "x25aa", "x25ab", "x25b6", "x25c0", "x25fb", "x25fc", "x25fd", "x25fe", "x2600", "x2601", "x260e", "x2611", "x2614", "x2615", "x261d", "x263a", "x2648", "x2649", "x264a", "x264b", "x264c", "x264d", "x264e", "x264f", "x2650", "x2651", "x2652", "x2653", "x2660", "x2663", "x2665", "x2666", "x2668", "x267b", "x267f", "x2693", "x26a0", "x26a1", "x26aa", "x26ab", "x26bd", "x26be", "x26c4", "x26c5", "x26ce", "x26d4", "x26ea", "x26f2", "x26f3", "x26f5", "x26fa", "x26fd", "x2702", "x2705", "x2708", "x2709", "x270a", "x270b", "x270c", "x270f", "x2712", "x2714", "x2716", "x2728", "x2733", "x2734", "x2744", "x2747", "x274c", "x274e", "x2753", "x2754", "x2755", "x2757", "x2764", "x2795", "x2796", "x2797", "x27a1", "x27b0", "x27bf", "x2934", "x2935", "x2b05", "x2b06", "x2b07", "x2b1b", "x2b1c", "x2b50", "x2b55", "x3030", "x303d", "x3297", "x3299" };


    // Controls
    private Bitmap[] restartButton;
    private int restartButtonState = 0;
    private int restartButtonPositionX;
    private int restartButtonPositionY;
    private Bitmap[] jumpButton;
    private int jumpButtonState = 0;
    private int jumpButtonPositionX;
    private int jumpButtonPositionY;
    private Bitmap[] pauseButton;
    private int pauseButtonState = 0;
    private int pauseButtonPositionX;
    private int pauseButtonPositionY;
    private Bitmap[] muteButton;
    private int muteButtonState = 0;
    private int muteButtonPositionX;
    private int muteButtonPositionY;

    private boolean muted = false;

    private volatile boolean isPaused = false;


    // Objects
    private ParrotObject partyParrot;
    private ArrayList<SlideObject> slideObjects;


    // Constructor
    public GameSurface(Context context)  {
        super(context);
        sContext = context;

        // Make Game Surface focusable so it can handle events.
        this.setFocusable(true);

        // Sét callback.
        this.getHolder().addCallback(this);

        startGame();
    }

    private void loadAudio() {
        if (Build.VERSION.SDK_INT >= 21 ) {
            AudioAttributes attributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(attributes)
                    .build();
        } else {
            soundPool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }

        bonusSound = soundPool.load(sContext, R.raw.bonus, 1);
        jumpSound = soundPool.load(sContext, R.raw.jump, 1);
        restartSound = soundPool.load(sContext, R.raw.restart, 1);

        mPlayer = MediaPlayer.create(sContext, R.raw.music);
        mPlayer.setLooping(true);
    }

    private void setControls() {
        // Get display info
        Display display = ((WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        this.displayWidth = size.x;
        this.displayHeight = size.y;
        this.displayScaleX = (double)((double)size.x / (double)1080);
        this.displayScaleY = (double)((double)size.y / (double)1920);

        // Scale images
        Bitmap muteButton0Temp = BitmapFactory.decodeResource(this.getResources(), R.drawable.mute_0);
        Bitmap muteButton1Temp = BitmapFactory.decodeResource(this.getResources(), R.drawable.mute_1);
        muteButton = new Bitmap[] {
                Bitmap.createScaledBitmap(muteButton0Temp, (int)((muteButton0Temp.getWidth() * displayScaleX) / 4), (int)((muteButton0Temp.getHeight() * displayScaleX) / 4), false),
                Bitmap.createScaledBitmap(muteButton1Temp, (int)((muteButton1Temp.getWidth() * displayScaleX) / 4), (int)((muteButton1Temp.getHeight() * displayScaleX) / 4), false)
        };
        Bitmap jumpButton0Temp = BitmapFactory.decodeResource(this.getResources(), R.drawable.button_0);
        Bitmap jumpButton1Temp = BitmapFactory.decodeResource(this.getResources(), R.drawable.button_1);
        jumpButton = new Bitmap[] {
                Bitmap.createScaledBitmap(jumpButton0Temp, (int)((jumpButton0Temp.getWidth() * displayScaleX) / 4), (int)((jumpButton0Temp.getHeight() * displayScaleX) / 4), false),
                Bitmap.createScaledBitmap(jumpButton1Temp, (int)((jumpButton1Temp.getWidth() * displayScaleX) / 4), (int)((jumpButton1Temp.getHeight() * displayScaleX) / 4), false)
        };
        Bitmap restartButton0Temp = BitmapFactory.decodeResource(this.getResources(), R.drawable.restart_0);
        Bitmap restartButton1Temp = BitmapFactory.decodeResource(this.getResources(), R.drawable.restart_1);
        restartButton = new Bitmap[] {
                Bitmap.createScaledBitmap(restartButton0Temp, (int)((restartButton0Temp.getWidth() * displayScaleX) / 4), (int)((restartButton0Temp.getHeight() * displayScaleX) / 4), false),
                Bitmap.createScaledBitmap(restartButton1Temp, (int)((restartButton1Temp.getWidth() * displayScaleX) / 4), (int)((restartButton1Temp.getHeight() * displayScaleX) / 4), false)
        };
        Bitmap pauseButton0Temp = BitmapFactory.decodeResource(this.getResources(), R.drawable.pause_0);
        Bitmap pauseButton1Temp = BitmapFactory.decodeResource(this.getResources(), R.drawable.pause_1);
        pauseButton = new Bitmap[]{
                Bitmap.createScaledBitmap(pauseButton0Temp, (int) ((pauseButton0Temp.getWidth() * displayScaleX) / 4), (int) ((pauseButton0Temp.getHeight() * displayScaleX) / 4), false),
                Bitmap.createScaledBitmap(pauseButton1Temp, (int) ((pauseButton1Temp.getWidth() * displayScaleX) / 4), (int) ((pauseButton1Temp.getHeight() * displayScaleX) / 4), false)
        };

        // Set location
        int controlAreaHeight = displayHeight - displayWidth;

        muteButtonPositionX = 5;
        muteButtonPositionY = displayWidth + (int)((controlAreaHeight / 2) - (muteButton[muteButtonState].getHeight() / 2));
        jumpButtonPositionX = (int)((displayWidth / 2) - (jumpButton[jumpButtonState].getWidth() / 2));
        jumpButtonPositionY = displayWidth + (int)((controlAreaHeight / 2) - (jumpButton[jumpButtonState].getHeight() / 2));
        restartButtonPositionX = displayWidth - restartButton[restartButtonState].getWidth() - 5;
        restartButtonPositionY = displayWidth + 5;
        pauseButtonPositionX = displayWidth - pauseButton[pauseButtonState].getWidth() - 5;
        pauseButtonPositionY = displayHeight - pauseButton[pauseButtonState].getHeight() - 5;
    }

    private void startGame() {
        this.gameThread = null;

        powerManager = (PowerManager)sContext.getSystemService(sContext.POWER_SERVICE);

        loadAudio();
        setControls();

        // Set level
        score = 0;
        spawnRate = 5000;
        lastSpawn = 0;
        lastUpdate = 0;
        slideSpeed = 100;

        // Load high score
        prefs = sContext.getSharedPreferences("PartyParrotSlidePrefs", Context.MODE_PRIVATE);
        highScore = prefs.getLong("highScore", 0);
        muted = prefs.getBoolean("muted", false);
        if (muted) {
            muteButtonState = 0;
        } else {
            muteButtonState = 1;
            mPlayer.start();
        }

        lastDrawTime = System.currentTimeMillis();
        lastUpdate = lastDrawTime;

        slideSpeedMax = displayWidth;
        railTop = (double)200 * displayScaleY;
        railBottom = (double)880 * displayScaleY;

        paint1 = new Paint();
        paint2 = new Paint();
        paint2.setARGB(255, 20, 20, 20);
        paint2.setTextSize(40);

        partyParrot = new ParrotObject(getContext(), "Party", displayScaleX, railTop, railBottom);
        random = new Random(lastDrawTime);
        slideObjects = new ArrayList<SlideObject>();

        isPaused = false;

        this.gameThread = new GameThread(this, sHolder);
        this.gameThread.setRunning(true);
        this.gameThread.start();

        spawn();
    }

    public void update() {
        if (!isPaused) {
            partyParrot.update();

            long thisUpdate = System.currentTimeMillis();
            double movePixels = slideSpeed * (((double)thisUpdate - (double)lastUpdate) / 1000);

            ArrayList<SlideObject> newSlideObjects = new ArrayList<SlideObject>();

            for (SlideObject slideObject: slideObjects) {
                slideObject.move(movePixels);

                if (slideObject.getX() + slideObject.getWidth() < 0) {
                    if (slideObject.getType() == "wall") {
                        score += slideObject.getPoints();
                        updateHighScore();
                    }
                } else {
                    boolean collision = detectCollision(slideObject);
                    if (collision) {
                        if (slideObject.getType() == "wall") {
                            if (!muted) {
                                soundPool.play(restartSound, 0.7f, 0.7f, 2, 0, 1f);
                            }
                            startGame();
                        } else if (slideObject.getType() == "parrot") {
                            // Change parrot type
                            score += slideObject.getPoints();
                            updateHighScore();
                            partyParrot.setType(parrotTypes[random.nextInt(parrotTypes.length)]);
                            if (!muted) {
                                soundPool.play(bonusSound, 0.7f, 0.7f, 2, 0, 1f);
                            }
                        } else {
                            // Emoji bonus points
                            score += slideObject.getPoints();
                            updateHighScore();
                            if (!muted) {
                                soundPool.play(bonusSound, 0.7f, 0.7f, 2, 0, 1f);
                            }
                        }
                    } else {
                        newSlideObjects.add(slideObject);
                    }
                }
            }

            slideObjects.clear();
            slideObjects.addAll(newSlideObjects);

            if ((int)((int)thisUpdate - (int)lastSpawn) >= spawnRate) {
                spawn();
                lastSpawn = thisUpdate;
            }

            lastUpdate = thisUpdate;
        }
    }

    private void spawn() {
        // Top or bottom
        boolean top = random.nextBoolean();

        // What are we spawning
        int spawnType = random.nextInt(100);
        // Parrot
        if (spawnType < 5) {
            double s = (double)64 * displayScaleX;
            double sY = railTop;
            if (!top) {
                sY = railBottom - s;
            }
            SlideObject newSlide = new SlideObject(getContext(), "parrot", (double)displayWidth, sY, s, s, top, 100);
            slideObjects.add(newSlide);
        // Emoji
        } else if (spawnType < 30) {
            double s = (double)64 * displayScaleX;
            double sY = railTop;
            if (!top) {
                sY = railBottom - s;
            }
            SlideObject newSlide = new SlideObject(getContext(), emojiTypes[random.nextInt(emojiTypes.length)], (double)displayWidth, sY, s, s, top, 10);
            slideObjects.add(newSlide);
        // Wall
        } else {
            double w = (double)64 * displayScaleX;
            double h = (railBottom - railTop) / (double)2;
            double sY = railTop;
            if (!top) {
                sY = railBottom - h;
            }
            SlideObject newSlide = new SlideObject(getContext(), "wall", (double)displayWidth, sY, w, h, top, 1);
            slideObjects.add(newSlide);
        }

        // Make it harder
        if (spawnRate > spawnRateMin) {
            spawnRate -= spawnRateIncrement;
        }
        if (slideSpeed < slideSpeedMax) {
            slideSpeed += slideSpeedIncrement;
        }

        lastSpawn = System.currentTimeMillis();
    }

    private boolean detectCollision(SlideObject slideObject) {
        int AMinX = partyParrot.getX();
        int AMaxX = partyParrot.getX() + (int)partyParrot.getWidth();
        int AMinY = partyParrot.getY();
        int AMaxY = partyParrot.getY() + (int)partyParrot.getHeight();

        int BMinX = slideObject.getX();
        int BMaxX = slideObject.getX() + slideObject.getWidth();
        int BMinY = slideObject.getY();
        int BMaxY = slideObject.getY() + slideObject.getHeight();

        if ((AMaxX < BMinX) || (BMaxX < AMinX) || (AMaxY < BMinY) || (BMaxY < AMinY)) {
            return false;
        }

        return true;
    }

    private void updateHighScore() {
        if (score > highScore) {
            prefsEditor = prefs.edit();
            prefsEditor.putLong("highScore", score);
            prefsEditor.apply();
            highScore = score;
        }
    }

    public void pause() {
        isPaused = true;

        if (!muted) {
            mPlayer.pause();
        }
    }
    public void unPause() {
        isPaused = false;

        long currentTime = System.currentTimeMillis();
        long diff = currentTime - lastUpdate;
        lastUpdate = currentTime;
        lastSpawn += diff;

        if (!muted) {
            mPlayer.start();
        }
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);

        // Update color
        if (currentColor < colors.length - 1) {
            currentColor++;
        } else {
            currentColor = 0;
        }
        paint1.setARGB(colors[currentColor][0], colors[currentColor][1], colors[currentColor][2], colors[currentColor][3]);

        // Wipe screen
        canvas.drawColor(paint2.getColor());

        // Draw Controls
        canvas.drawBitmap(muteButton[muteButtonState], muteButtonPositionX, muteButtonPositionY, null);
        canvas.drawBitmap(jumpButton[jumpButtonState], jumpButtonPositionX, jumpButtonPositionY, null);
        canvas.drawBitmap(restartButton[restartButtonState], restartButtonPositionX, restartButtonPositionY, null);
        canvas.drawBitmap(pauseButton[pauseButtonState], pauseButtonPositionX, pauseButtonPositionY, null);


        // Draw PartyParrot
        canvas.drawBitmap(partyParrot.getBitmap(), partyParrot.getX(), partyParrot.getY(), null);

        // Draw Objects
        for (SlideObject slideObject: slideObjects) {
            if (slideObject.getType() == "wall") {
                canvas.drawRect((float)slideObject.getX(), (float)slideObject.getY(), (float)slideObject.getX() + slideObject.getWidth(), slideObject.getY() + slideObject.getHeight(), paint1);
            } else {
                canvas.drawBitmap(slideObject.getBitmap(), slideObject.getX(), slideObject.getY(), null);
            }
        }

        // Draw rails
        canvas.drawRect(0, 0, displayWidth, (int)railTop, paint1);
        canvas.drawRect(0, (int)railBottom, displayWidth, (int)(1080 * displayScaleY), paint1);

        // Draw Score
        canvas.drawText("Score: " + score, 5, 50, paint2);
        canvas.drawText("High: " + highScore, 5, 100, paint2);

        // Update clock
        long thisTime = System.currentTimeMillis();
        fpsLastUpdated++;
        if (fpsLastUpdated > 30) {
            fps = (int)((double)(1000 / ((double)thisTime - (double)lastDrawTime)));
            fpsLastUpdated = 0;
        }
        lastDrawTime = thisTime;

        // Draw FPS
        canvas.drawText("FPS: " + fps, 5, (float)((float)1080 * (float)displayScaleY) - (float)5, paint2);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN) {

            int x = (int)event.getX();
            int y = (int)event.getY();

            // Mute
            if (x >= muteButtonPositionX && x <= (muteButtonPositionX + muteButton[muteButtonState].getWidth()) && y >= muteButtonPositionY && y <= (muteButtonPositionY + muteButton[muteButtonState].getHeight())) {
                if (muteButtonState == 1) {
                    muteButtonState = 0;
                    muted = true;
                    prefsEditor = prefs.edit();
                    prefsEditor.putBoolean("muted", true);
                    prefsEditor.apply();
                    mPlayer.pause();
                } else {
                    muteButtonState = 1;
                    muted = false;
                    prefsEditor = prefs.edit();
                    prefsEditor.putBoolean("muted", false);
                    prefsEditor.apply();
                    mPlayer.start();
                }

                return true;
            }

            // Jump
            if (x >= jumpButtonPositionX && x <= (int)(jumpButtonPositionX + jumpButton[jumpButtonState].getWidth()) && y >= jumpButtonPositionY && y <= (int)(jumpButtonPositionY + jumpButton[jumpButtonState].getHeight())) {
                jumpButtonState = 1;
                if (!partyParrot.jumping()) {
                    partyParrot.jump();
                    if (!muted) {
                        soundPool.play(jumpSound, 0.7f, 0.7f, 2, 0, 1f);
                    }
                }

                return true;
            }

            // Restart
            if (x >= restartButtonPositionX && x <= (int)(restartButtonPositionX + restartButton[restartButtonState].getWidth()) && y >= restartButtonPositionY && y <= (int)(restartButtonPositionY + restartButton[restartButtonState].getHeight())) {
                restartButtonState = 1;
                startGame();

                return true;
            }

            // Pause
            if (x >= pauseButtonPositionX && x <= (int)(pauseButtonPositionX + pauseButton[pauseButtonState].getWidth()) && y >= pauseButtonPositionY && y <= (int)(pauseButtonPositionY + pauseButton[pauseButtonState].getHeight())) {
                pauseButtonState = 1;
                if (isPaused) {
                    unPause();
                } else {
                    pause();
                }

                return true;
            }

            return true;
        }

        if (event.getAction() == MotionEvent.ACTION_UP) {
            jumpButtonState = 0;
            restartButtonState = 0;
            pauseButtonState = 0;

            return true;
        }

        return false;
    }

    // Implements method of SurfaceHolder.Callback
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        this.sHolder = holder;
        startGame();
    }

    // Implements method of SurfaceHolder.Callback
    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {
        this.sHolder = holder;
    }

    // Implements method of SurfaceHolder.Callback
    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        this.sHolder = holder;
        soundPool.release();
        soundPool = null;
        mPlayer.stop();

        boolean retry = true;
        while (retry) {
            try {
                this.gameThread.setRunning(false);
                // Parent thread must wait until the end of GameThread.
                this.gameThread.join();
                retry = false;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
