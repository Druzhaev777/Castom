package com.example.manual2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;



public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        WebView webView = findViewById(R.id.webView);

        int position = getIntent().getExtras().getInt("title");

        if (position == 0) {
            webView.loadUrl("https://www.transfermarkt.world/real-madrid/startseite/verein/418");
        }
        if (position == 1) {
            webView.loadUrl("https://www.transfermarkt.world/fc-chelsea/startseite/verein/631");

        }
        if (position == 2) {
            webView.loadUrl("https://www.transfermarkt.world/fc-barcelona/startseite/verein/131");

        }
        if (position == 3) {
            webView.loadUrl("https://www.transfermarkt.world/manchester-city/startseite/verein/281");

        }
        if (position == 4) {
            webView.loadUrl("https://www.transfermarkt.world/fc-liverpool/startseite/verein/31");

        }
        if (position == 5) {
            webView.loadUrl("https://www.transfermarkt.world/fc-bayern-munchen/startseite/verein/27");

        }
    }

}