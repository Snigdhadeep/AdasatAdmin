package com.phibasis.adasat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.webkit.WebView;
public class MainActivity extends AppCompatActivity {
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview=(WebView)findViewById(R.id.web);


        webview.loadUrl("http://104.236.11.215/web");

}
}