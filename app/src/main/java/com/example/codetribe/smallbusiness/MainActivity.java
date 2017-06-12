package com.example.codetribe.smallbusiness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
public class MainActivity extends AppCompatActivity {
    private WebView browser;
    private WebView browser2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        browser = (WebView)findViewById(R.id.webView1);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.loadUrl("file:///android_asset/customer/index.html");

        browser2 = (WebView)findViewById(R.id.webView2);
        browser2.getSettings().setJavaScriptEnabled(true);
        browser2.loadUrl("file:///android_asset/WorkingHours.html");
    }
}
