package com.juboraj_sarker.tictactoe.activity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.juboraj_sarker.tictactoe.R;

import java.io.File;

public class DifficultySelectionScreenActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;


    Button btnEasy;
    Button btnNormal;
    Button btnHard;
    Button btnImpossible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty_selection_screen);

        btnEasy = (Button)findViewById(R.id.btnEasy);
        btnNormal = (Button)findViewById(R.id.btnNormal);
        btnHard = (Button)findViewById(R.id.btnHard);
        btnImpossible = (Button)findViewById(R.id.btnImpossible);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/7040061742");
        AdView mAdView = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build();
        mAdView.loadAd(adRequest);



        btnEasy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mInterstitialAd = new InterstitialAd(DifficultySelectionScreenActivity.this);
                mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen1));

                AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build();
                mInterstitialAd.loadAd(adRequest);

                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        showInterstitial();
                    }
                });


                activityStart(1);
            }
        });


        btnNormal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mInterstitialAd = new InterstitialAd(DifficultySelectionScreenActivity.this);
                mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen1));

                AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build();
                mInterstitialAd.loadAd(adRequest);

                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        showInterstitial();
                    }
                });

                activityStart(2);
            }
        });


        btnHard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mInterstitialAd = new InterstitialAd(DifficultySelectionScreenActivity.this);
                mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen1));

                AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build();
                mInterstitialAd.loadAd(adRequest);

                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        showInterstitial();
                    }
                });

                activityStart(3);
            }
        });



        btnImpossible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mInterstitialAd = new InterstitialAd(DifficultySelectionScreenActivity.this);
                mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen1));

                AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build();
                mInterstitialAd.loadAd(adRequest);

                mInterstitialAd.setAdListener(new AdListener() {
                    public void onAdLoaded() {
                        showInterstitial();
                    }
                });

                activityStart(4);
            }
        });

    }

    void activityStart(int option){
        Intent i = new Intent(getApplicationContext(),GameScreenActivity.class);
        i.putExtra("option",option);
        startActivity(i);
    }



    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home, menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }



    public void rate(MenuItem item) {


        rateApp();
    }

    public void share(MenuItem item) {

        ApplicationInfo app = getApplicationContext().getApplicationInfo();
        String filePath = app.sourceDir;
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("*/*");
        intent.createChooser(intent,"Tic Tac Toe");
        intent.putExtra(Intent.EXTRA_STREAM, Uri.fromFile(new File(filePath)));
        startActivity(Intent.createChooser(intent, "share Tic Tac Toe using"));

    }

    public void more(MenuItem item) {

        Intent intent;
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/apps/dev?id=6155570899607409709&hl"));
        startActivity(intent);
    }


    public void about (MenuItem item) {

        startActivity(new Intent(DifficultySelectionScreenActivity.this, AboutMeActivity.class));
    }


    public void rateApp() {
        try
        {
            Intent rateIntent = rateIntentForUrl("market://details");
            startActivity(rateIntent);
        }
        catch (ActivityNotFoundException e)
        {
            Intent rateIntent = rateIntentForUrl("https://play.google.com/store/apps/details");
            startActivity(rateIntent);
        }
    }

    private Intent rateIntentForUrl(String url)
    {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(String.format("%s?id=%s", url, getPackageName())));
        int flags = Intent.FLAG_ACTIVITY_NO_HISTORY | Intent.FLAG_ACTIVITY_MULTIPLE_TASK;
        if (Build.VERSION.SDK_INT >= 21)
        {
            flags |= Intent.FLAG_ACTIVITY_NEW_DOCUMENT;
        }
        else
        {
            //noinspection deprecation
            flags |= Intent.FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET;
        }
        intent.addFlags(flags);
        return intent;
    }

}
