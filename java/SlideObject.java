package korbendallas.partyparrotslide;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;


public class SlideObject {

    private Context context;
    private String objectType;
    private double x;
    private double y;
    private double objectWidth;
    private double objectHeight;
    private int objectPoints;
    private Bitmap objectBitmap;
    private boolean isOnTop = false;

    public SlideObject(Context context, String type, double startX, double startY, double width, double height, boolean onTop, int points) {
        this.context = context;
        this.objectType = type;
        this.x = startX;
        this.y = startY;
        this.objectHeight = height;
        this.objectWidth = width;
        this.isOnTop = onTop;
        this.objectPoints = points;

        if (objectType != "wall") {
            generateObject();
        }
    }

    private void generateObject() {
        Bitmap tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.party_01);
        switch (objectType) {
            case "x0023":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0023);
                break;
            case "x0030":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0030);
                break;
            case "x0031":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0031);
                break;
            case "x0032":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0032);
                break;
            case "x0033":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0033);
                break;
            case "x0034":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0034);
                break;
            case "x0035":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0035);
                break;
            case "x0036":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0036);
                break;
            case "x0037":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0037);
                break;
            case "x0038":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0038);
                break;
            case "x0039":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x0039);
                break;
            case "x00a9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x00a9);
                break;
            case "x00ae":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x00ae);
                break;
            case "x1f004":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f004);
                break;
            case "x1f0cf":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f0cf);
                break;
            case "x1f170":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f170);
                break;
            case "x1f171":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f171);
                break;
            case "x1f17e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f17e);
                break;
            case "x1f17f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f17f);
                break;
            case "x1f18e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f18e);
                break;
            case "x1f191":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f191);
                break;
            case "x1f192":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f192);
                break;
            case "x1f193":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f193);
                break;
            case "x1f194":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f194);
                break;
            case "x1f195":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f195);
                break;
            case "x1f196":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f196);
                break;
            case "x1f197":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f197);
                break;
            case "x1f198":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f198);
                break;
            case "x1f199":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f199);
                break;
            case "x1f19a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f19a);
                break;
            case "x1f1e8_1f1f3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1e8_1f1f3);
                break;
            case "x1f1e9_1f1ea":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1e9_1f1ea);
                break;
            case "x1f1ea_1f1f8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1ea_1f1f8);
                break;
            case "x1f1eb_1f1f7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1eb_1f1f7);
                break;
            case "x1f1ec_1f1e7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1ec_1f1e7);
                break;
            case "x1f1ee_1f1f9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1ee_1f1f9);
                break;
            case "x1f1ef_1f1f5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1ef_1f1f5);
                break;
            case "x1f1f0_1f1f7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1f0_1f1f7);
                break;
            case "x1f1f7_1f1fa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1f7_1f1fa);
                break;
            case "x1f1fa_1f1f8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f1fa_1f1f8);
                break;
            case "x1f201":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f201);
                break;
            case "x1f202":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f202);
                break;
            case "x1f21a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f21a);
                break;
            case "x1f22f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f22f);
                break;
            case "x1f232":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f232);
                break;
            case "x1f233":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f233);
                break;
            case "x1f234":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f234);
                break;
            case "x1f235":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f235);
                break;
            case "x1f236":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f236);
                break;
            case "x1f237":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f237);
                break;
            case "x1f238":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f238);
                break;
            case "x1f239":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f239);
                break;
            case "x1f23a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f23a);
                break;
            case "x1f250":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f250);
                break;
            case "x1f251":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f251);
                break;
            case "x1f300":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f300);
                break;
            case "x1f301":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f301);
                break;
            case "x1f302":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f302);
                break;
            case "x1f303":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f303);
                break;
            case "x1f304":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f304);
                break;
            case "x1f305":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f305);
                break;
            case "x1f306":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f306);
                break;
            case "x1f307":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f307);
                break;
            case "x1f308":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f308);
                break;
            case "x1f309":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f309);
                break;
            case "x1f30a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f30a);
                break;
            case "x1f30b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f30b);
                break;
            case "x1f30c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f30c);
                break;
            case "x1f30d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f30d);
                break;
            case "x1f30e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f30e);
                break;
            case "x1f30f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f30f);
                break;
            case "x1f310":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f310);
                break;
            case "x1f311":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f311);
                break;
            case "x1f312":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f312);
                break;
            case "x1f313":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f313);
                break;
            case "x1f314":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f314);
                break;
            case "x1f315":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f315);
                break;
            case "x1f316":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f316);
                break;
            case "x1f317":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f317);
                break;
            case "x1f318":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f318);
                break;
            case "x1f319":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f319);
                break;
            case "x1f31a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f31a);
                break;
            case "x1f31b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f31b);
                break;
            case "x1f31c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f31c);
                break;
            case "x1f31d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f31d);
                break;
            case "x1f31e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f31e);
                break;
            case "x1f31f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f31f);
                break;
            case "x1f320":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f320);
                break;
            case "x1f330":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f330);
                break;
            case "x1f331":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f331);
                break;
            case "x1f332":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f332);
                break;
            case "x1f333":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f333);
                break;
            case "x1f334":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f334);
                break;
            case "x1f335":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f335);
                break;
            case "x1f337":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f337);
                break;
            case "x1f338":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f338);
                break;
            case "x1f339":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f339);
                break;
            case "x1f33a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f33a);
                break;
            case "x1f33b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f33b);
                break;
            case "x1f33c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f33c);
                break;
            case "x1f33d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f33d);
                break;
            case "x1f33e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f33e);
                break;
            case "x1f33f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f33f);
                break;
            case "x1f340":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f340);
                break;
            case "x1f341":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f341);
                break;
            case "x1f342":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f342);
                break;
            case "x1f343":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f343);
                break;
            case "x1f344":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f344);
                break;
            case "x1f345":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f345);
                break;
            case "x1f346":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f346);
                break;
            case "x1f347":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f347);
                break;
            case "x1f348":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f348);
                break;
            case "x1f349":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f349);
                break;
            case "x1f34a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f34a);
                break;
            case "x1f34b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f34b);
                break;
            case "x1f34c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f34c);
                break;
            case "x1f34d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f34d);
                break;
            case "x1f34e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f34e);
                break;
            case "x1f34f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f34f);
                break;
            case "x1f350":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f350);
                break;
            case "x1f351":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f351);
                break;
            case "x1f352":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f352);
                break;
            case "x1f353":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f353);
                break;
            case "x1f354":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f354);
                break;
            case "x1f355":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f355);
                break;
            case "x1f356":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f356);
                break;
            case "x1f357":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f357);
                break;
            case "x1f358":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f358);
                break;
            case "x1f359":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f359);
                break;
            case "x1f35a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f35a);
                break;
            case "x1f35b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f35b);
                break;
            case "x1f35c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f35c);
                break;
            case "x1f35d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f35d);
                break;
            case "x1f35e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f35e);
                break;
            case "x1f35f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f35f);
                break;
            case "x1f360":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f360);
                break;
            case "x1f361":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f361);
                break;
            case "x1f362":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f362);
                break;
            case "x1f363":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f363);
                break;
            case "x1f364":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f364);
                break;
            case "x1f365":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f365);
                break;
            case "x1f366":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f366);
                break;
            case "x1f367":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f367);
                break;
            case "x1f368":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f368);
                break;
            case "x1f369":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f369);
                break;
            case "x1f36a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f36a);
                break;
            case "x1f36b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f36b);
                break;
            case "x1f36c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f36c);
                break;
            case "x1f36d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f36d);
                break;
            case "x1f36e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f36e);
                break;
            case "x1f36f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f36f);
                break;
            case "x1f370":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f370);
                break;
            case "x1f371":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f371);
                break;
            case "x1f372":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f372);
                break;
            case "x1f373":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f373);
                break;
            case "x1f374":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f374);
                break;
            case "x1f375":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f375);
                break;
            case "x1f376":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f376);
                break;
            case "x1f377":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f377);
                break;
            case "x1f378":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f378);
                break;
            case "x1f379":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f379);
                break;
            case "x1f37a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f37a);
                break;
            case "x1f37b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f37b);
                break;
            case "x1f37c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f37c);
                break;
            case "x1f380":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f380);
                break;
            case "x1f381":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f381);
                break;
            case "x1f382":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f382);
                break;
            case "x1f383":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f383);
                break;
            case "x1f384":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f384);
                break;
            case "x1f385":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f385);
                break;
            case "x1f386":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f386);
                break;
            case "x1f387":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f387);
                break;
            case "x1f388":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f388);
                break;
            case "x1f389":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f389);
                break;
            case "x1f38a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f38a);
                break;
            case "x1f38b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f38b);
                break;
            case "x1f38c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f38c);
                break;
            case "x1f38d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f38d);
                break;
            case "x1f38e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f38e);
                break;
            case "x1f38f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f38f);
                break;
            case "x1f390":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f390);
                break;
            case "x1f391":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f391);
                break;
            case "x1f392":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f392);
                break;
            case "x1f393":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f393);
                break;
            case "x1f3a0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a0);
                break;
            case "x1f3a1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a1);
                break;
            case "x1f3a2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a2);
                break;
            case "x1f3a3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a3);
                break;
            case "x1f3a4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a4);
                break;
            case "x1f3a5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a5);
                break;
            case "x1f3a6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a6);
                break;
            case "x1f3a7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a7);
                break;
            case "x1f3a8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a8);
                break;
            case "x1f3a9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3a9);
                break;
            case "x1f3aa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3aa);
                break;
            case "x1f3ab":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ab);
                break;
            case "x1f3ac":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ac);
                break;
            case "x1f3ad":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ad);
                break;
            case "x1f3ae":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ae);
                break;
            case "x1f3af":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3af);
                break;
            case "x1f3b0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b0);
                break;
            case "x1f3b1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b1);
                break;
            case "x1f3b2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b2);
                break;
            case "x1f3b3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b3);
                break;
            case "x1f3b4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b4);
                break;
            case "x1f3b5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b5);
                break;
            case "x1f3b6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b6);
                break;
            case "x1f3b7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b7);
                break;
            case "x1f3b8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b8);
                break;
            case "x1f3b9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3b9);
                break;
            case "x1f3ba":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ba);
                break;
            case "x1f3bb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3bb);
                break;
            case "x1f3bc":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3bc);
                break;
            case "x1f3bd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3bd);
                break;
            case "x1f3be":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3be);
                break;
            case "x1f3bf":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3bf);
                break;
            case "x1f3c0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c0);
                break;
            case "x1f3c1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c1);
                break;
            case "x1f3c2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c2);
                break;
            case "x1f3c3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c3);
                break;
            case "x1f3c4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c4);
                break;
            case "x1f3c6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c6);
                break;
            case "x1f3c7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c7);
                break;
            case "x1f3c8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c8);
                break;
            case "x1f3c9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3c9);
                break;
            case "x1f3ca":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ca);
                break;
            case "x1f3e0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e0);
                break;
            case "x1f3e1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e1);
                break;
            case "x1f3e2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e2);
                break;
            case "x1f3e3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e3);
                break;
            case "x1f3e4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e4);
                break;
            case "x1f3e5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e5);
                break;
            case "x1f3e6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e6);
                break;
            case "x1f3e7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e7);
                break;
            case "x1f3e8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e8);
                break;
            case "x1f3e9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3e9);
                break;
            case "x1f3ea":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ea);
                break;
            case "x1f3eb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3eb);
                break;
            case "x1f3ec":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ec);
                break;
            case "x1f3ed":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ed);
                break;
            case "x1f3ee":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ee);
                break;
            case "x1f3ef":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3ef);
                break;
            case "x1f3f0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f3f0);
                break;
            case "x1f400":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f400);
                break;
            case "x1f401":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f401);
                break;
            case "x1f402":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f402);
                break;
            case "x1f403":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f403);
                break;
            case "x1f404":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f404);
                break;
            case "x1f405":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f405);
                break;
            case "x1f406":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f406);
                break;
            case "x1f407":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f407);
                break;
            case "x1f408":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f408);
                break;
            case "x1f409":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f409);
                break;
            case "x1f40a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f40a);
                break;
            case "x1f40b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f40b);
                break;
            case "x1f40c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f40c);
                break;
            case "x1f40d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f40d);
                break;
            case "x1f40e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f40e);
                break;
            case "x1f40f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f40f);
                break;
            case "x1f410":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f410);
                break;
            case "x1f411":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f411);
                break;
            case "x1f412":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f412);
                break;
            case "x1f413":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f413);
                break;
            case "x1f414":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f414);
                break;
            case "x1f415":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f415);
                break;
            case "x1f416":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f416);
                break;
            case "x1f417":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f417);
                break;
            case "x1f418":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f418);
                break;
            case "x1f419":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f419);
                break;
            case "x1f41a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f41a);
                break;
            case "x1f41b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f41b);
                break;
            case "x1f41c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f41c);
                break;
            case "x1f41d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f41d);
                break;
            case "x1f41e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f41e);
                break;
            case "x1f41f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f41f);
                break;
            case "x1f420":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f420);
                break;
            case "x1f421":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f421);
                break;
            case "x1f422":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f422);
                break;
            case "x1f423":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f423);
                break;
            case "x1f424":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f424);
                break;
            case "x1f425":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f425);
                break;
            case "x1f426":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f426);
                break;
            case "x1f427":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f427);
                break;
            case "x1f428":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f428);
                break;
            case "x1f429":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f429);
                break;
            case "x1f42a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f42a);
                break;
            case "x1f42b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f42b);
                break;
            case "x1f42c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f42c);
                break;
            case "x1f42d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f42d);
                break;
            case "x1f42e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f42e);
                break;
            case "x1f42f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f42f);
                break;
            case "x1f430":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f430);
                break;
            case "x1f431":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f431);
                break;
            case "x1f432":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f432);
                break;
            case "x1f433":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f433);
                break;
            case "x1f434":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f434);
                break;
            case "x1f435":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f435);
                break;
            case "x1f436":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f436);
                break;
            case "x1f437":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f437);
                break;
            case "x1f438":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f438);
                break;
            case "x1f439":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f439);
                break;
            case "x1f43a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f43a);
                break;
            case "x1f43b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f43b);
                break;
            case "x1f43c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f43c);
                break;
            case "x1f43d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f43d);
                break;
            case "x1f43e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f43e);
                break;
            case "x1f440":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f440);
                break;
            case "x1f442":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f442);
                break;
            case "x1f443":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f443);
                break;
            case "x1f444":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f444);
                break;
            case "x1f445":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f445);
                break;
            case "x1f446":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f446);
                break;
            case "x1f447":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f447);
                break;
            case "x1f448":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f448);
                break;
            case "x1f449":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f449);
                break;
            case "x1f44a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f44a);
                break;
            case "x1f44b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f44b);
                break;
            case "x1f44c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f44c);
                break;
            case "x1f44d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f44d);
                break;
            case "x1f44e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f44e);
                break;
            case "x1f44f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f44f);
                break;
            case "x1f450":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f450);
                break;
            case "x1f451":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f451);
                break;
            case "x1f452":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f452);
                break;
            case "x1f453":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f453);
                break;
            case "x1f454":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f454);
                break;
            case "x1f455":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f455);
                break;
            case "x1f456":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f456);
                break;
            case "x1f457":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f457);
                break;
            case "x1f458":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f458);
                break;
            case "x1f459":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f459);
                break;
            case "x1f45a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f45a);
                break;
            case "x1f45b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f45b);
                break;
            case "x1f45c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f45c);
                break;
            case "x1f45d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f45d);
                break;
            case "x1f45e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f45e);
                break;
            case "x1f45f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f45f);
                break;
            case "x1f460":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f460);
                break;
            case "x1f461":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f461);
                break;
            case "x1f462":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f462);
                break;
            case "x1f463":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f463);
                break;
            case "x1f464":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f464);
                break;
            case "x1f465":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f465);
                break;
            case "x1f466":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f466);
                break;
            case "x1f467":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f467);
                break;
            case "x1f468":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f468);
                break;
            case "x1f469":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f469);
                break;
            case "x1f46a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f46a);
                break;
            case "x1f46b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f46b);
                break;
            case "x1f46c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f46c);
                break;
            case "x1f46d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f46d);
                break;
            case "x1f46e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f46e);
                break;
            case "x1f46f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f46f);
                break;
            case "x1f470":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f470);
                break;
            case "x1f471":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f471);
                break;
            case "x1f472":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f472);
                break;
            case "x1f473":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f473);
                break;
            case "x1f474":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f474);
                break;
            case "x1f475":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f475);
                break;
            case "x1f476":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f476);
                break;
            case "x1f477":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f477);
                break;
            case "x1f478":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f478);
                break;
            case "x1f479":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f479);
                break;
            case "x1f47a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f47a);
                break;
            case "x1f47b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f47b);
                break;
            case "x1f47c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f47c);
                break;
            case "x1f47d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f47d);
                break;
            case "x1f47e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f47e);
                break;
            case "x1f47f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f47f);
                break;
            case "x1f480":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f480);
                break;
            case "x1f481":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f481);
                break;
            case "x1f482":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f482);
                break;
            case "x1f483":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f483);
                break;
            case "x1f484":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f484);
                break;
            case "x1f485":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f485);
                break;
            case "x1f486":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f486);
                break;
            case "x1f487":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f487);
                break;
            case "x1f488":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f488);
                break;
            case "x1f489":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f489);
                break;
            case "x1f48a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f48a);
                break;
            case "x1f48b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f48b);
                break;
            case "x1f48c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f48c);
                break;
            case "x1f48d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f48d);
                break;
            case "x1f48e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f48e);
                break;
            case "x1f48f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f48f);
                break;
            case "x1f490":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f490);
                break;
            case "x1f491":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f491);
                break;
            case "x1f492":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f492);
                break;
            case "x1f493":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f493);
                break;
            case "x1f494":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f494);
                break;
            case "x1f495":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f495);
                break;
            case "x1f496":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f496);
                break;
            case "x1f497":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f497);
                break;
            case "x1f498":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f498);
                break;
            case "x1f499":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f499);
                break;
            case "x1f49a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f49a);
                break;
            case "x1f49b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f49b);
                break;
            case "x1f49c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f49c);
                break;
            case "x1f49d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f49d);
                break;
            case "x1f49e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f49e);
                break;
            case "x1f49f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f49f);
                break;
            case "x1f4a0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a0);
                break;
            case "x1f4a1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a1);
                break;
            case "x1f4a2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a2);
                break;
            case "x1f4a3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a3);
                break;
            case "x1f4a4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a4);
                break;
            case "x1f4a5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a5);
                break;
            case "x1f4a6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a6);
                break;
            case "x1f4a7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a7);
                break;
            case "x1f4a8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a8);
                break;
            case "x1f4a9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4a9);
                break;
            case "x1f4aa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4aa);
                break;
            case "x1f4ab":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ab);
                break;
            case "x1f4ac":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ac);
                break;
            case "x1f4ad":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ad);
                break;
            case "x1f4ae":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ae);
                break;
            case "x1f4af":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4af);
                break;
            case "x1f4b0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b0);
                break;
            case "x1f4b1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b1);
                break;
            case "x1f4b2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b2);
                break;
            case "x1f4b3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b3);
                break;
            case "x1f4b4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b4);
                break;
            case "x1f4b5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b5);
                break;
            case "x1f4b6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b6);
                break;
            case "x1f4b7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b7);
                break;
            case "x1f4b8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b8);
                break;
            case "x1f4b9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4b9);
                break;
            case "x1f4ba":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ba);
                break;
            case "x1f4bb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4bb);
                break;
            case "x1f4bc":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4bc);
                break;
            case "x1f4bd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4bd);
                break;
            case "x1f4be":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4be);
                break;
            case "x1f4bf":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4bf);
                break;
            case "x1f4c0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c0);
                break;
            case "x1f4c1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c1);
                break;
            case "x1f4c2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c2);
                break;
            case "x1f4c3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c3);
                break;
            case "x1f4c4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c4);
                break;
            case "x1f4c5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c5);
                break;
            case "x1f4c6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c6);
                break;
            case "x1f4c7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c7);
                break;
            case "x1f4c8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c8);
                break;
            case "x1f4c9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4c9);
                break;
            case "x1f4ca":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ca);
                break;
            case "x1f4cb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4cb);
                break;
            case "x1f4cc":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4cc);
                break;
            case "x1f4cd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4cd);
                break;
            case "x1f4ce":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ce);
                break;
            case "x1f4cf":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4cf);
                break;
            case "x1f4d0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d0);
                break;
            case "x1f4d1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d1);
                break;
            case "x1f4d2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d2);
                break;
            case "x1f4d3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d3);
                break;
            case "x1f4d4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d4);
                break;
            case "x1f4d5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d5);
                break;
            case "x1f4d6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d6);
                break;
            case "x1f4d7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d7);
                break;
            case "x1f4d8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d8);
                break;
            case "x1f4d9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4d9);
                break;
            case "x1f4da":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4da);
                break;
            case "x1f4db":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4db);
                break;
            case "x1f4dc":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4dc);
                break;
            case "x1f4dd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4dd);
                break;
            case "x1f4de":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4de);
                break;
            case "x1f4df":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4df);
                break;
            case "x1f4e0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e0);
                break;
            case "x1f4e1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e1);
                break;
            case "x1f4e2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e2);
                break;
            case "x1f4e3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e3);
                break;
            case "x1f4e4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e4);
                break;
            case "x1f4e5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e5);
                break;
            case "x1f4e6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e6);
                break;
            case "x1f4e7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e7);
                break;
            case "x1f4e8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e8);
                break;
            case "x1f4e9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4e9);
                break;
            case "x1f4ea":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ea);
                break;
            case "x1f4eb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4eb);
                break;
            case "x1f4ec":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ec);
                break;
            case "x1f4ed":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ed);
                break;
            case "x1f4ee":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ee);
                break;
            case "x1f4ef":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4ef);
                break;
            case "x1f4f0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f0);
                break;
            case "x1f4f1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f1);
                break;
            case "x1f4f2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f2);
                break;
            case "x1f4f3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f3);
                break;
            case "x1f4f4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f4);
                break;
            case "x1f4f5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f5);
                break;
            case "x1f4f6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f6);
                break;
            case "x1f4f7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f7);
                break;
            case "x1f4f9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4f9);
                break;
            case "x1f4fa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4fa);
                break;
            case "x1f4fb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4fb);
                break;
            case "x1f4fc":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f4fc);
                break;
            case "x1f500":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f500);
                break;
            case "x1f501":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f501);
                break;
            case "x1f502":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f502);
                break;
            case "x1f503":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f503);
                break;
            case "x1f504":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f504);
                break;
            case "x1f505":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f505);
                break;
            case "x1f506":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f506);
                break;
            case "x1f507":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f507);
                break;
            case "x1f508":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f508);
                break;
            case "x1f509":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f509);
                break;
            case "x1f50a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f50a);
                break;
            case "x1f50b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f50b);
                break;
            case "x1f50c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f50c);
                break;
            case "x1f50d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f50d);
                break;
            case "x1f50e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f50e);
                break;
            case "x1f50f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f50f);
                break;
            case "x1f510":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f510);
                break;
            case "x1f511":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f511);
                break;
            case "x1f512":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f512);
                break;
            case "x1f513":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f513);
                break;
            case "x1f514":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f514);
                break;
            case "x1f515":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f515);
                break;
            case "x1f516":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f516);
                break;
            case "x1f517":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f517);
                break;
            case "x1f518":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f518);
                break;
            case "x1f519":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f519);
                break;
            case "x1f51a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f51a);
                break;
            case "x1f51b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f51b);
                break;
            case "x1f51c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f51c);
                break;
            case "x1f51d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f51d);
                break;
            case "x1f51e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f51e);
                break;
            case "x1f51f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f51f);
                break;
            case "x1f520":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f520);
                break;
            case "x1f521":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f521);
                break;
            case "x1f522":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f522);
                break;
            case "x1f523":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f523);
                break;
            case "x1f524":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f524);
                break;
            case "x1f525":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f525);
                break;
            case "x1f526":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f526);
                break;
            case "x1f527":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f527);
                break;
            case "x1f528":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f528);
                break;
            case "x1f529":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f529);
                break;
            case "x1f52a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f52a);
                break;
            case "x1f52b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f52b);
                break;
            case "x1f52c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f52c);
                break;
            case "x1f52d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f52d);
                break;
            case "x1f52e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f52e);
                break;
            case "x1f52f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f52f);
                break;
            case "x1f530":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f530);
                break;
            case "x1f531":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f531);
                break;
            case "x1f532":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f532);
                break;
            case "x1f533":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f533);
                break;
            case "x1f534":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f534);
                break;
            case "x1f535":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f535);
                break;
            case "x1f536":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f536);
                break;
            case "x1f537":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f537);
                break;
            case "x1f538":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f538);
                break;
            case "x1f539":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f539);
                break;
            case "x1f53a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f53a);
                break;
            case "x1f53b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f53b);
                break;
            case "x1f53c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f53c);
                break;
            case "x1f53d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f53d);
                break;
            case "x1f550":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f550);
                break;
            case "x1f551":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f551);
                break;
            case "x1f552":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f552);
                break;
            case "x1f553":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f553);
                break;
            case "x1f554":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f554);
                break;
            case "x1f555":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f555);
                break;
            case "x1f556":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f556);
                break;
            case "x1f557":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f557);
                break;
            case "x1f558":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f558);
                break;
            case "x1f559":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f559);
                break;
            case "x1f55a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f55a);
                break;
            case "x1f55b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f55b);
                break;
            case "x1f55c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f55c);
                break;
            case "x1f55d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f55d);
                break;
            case "x1f55e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f55e);
                break;
            case "x1f55f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f55f);
                break;
            case "x1f560":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f560);
                break;
            case "x1f561":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f561);
                break;
            case "x1f562":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f562);
                break;
            case "x1f563":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f563);
                break;
            case "x1f564":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f564);
                break;
            case "x1f565":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f565);
                break;
            case "x1f566":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f566);
                break;
            case "x1f567":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f567);
                break;
            case "x1f5fb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f5fb);
                break;
            case "x1f5fc":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f5fc);
                break;
            case "x1f5fd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f5fd);
                break;
            case "x1f5fe":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f5fe);
                break;
            case "x1f5ff":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f5ff);
                break;
            case "x1f600":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f600);
                break;
            case "x1f601":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f601);
                break;
            case "x1f602":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f602);
                break;
            case "x1f603":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f603);
                break;
            case "x1f604":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f604);
                break;
            case "x1f605":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f605);
                break;
            case "x1f606":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f606);
                break;
            case "x1f607":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f607);
                break;
            case "x1f608":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f608);
                break;
            case "x1f609":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f609);
                break;
            case "x1f60a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f60a);
                break;
            case "x1f60b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f60b);
                break;
            case "x1f60c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f60c);
                break;
            case "x1f60d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f60d);
                break;
            case "x1f60e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f60e);
                break;
            case "x1f60f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f60f);
                break;
            case "x1f610":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f610);
                break;
            case "x1f611":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f611);
                break;
            case "x1f612":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f612);
                break;
            case "x1f613":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f613);
                break;
            case "x1f614":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f614);
                break;
            case "x1f615":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f615);
                break;
            case "x1f616":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f616);
                break;
            case "x1f617":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f617);
                break;
            case "x1f618":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f618);
                break;
            case "x1f619":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f619);
                break;
            case "x1f61a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f61a);
                break;
            case "x1f61b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f61b);
                break;
            case "x1f61c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f61c);
                break;
            case "x1f61d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f61d);
                break;
            case "x1f61e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f61e);
                break;
            case "x1f61f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f61f);
                break;
            case "x1f620":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f620);
                break;
            case "x1f621":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f621);
                break;
            case "x1f622":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f622);
                break;
            case "x1f623":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f623);
                break;
            case "x1f624":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f624);
                break;
            case "x1f625":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f625);
                break;
            case "x1f626":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f626);
                break;
            case "x1f627":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f627);
                break;
            case "x1f628":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f628);
                break;
            case "x1f629":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f629);
                break;
            case "x1f62a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f62a);
                break;
            case "x1f62b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f62b);
                break;
            case "x1f62c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f62c);
                break;
            case "x1f62d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f62d);
                break;
            case "x1f62e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f62e);
                break;
            case "x1f62f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f62f);
                break;
            case "x1f630":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f630);
                break;
            case "x1f631":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f631);
                break;
            case "x1f632":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f632);
                break;
            case "x1f633":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f633);
                break;
            case "x1f634":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f634);
                break;
            case "x1f635":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f635);
                break;
            case "x1f636":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f636);
                break;
            case "x1f637":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f637);
                break;
            case "x1f638":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f638);
                break;
            case "x1f639":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f639);
                break;
            case "x1f63a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f63a);
                break;
            case "x1f63b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f63b);
                break;
            case "x1f63c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f63c);
                break;
            case "x1f63d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f63d);
                break;
            case "x1f63e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f63e);
                break;
            case "x1f63f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f63f);
                break;
            case "x1f640":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f640);
                break;
            case "x1f645":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f645);
                break;
            case "x1f646":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f646);
                break;
            case "x1f647":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f647);
                break;
            case "x1f648":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f648);
                break;
            case "x1f649":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f649);
                break;
            case "x1f64a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f64a);
                break;
            case "x1f64b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f64b);
                break;
            case "x1f64c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f64c);
                break;
            case "x1f64d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f64d);
                break;
            case "x1f64e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f64e);
                break;
            case "x1f64f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f64f);
                break;
            case "x1f680":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f680);
                break;
            case "x1f681":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f681);
                break;
            case "x1f682":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f682);
                break;
            case "x1f683":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f683);
                break;
            case "x1f684":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f684);
                break;
            case "x1f685":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f685);
                break;
            case "x1f686":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f686);
                break;
            case "x1f687":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f687);
                break;
            case "x1f688":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f688);
                break;
            case "x1f689":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f689);
                break;
            case "x1f68a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f68a);
                break;
            case "x1f68b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f68b);
                break;
            case "x1f68c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f68c);
                break;
            case "x1f68d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f68d);
                break;
            case "x1f68e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f68e);
                break;
            case "x1f68f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f68f);
                break;
            case "x1f690":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f690);
                break;
            case "x1f691":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f691);
                break;
            case "x1f692":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f692);
                break;
            case "x1f693":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f693);
                break;
            case "x1f694":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f694);
                break;
            case "x1f695":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f695);
                break;
            case "x1f696":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f696);
                break;
            case "x1f697":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f697);
                break;
            case "x1f698":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f698);
                break;
            case "x1f699":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f699);
                break;
            case "x1f69a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f69a);
                break;
            case "x1f69b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f69b);
                break;
            case "x1f69c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f69c);
                break;
            case "x1f69d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f69d);
                break;
            case "x1f69e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f69e);
                break;
            case "x1f69f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f69f);
                break;
            case "x1f6a0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a0);
                break;
            case "x1f6a1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a1);
                break;
            case "x1f6a2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a2);
                break;
            case "x1f6a3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a3);
                break;
            case "x1f6a4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a4);
                break;
            case "x1f6a5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a5);
                break;
            case "x1f6a6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a6);
                break;
            case "x1f6a7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a7);
                break;
            case "x1f6a8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a8);
                break;
            case "x1f6a9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6a9);
                break;
            case "x1f6aa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6aa);
                break;
            case "x1f6ab":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6ab);
                break;
            case "x1f6ac":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6ac);
                break;
            case "x1f6ad":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6ad);
                break;
            case "x1f6ae":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6ae);
                break;
            case "x1f6af":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6af);
                break;
            case "x1f6b0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b0);
                break;
            case "x1f6b1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b1);
                break;
            case "x1f6b2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b2);
                break;
            case "x1f6b3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b3);
                break;
            case "x1f6b4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b4);
                break;
            case "x1f6b5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b5);
                break;
            case "x1f6b6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b6);
                break;
            case "x1f6b7":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b7);
                break;
            case "x1f6b8":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b8);
                break;
            case "x1f6b9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6b9);
                break;
            case "x1f6ba":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6ba);
                break;
            case "x1f6bb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6bb);
                break;
            case "x1f6bc":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6bc);
                break;
            case "x1f6bd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6bd);
                break;
            case "x1f6be":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6be);
                break;
            case "x1f6bf":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6bf);
                break;
            case "x1f6c0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6c0);
                break;
            case "x1f6c1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6c1);
                break;
            case "x1f6c2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6c2);
                break;
            case "x1f6c3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6c3);
                break;
            case "x1f6c4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6c4);
                break;
            case "x1f6c5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x1f6c5);
                break;
            case "x203c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x203c);
                break;
            case "x2049":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2049);
                break;
            case "x2122":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2122);
                break;
            case "x2139":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2139);
                break;
            case "x2194":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2194);
                break;
            case "x2195":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2195);
                break;
            case "x2196":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2196);
                break;
            case "x2197":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2197);
                break;
            case "x2198":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2198);
                break;
            case "x2199":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2199);
                break;
            case "x21a9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x21a9);
                break;
            case "x21aa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x21aa);
                break;
            case "x231a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x231a);
                break;
            case "x231b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x231b);
                break;
            case "x23e9":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x23e9);
                break;
            case "x23ea":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x23ea);
                break;
            case "x23eb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x23eb);
                break;
            case "x23ec":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x23ec);
                break;
            case "x23f0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x23f0);
                break;
            case "x23f3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x23f3);
                break;
            case "x24c2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x24c2);
                break;
            case "x25aa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x25aa);
                break;
            case "x25ab":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x25ab);
                break;
            case "x25b6":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x25b6);
                break;
            case "x25c0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x25c0);
                break;
            case "x25fb":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x25fb);
                break;
            case "x25fc":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x25fc);
                break;
            case "x25fd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x25fd);
                break;
            case "x25fe":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x25fe);
                break;
            case "x2600":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2600);
                break;
            case "x2601":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2601);
                break;
            case "x260e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x260e);
                break;
            case "x2611":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2611);
                break;
            case "x2614":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2614);
                break;
            case "x2615":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2615);
                break;
            case "x261d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x261d);
                break;
            case "x263a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x263a);
                break;
            case "x2648":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2648);
                break;
            case "x2649":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2649);
                break;
            case "x264a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x264a);
                break;
            case "x264b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x264b);
                break;
            case "x264c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x264c);
                break;
            case "x264d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x264d);
                break;
            case "x264e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x264e);
                break;
            case "x264f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x264f);
                break;
            case "x2650":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2650);
                break;
            case "x2651":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2651);
                break;
            case "x2652":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2652);
                break;
            case "x2653":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2653);
                break;
            case "x2660":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2660);
                break;
            case "x2663":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2663);
                break;
            case "x2665":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2665);
                break;
            case "x2666":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2666);
                break;
            case "x2668":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2668);
                break;
            case "x267b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x267b);
                break;
            case "x267f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x267f);
                break;
            case "x2693":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2693);
                break;
            case "x26a0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26a0);
                break;
            case "x26a1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26a1);
                break;
            case "x26aa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26aa);
                break;
            case "x26ab":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26ab);
                break;
            case "x26bd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26bd);
                break;
            case "x26be":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26be);
                break;
            case "x26c4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26c4);
                break;
            case "x26c5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26c5);
                break;
            case "x26ce":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26ce);
                break;
            case "x26d4":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26d4);
                break;
            case "x26ea":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26ea);
                break;
            case "x26f2":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26f2);
                break;
            case "x26f3":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26f3);
                break;
            case "x26f5":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26f5);
                break;
            case "x26fa":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26fa);
                break;
            case "x26fd":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x26fd);
                break;
            case "x2702":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2702);
                break;
            case "x2705":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2705);
                break;
            case "x2708":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2708);
                break;
            case "x2709":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2709);
                break;
            case "x270a":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x270a);
                break;
            case "x270b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x270b);
                break;
            case "x270c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x270c);
                break;
            case "x270f":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x270f);
                break;
            case "x2712":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2712);
                break;
            case "x2714":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2714);
                break;
            case "x2716":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2716);
                break;
            case "x2728":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2728);
                break;
            case "x2733":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2733);
                break;
            case "x2734":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2734);
                break;
            case "x2744":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2744);
                break;
            case "x2747":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2747);
                break;
            case "x274c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x274c);
                break;
            case "x274e":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x274e);
                break;
            case "x2753":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2753);
                break;
            case "x2754":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2754);
                break;
            case "x2755":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2755);
                break;
            case "x2757":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2757);
                break;
            case "x2764":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2764);
                break;
            case "x2795":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2795);
                break;
            case "x2796":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2796);
                break;
            case "x2797":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2797);
                break;
            case "x27a1":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x27a1);
                break;
            case "x27b0":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x27b0);
                break;
            case "x27bf":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x27bf);
                break;
            case "x2934":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2934);
                break;
            case "x2935":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2935);
                break;
            case "x2b05":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2b05);
                break;
            case "x2b06":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2b06);
                break;
            case "x2b07":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2b07);
                break;
            case "x2b1b":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2b1b);
                break;
            case "x2b1c":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2b1c);
                break;
            case "x2b50":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2b50);
                break;
            case "x2b55":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x2b55);
                break;
            case "x3030":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x3030);
                break;
            case "x303d":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x303d);
                break;
            case "x3297":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x3297);
                break;
            case "x3299":
                tempBitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.x3299);
                break;
        }

        // Scale
        objectBitmap = Bitmap.createScaledBitmap(tempBitmap, (int)objectWidth, (int)objectHeight, false);

        // Rotate
        if (isOnTop) {
            Matrix matrix = new Matrix();
            matrix.postRotate((float) 180);
            objectBitmap = Bitmap.createBitmap(objectBitmap, 0, 0, objectBitmap.getWidth(), objectBitmap.getHeight(), matrix, true);
        }
    }

    public void move(double moveX) {
        x-=moveX;
    }

    public String getType() {
        return objectType;
    }
    public int getX() {
        return (int)x;
    }
    public int getY() {
        return (int)y;
    }
    public int getHeight() {
        return (int)objectHeight;
    }
    public int getWidth() {
        return (int)objectWidth;
    }
    public int getPoints() {
        return objectPoints;
    }
    public Bitmap getBitmap() {
        return objectBitmap;
    }
}
