package com.hss01248.wrappers.photo;

import android.app.Activity;
import android.content.Intent;

import java.util.ArrayList;

import me.iwf.photopicker.PhotoPickUtils;
import me.iwf.photopicker.widget.MultiPickResultView;

/**
 *
 * https://github.com/glassLake/PhotoPicker
 *
 * 使用完全封装好的组件

 xml:

 <me.iwf.photopicker.widget.MultiPickResultView
 android:layout_width="match_parent"
 android:layout_height="wrap_content"
 android:id="@+id/recycler_view"/>
 选择图片并显示图片:

 recyclerView = (MultiPickResultView) findViewById(R.id.recycler_view);
 recyclerView.init(this,MultiPickResultView.ACTION_SELECT,null);

 //onActivityResult里一行代码回调
 recyclerView.onActivityResult(requestCode,resultCode,data);
 只显示图片

 //可以初始化时传入地址
 recyclerViewShowOnly.init(this,MultiPickResultView.ACTION_ONLY_SHOW,pathslook);

 //也可以后续设置地址:
 recyclerViewShowOnly.showPics(pathslook);
 *
 *
 * Created by Administrator on 2016/9/23 0023.
 */
public class PicPicker {

    //单纯使用选择图片功能

    public static void startPick(Activity context){
        PhotoPickUtils.startPick(context,new ArrayList<String>());
    }


    public static  void onActivityResult(int requestCode, int resultCode, Intent data, final PhotoPickCallBack handler){
        PhotoPickUtils.onActivityResult(requestCode, resultCode, data, new PhotoPickUtils.PickHandler() {
            @Override
            public void onPickSuccess(ArrayList<String> photos) {
                handler.onPickSuccess(photos);
            }

            @Override
            public void onPreviewBack(ArrayList<String> photos) {
                handler.onPreviewBack(photos);
            }

            @Override
            public void onPickFail(String error) {
                handler.onPickFail(error);
            }

            @Override
            public void onPickCancle() {
                handler.onPickCancle();
            }
        });
    }


   public abstract class PhotoPickCallBack{
      public  abstract void onPickSuccess(ArrayList<String> photos);
      public   void onPreviewBack(ArrayList<String> photos){}
       public  abstract  void onPickFail(String error);
       public  abstract  void onPickCancle();

    }


    //使用封装好的组件
    public static void initViewOfSelect(MultiPickResultView pickResultView,Activity activity){
        pickResultView.init(activity,MultiPickResultView.ACTION_SELECT,null);
    }

    public static  void onActivityResultOfSelect(int requestCode, int resultCode, Intent data,MultiPickResultView pickResultView){
        pickResultView.onActivityResult(requestCode,resultCode,data);
    }



    public static void initViewOfShow(MultiPickResultView pickResultView, Activity activity, ArrayList<String> photos){
        pickResultView.init(activity,MultiPickResultView.ACTION_ONLY_SHOW,photos);
    }






}
