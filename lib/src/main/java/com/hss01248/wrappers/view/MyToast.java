package com.hss01248.wrappers.view;

import android.app.Application;
import android.os.Handler;
import android.support.annotation.NonNull;

import com.hss01248.toast.ToastFinal;


/**
 * Created by Administrator on 2016/9/9 0009.
 */
public class MyToast {

    public static void init(@NonNull Application context, @NonNull Handler mainHandler, boolean isDebugMode,boolean isUseCustomToast){
        ToastFinal.init(context,mainHandler,isDebugMode,isUseCustomToast);
    }

    public static void show(String text){
       ToastFinal.show(text);
    }

    public static void cancel() {
       ToastFinal.cancel();
    }

    public static void showDebug(final String text) {
        ToastFinal.showDebug(text);
    }

    public static void showLong(final String text) {
        ToastFinal.showLong(text);
    }


    public static void showSuccess(String text){
       ToastFinal.showSuccess(text);
    }

    public static void showFail(String text){
        ToastFinal.showFail(text);
    }
}
