package com.hss01248.wrappers;

/**
 * https://github.com/nbsp-team/MaterialFilePicker
 * Created by Administrator on 2016/8/19 0019.
 *
 * repositories {
 maven {
 url  "http://dl.bintray.com/lukaville/maven"
 }
 }

 dependencies {
 compile 'com.nbsp:library:1.1'
 }
 */
public class FilePickUtils {

   /* private static final int REQUEST_FILE = 1;

    public static void pick(Activity activity){
        new MaterialFilePicker()
                .withActivity(activity)
                .withRequestCode(REQUEST_FILE)
                .withFilter(Pattern.compile(".*\\.txt$")) // Filtering files and directories by file name using regexp
                .withFilterDirectories(true) // Set directories filterable (false by default)
                .withHiddenFiles(true) // Show hidden files and folders
                .start();
    }

    public static void onActivityResult(int requestCode, int resultCode, Intent data,FilePickHandler filePickHandler){
        if (requestCode == 1 && resultCode == Activity.RESULT_OK) {
            String filePath = data.getStringExtra(FilePickerActivity.RESULT_FILE_PATH);
            // Do anything with file
            if (!TextUtils.isEmpty(filePath) && new File(filePath).exists()){
                filePickHandler.onSuccess(filePath);
            }else {
                filePickHandler.onFail();
            }
        }

    }*/

    interface  FilePickHandler{
        void onSuccess(String filePath);
        void onFail();
    }


}
