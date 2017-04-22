package com.example.xiaomei.androidlab_mybrowser;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class aty_my_browser extends AppCompatActivity {





            private WebView web;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_aty_my_browser);

                web= (WebView) findViewById(R.id.webView);

                web.loadUrl("http://www.baidu.com");
    }
}
