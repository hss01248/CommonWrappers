package com.hss01248.wrappers.webview;

import android.webkit.DownloadListener;


/**
 * Created by Administrator on 2016/4/21 0021.
 */
public class MyWebViewDownloader implements DownloadListener {
    @Override
    public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
/*
        MyToast.show("文件大小："+ FileUtils.convertFileSize(contentLength)+ ",开始下载");
        String name = URLUtil.guessFileName(url,contentDisposition,mimetype);
        Logger.e("url:"+ url +"  --filename:"+ name+ "  --contentDisposition:"+ contentDisposition + " --mimetype:"+ mimetype +
                "--contentlength:"+ contentLength +"  --userangent:"+ userAgent);
        MyDownloader.downloadFromWebview(url,name, new MyNetListener() {
            @Override
            public void onSuccess(Object response, String optStr) {
                MyToast.showToast("文件已保存到"+ optStr);
            }

            @Override
            public void onError(String error) {
                super.onError(error);
                MyToast.showToast(error);
            }
        });*/

    }
}
