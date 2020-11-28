package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebViewActivity extends AppCompatActivity {
private WebView mWvMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        mWvMain=findViewById(R.id.WV_wv);
        mWvMain.getSettings().setJavaScriptEnabled(true);
        mWvMain.loadUrl("https://www.zhihu.com/");

    }
}