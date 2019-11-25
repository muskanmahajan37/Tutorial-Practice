package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.webView);
        String customHtml = "<html><body><h1>Hey There</h1>" +
                "<h2>I'm Thrishna</h2><h3>I'm an android developer</h3>" +
                "<p>I'm making a static html web page by android with java</p>" +
                "</body></html>";
        webView.loadData(customHtml, "text/html", "UTF-8");
    }
}
