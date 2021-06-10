package com.example.htmlcompilersm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.TextView;

public class webView_html extends AppCompatActivity {

    TextView receive;
    String html;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view_html);

        /*receive = (TextView)findViewById(R.id.textView);

        receive.setText(getIntent().getStringExtra("EdiTtEXTvALUE"));*/
        html = getIntent().getStringExtra("EdiTtEXTvALUE");
        // initiate a web view
        WebView webView = (WebView) findViewById(R.id.wbeview);
        // static html string data
                String customHtml = html;
        // load static html data on a web view
                webView.loadData(customHtml, "text/html", "UTF-8");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

    }

    public void returntoHTML(View view) {
        //navigateUpTo(new Intent(getBaseContext(), MainActivity.class));
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("EdiTtEXTvALUE", html);
        startActivity(intent);

    }
}