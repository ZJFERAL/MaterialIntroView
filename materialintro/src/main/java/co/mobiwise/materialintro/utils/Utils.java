package co.mobiwise.materialintro.utils;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/**
 * Created by mertsimsek on 29/01/16.
 */
public class Utils {

    public static int pxToDp(int px) {
        return (int) (px / Resources.getSystem().getDisplayMetrics().density);
    }

    public static int dpToPx(int dp) {
        return (int) (dp * Resources.getSystem().getDisplayMetrics().density);
    }

    /**
     * 获取屏幕的宽度（单位：px）
     *
     * @return 屏幕宽px
     */
    public static int getScreenWidth(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();// 创建了一张白纸
        windowManager.getDefaultDisplay().getMetrics(dm);// 给白纸设置宽高
        return dm.widthPixels;
    }

    /**
     * 获取屏幕的高度（单位：px）
     *
     * @return 屏幕高px
     */
    public static int getScreenHeight(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        DisplayMetrics dm = new DisplayMetrics();// 创建了一张白纸
        windowManager.getDefaultDisplay().getMetrics(dm);// 给白纸设置宽高
        return dm.heightPixels;
    }

    public static double getLeftWidth(Context context) {
        int screenWidth = getScreenWidth(context);
        if (weightEquals(context)) {
            return screenWidth / 3.0;
        } else {
            return screenWidth * 3.0 / 10;
        }
    }

    public static boolean weightEquals(Context context) {
        int screenWidth = getScreenWidth(context);
        int screenHeight = getScreenHeight(context);
        double v = screenWidth * 1.0 / screenHeight;
        return v >= 1.5;
    }


    public static double getVirtualWidth(Context context){
        int screenWidth = getScreenWidth(context);
        if (weightEquals(context)) {
            return screenWidth / 3.0;
        } else {
            return screenWidth * 4.0 / 10;
        }
    }
}
