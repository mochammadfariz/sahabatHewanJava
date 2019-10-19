package com.fariz.sahabathewan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView webViewKu;
    WebSettings websettingku;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webViewKu = (WebView) findViewById(R.id.webView1);
        websettingku = webViewKu.getSettings();
        websettingku.setJavaScriptEnabled(true);
        webViewKu.setWebViewClient(new WebViewClient());
        webViewKu.loadUrl("https://sahabathewan.com/");
    }
}
