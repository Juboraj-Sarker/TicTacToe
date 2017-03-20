package com.juboraj_sarker.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class HomeScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/1870308434");
        AdView mAdView = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("2BA46C54FD47FD80CBBAD95AE0F70E1A").build();
        mAdView.loadAd(adRequest);



    }



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_for_all, menu);


        return true;
    }


    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(HomeScreenActivity.this, AboutMeActivity.class);
        startActivity(about_me);
    }




    public void singlePlayerScreen(View view) {


        startActivity(new Intent(HomeScreenActivity.this, SinglePlayerActivity.class));
    }

    public void multiPlayerScreen(View view) {

        startActivity(new Intent(HomeScreenActivity.this, MultiPlayerActivity.class));
    }
}
