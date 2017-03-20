package com.juboraj_sarker.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import java.util.Random;

public class SinglePlayerActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;

    Button btn_s1, btn_s2, btn_s3, btn_s4, btn_s5, btn_s6, btn_s7, btn_s8, btn_s9;



    Boolean btn_s1_clicked = false, btn_s2_clicked = false, btn_s3_clicked = false,
            btn_s4_clicked = false, btn_s5_clicked = false, btn_s6_clicked = false,
            btn_s7_clicked = false, btn_s8_clicked = false, btn_s9_clicked = false;

    String s1 = "", s2 = "", s3 = "", s4 = "", s5 = "", s6 = "", s7 = "", s8 = "", s9 = "";

    Handler mHandler = new Handler();



    Random r = new Random();

    int min = 1;
    int max = 9;
    int random_value;
    int random_value2;

    String play_mode = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_player);


        btn_s1 = (Button) findViewById(R.id.btn_s1);
        btn_s2 = (Button) findViewById(R.id.btn_s2);
        btn_s3 = (Button) findViewById(R.id.btn_s3);
        btn_s4 = (Button) findViewById(R.id.btn_s4);
        btn_s5 = (Button) findViewById(R.id.btn_s5);
        btn_s6 = (Button) findViewById(R.id.btn_s6);
        btn_s7 = (Button) findViewById(R.id.btn_s7);
        btn_s8 = (Button) findViewById(R.id.btn_s8);
        btn_s9 = (Button) findViewById(R.id.btn_s9);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.interstitial_full_screen1));

        AdRequest adRequest = new AdRequest.Builder().addTestDevice("2BA46C54FD47FD80CBBAD95AE0F70E1A").build();
        mInterstitialAd.loadAd(adRequest);

        mInterstitialAd.setAdListener(new AdListener() {
            public void onAdLoaded() {
                showInterstitial();
            }
        });



    }


    private void showInterstitial() {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        }
    }



    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.home, menu);
        inflater.inflate(R.menu.menu_for_all, menu);


        return true;
    }


    public void aboutMe(MenuItem item) {

        Intent about_me = new Intent(SinglePlayerActivity.this, AboutMeActivity.class);
        startActivity(about_me);
    }

    public void home(MenuItem item) {

        Intent homeIntent = new Intent(SinglePlayerActivity.this, HomeScreenActivity.class);
        startActivity(homeIntent);
    }





    public void click_single(View view) {


        switch (view.getId()) {


            case R.id.btn_s1: {


                if (btn_s1_clicked == true) {

                    break;
                } else {


                    btn_s1.setText("X");
                    btn_s1.setTextSize(50);
                    btn_s1_clicked = true;
                    s1 = "X";

                    if (s1.equals(s2) && s1.equals(s3)) {


                        Toast.makeText(this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();

                        btn_s1.setBackgroundResource(R.drawable.new_round_button);
                        btn_s2.setBackgroundResource(R.drawable.new_round_button);
                        btn_s3.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s1.equals(s4) && s1.equals(s7)) {


                        Toast.makeText(this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s1.setBackgroundResource(R.drawable.new_round_button);
                        btn_s4.setBackgroundResource(R.drawable.new_round_button);
                        btn_s7.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s1.equals(s5) && s1.equals(s9)) {


                        Toast.makeText(this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s1.setBackgroundResource(R.drawable.new_round_button);
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    if (btn_s5_clicked = false){


                        btn_s1.setText("X");
                        btn_s1.setTextSize(50);
                        btn_s1_clicked = true;
                        s1 = "X";



                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);


                }


                break;

            }


            case R.id.btn_s2: {


                if (btn_s2_clicked == true) {

                    break;
                } else {


                    btn_s2.setText("X");
                    btn_s2.setTextSize(50);
                    btn_s2_clicked = true;
                    s2 = "X";


                    if (s2.equals(s1) && s2.equals(s3)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s2.setBackgroundResource(R.drawable.new_round_button);
                        btn_s1.setBackgroundResource(R.drawable.new_round_button);
                        btn_s3.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s2.equals(s5) && s2.equals(s8)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s2.setBackgroundResource(R.drawable.new_round_button);
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s8.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);


                }


                break;

            }

            case R.id.btn_s3: {


                if (btn_s3_clicked == true) {

                    break;

                } else {


                    btn_s3.setText("X");
                    btn_s3.setTextSize(50);
                    btn_s3_clicked = true;
                    s3 = "X";


                    if (s3.equals(s2) && s3.equals(s1)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s3.setBackgroundResource(R.drawable.new_round_button);
                        btn_s2.setBackgroundResource(R.drawable.new_round_button);
                        btn_s1.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s3.equals(s6) && s3.equals(s9)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s3.setBackgroundResource(R.drawable.new_round_button);
                        btn_s6.setBackgroundResource(R.drawable.new_round_button);
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s3.equals(s5) && s3.equals(s7)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s3.setBackgroundResource(R.drawable.new_round_button);
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s7.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);





                }


                break;
            }


            case R.id.btn_s4: {


                if (btn_s4_clicked == true) {

                    break;
                } else {


                    btn_s4.setText("X");
                    btn_s4.setTextSize(50);
                    btn_s4_clicked = true;
                    s4 = "X";

                    if (s4.equals(s1) && s4.equals(s7)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s4.setBackgroundResource(R.drawable.new_round_button);
                        btn_s1.setBackgroundResource(R.drawable.new_round_button);
                        btn_s7.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s4.equals(s5) && s4.equals(s6)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s4.setBackgroundResource(R.drawable.new_round_button);
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s6.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);





                }


                break;
            }


            case R.id.btn_s5: {


                if (btn_s5_clicked == true) {

                    break;
                } else {


                    btn_s5.setText("X");
                    btn_s5.setTextSize(50);
                    btn_s5_clicked = true;
                    s5 = "X";


                    if (s5.equals(s4) && s5.equals(s6)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s4.setBackgroundResource(R.drawable.new_round_button);
                        btn_s6.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s5.equals(s2) && s5.equals(s8)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s2.setBackgroundResource(R.drawable.new_round_button);
                        btn_s8.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s5.equals(s1) && s5.equals(s9)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s1.setBackgroundResource(R.drawable.new_round_button);
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);




                }


                break;

            }


            case R.id.btn_s6: {


                if (btn_s6_clicked == true) {

                    break;
                } else {


                    btn_s6.setText("X");
                    btn_s6.setTextSize(50);
                    btn_s6_clicked = true;
                    s6 = "X";

                    if (s6.equals(s3) && s6.equals(s9)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s6.setBackgroundResource(R.drawable.new_round_button);
                        btn_s3.setBackgroundResource(R.drawable.new_round_button);
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s6.equals(s5) && s6.equals(s4)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s6.setBackgroundResource(R.drawable.new_round_button);
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s4.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);




                }


                break;
            }


            case R.id.btn_s7: {


                if (btn_s7_clicked == true) {

                    break;
                } else {


                    btn_s7.setText("X");
                    btn_s7.setTextSize(50);
                    btn_s7_clicked = true;
                    s7 = "X";

                    if (s7.equals(s4) && s7.equals(s1)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s7.setBackgroundResource(R.drawable.new_round_button);
                        btn_s4.setBackgroundResource(R.drawable.new_round_button);
                        btn_s1.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s7.equals(s8) && s7.equals(s9)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s7.setBackgroundResource(R.drawable.new_round_button);
                        btn_s8.setBackgroundResource(R.drawable.new_round_button);
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s7.equals(s5) && s7.equals(s3)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s7.setBackgroundResource(R.drawable.new_round_button);
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s3.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);




                }


                break;
            }


            case R.id.btn_s8: {


                if (btn_s8_clicked == true) {

                    break;
                } else {


                    btn_s8.setText("X");
                    btn_s8.setTextSize(50);
                    btn_s8_clicked = true;
                    s8 = "X";


                    if (s8.equals(s5) && s8.equals(s2)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s8.setBackgroundResource(R.drawable.new_round_button);
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s2.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s8.equals(s7) && s1.equals(s9)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s8.setBackgroundResource(R.drawable.new_round_button);
                        btn_s7.setBackgroundResource(R.drawable.new_round_button);
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);




                }


                break;
            }


            case R.id.btn_s9: {


                if (btn_s9_clicked == true) {

                    break;
                } else {


                    btn_s9.setText("X");
                    btn_s9.setTextSize(50);
                    btn_s9_clicked = true;
                    s9 = "X";

                    if (s9.equals(s8) && s9.equals(s7)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);
                        btn_s8.setBackgroundResource(R.drawable.new_round_button);
                        btn_s7.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s9.equals(s6) && s9.equals(s3)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);
                        btn_s6.setBackgroundResource(R.drawable.new_round_button);
                        btn_s3.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    } else if (s9.equals(s5) && s9.equals(s1)) {


                        Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                        btn_s9.setBackgroundResource(R.drawable.new_round_button);
                        btn_s5.setBackgroundResource(R.drawable.new_round_button);
                        btn_s1.setBackgroundResource(R.drawable.new_round_button);

                        btn_s1_clicked = true;
                        btn_s2_clicked = true;
                        btn_s3_clicked = true;
                        btn_s4_clicked = true;
                        btn_s5_clicked = true;
                        btn_s6_clicked = true;
                        btn_s7_clicked = true;
                        btn_s8_clicked = true;
                        btn_s9_clicked = true;


                        s1 = "";
                        s2 = "";
                        s3 = "";
                        s4 = "";
                        s5 = "";
                        s6 = "";
                        s7 = "";
                        s8 = "";
                        s9 = "";


                    }

                    mHandler.postDelayed(mUpdateTimeTask, 1800);



                }

                break;

            }


        }


    }


    private Runnable mUpdateTimeTask = new Runnable() {
        public void run() {
            // do what you need to do here after the delay


            if (btn_s1_clicked == true && btn_s2_clicked == true && btn_s3_clicked == true && btn_s4_clicked == true &&
                    btn_s5_clicked == true && btn_s6_clicked == true && btn_s7_clicked == true && btn_s8_clicked == true
                    && btn_s9_clicked == true) {


            } else {


                random_value = r.nextInt(max - min + 1) + min;
                // Toast.makeText(SinglePlayerActivity.this, String.valueOf(random_value), Toast.LENGTH_SHORT).show();


                if (random_value == 1) {


                    if (btn_s1_clicked == true) {

                        newRandomCreate();


                    } else {

                        btn_s1.setText("O");
                        btn_s1.setTextSize(50);
                        btn_s1_clicked = true;
                        s1 = "O";


                        if (s1.equals(s2) && s1.equals(s3)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s1.setBackgroundColor(0xFF0FA434);
                            btn_s2.setBackgroundColor(0xFF0FA434);
                            btn_s3.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s1.equals(s4) && s1.equals(s7)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s1.setBackgroundColor(0xFF0FA434);
                            btn_s4.setBackgroundColor(0xFF0FA434);
                            btn_s7.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s1.equals(s5) && s1.equals(s9)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s1.setBackgroundColor(0xFF0FA434);
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s9.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }


                    }


                } else if (random_value == 2) {

                    if (btn_s2_clicked == true) {

                        newRandomCreate();

                    } else {

                        btn_s2.setText("O");
                        btn_s2.setTextSize(50);
                        btn_s2_clicked = true;
                        s2 = "O";


                        if (s2.equals(s1) && s2.equals(s3)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s2.setBackgroundColor(0xFF0FA434);
                            btn_s1.setBackgroundColor(0xFF0FA434);
                            btn_s3.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s2.equals(s5) && s2.equals(s8)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s2.setBackgroundColor(0xFF0FA434);
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s8.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }


                    }


                } else if (random_value == 3) {

                    if (btn_s3_clicked == true) {

                        newRandomCreate();


                    } else {

                        btn_s3.setText("O");
                        btn_s3.setTextSize(50);
                        btn_s3_clicked = true;
                        s3 = "O";


                        if (s3.equals(s2) && s3.equals(s1)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s3.setBackgroundColor(0xFF0FA434);
                            btn_s2.setBackgroundColor(0xFF0FA434);
                            btn_s1.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s3.equals(s6) && s3.equals(s9)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s3.setBackgroundColor(0xFF0FA434);
                            btn_s6.setBackgroundColor(0xFF0FA434);
                            btn_s9.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s3.equals(s5) && s3.equals(s7)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s3.setBackgroundColor(0xFF0FA434);
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s7.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }


                    }


                } else if (random_value == 4) {

                    if (btn_s4_clicked == true) {

                        newRandomCreate();


                    } else {

                        btn_s4.setText("O");
                        btn_s4.setTextSize(50);
                        btn_s4_clicked = true;
                        s4 = "O";


                        if (s4.equals(s1) && s4.equals(s7)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s4.setBackgroundColor(0xFF0FA434);
                            btn_s1.setBackgroundColor(0xFF0FA434);
                            btn_s7.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s4.equals(s5) && s4.equals(s6)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s4.setBackgroundColor(0xFF0FA434);
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s6.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }

                    }


                } else if (random_value == 5) {

                    if (btn_s5_clicked == true) {

                        newRandomCreate();


                    } else {

                        btn_s5.setText("O");
                        btn_s5.setTextSize(50);
                        btn_s5_clicked = true;
                        s5 = "O";


                        if (s5.equals(s4) && s5.equals(s6)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s4.setBackgroundColor(0xFF0FA434);
                            btn_s6.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s5.equals(s2) && s5.equals(s8)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s2.setBackgroundColor(0xFF0FA434);
                            btn_s8.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s5.equals(s1) && s5.equals(s9)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s1.setBackgroundColor(0xFF0FA434);
                            btn_s9.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }


                    }


                } else if (random_value == 6) {

                    if (btn_s6_clicked == true) {

                        newRandomCreate();


                    } else {

                        btn_s6.setText("O");
                        btn_s6.setTextSize(50);
                        btn_s6_clicked = true;
                        s6 = "O";

                        if (s6.equals(s3) && s6.equals(s9)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s6.setBackgroundColor(0xFF0FA434);
                            btn_s3.setBackgroundColor(0xFF0FA434);
                            btn_s9.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s6.equals(s5) && s6.equals(s4)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s6.setBackgroundColor(0xFF0FA434);
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s4.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }

                    }


                } else if (random_value == 7) {

                    if (btn_s7_clicked == true) {

                        newRandomCreate();


                    } else {

                        btn_s7.setText("O");
                        btn_s7.setTextSize(50);
                        btn_s7_clicked = true;
                        s7 = "O";


                        if (s7.equals(s4) && s7.equals(s1)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s7.setBackgroundColor(0xFF0FA434);
                            btn_s4.setBackgroundColor(0xFF0FA434);
                            btn_s1.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s7.equals(s8) && s7.equals(s9)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s7.setBackgroundColor(0xFF0FA434);
                            btn_s8.setBackgroundColor(0xFF0FA434);
                            btn_s9.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s7.equals(s5) && s7.equals(s3)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s7.setBackgroundColor(0xFF0FA434);
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s3.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }

                    }


                } else if (random_value == 8) {

                    if (btn_s8_clicked == true) {

                        newRandomCreate();


                    } else {

                        btn_s8.setText("O");
                        btn_s8.setTextSize(50);
                        btn_s8_clicked = true;
                        s8 = "O";


                        if (s8.equals(s5) && s8.equals(s2)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s8.setBackgroundColor(0xFF0FA434);
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s2.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s8.equals(s7) && s1.equals(s9)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s8.setBackgroundColor(0xFF0FA434);
                            btn_s7.setBackgroundColor(0xFF0FA434);
                            btn_s9.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }

                    }


                } else if (random_value == 9) {

                    if (btn_s9_clicked == true) {

                        newRandomCreate();


                    } else {

                        btn_s9.setText("O");
                        btn_s9.setTextSize(50);
                        btn_s9_clicked = true;
                        s9 = "O";


                        if (s9.equals(s8) && s9.equals(s7)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s9.setBackgroundColor(0xFF0FA434);
                            btn_s8.setBackgroundColor(0xFF0FA434);
                            btn_s7.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s9.equals(s6) && s9.equals(s3)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s9.setBackgroundColor(0xFF0FA434);
                            btn_s6.setBackgroundColor(0xFF0FA434);
                            btn_s3.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        } else if (s9.equals(s5) && s9.equals(s1)) {


                            Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                            btn_s9.setBackgroundColor(0xFF0FA434);
                            btn_s5.setBackgroundColor(0xFF0FA434);
                            btn_s1.setBackgroundColor(0xFF0FA434);

                            btn_s1_clicked = true;
                            btn_s2_clicked = true;
                            btn_s3_clicked = true;
                            btn_s4_clicked = true;
                            btn_s5_clicked = true;
                            btn_s6_clicked = true;
                            btn_s7_clicked = true;
                            btn_s8_clicked = true;
                            btn_s9_clicked = true;


                            s1 = "";
                            s2 = "";
                            s3 = "";
                            s4 = "";
                            s5 = "";
                            s6 = "";
                            s7 = "";
                            s8 = "";
                            s9 = "";


                        }

                    }


                }


            }


        }
    };


    public void newRandomCreate() {


        random_value2 = r.nextInt(max - min + 1) + min;


        if (random_value2 == 1) {

            if (btn_s1_clicked == true) {

                newRandomCreate();


            } else {

                btn_s1.setText("O");
                btn_s1.setTextSize(50);
                btn_s1_clicked = true;
                s1 = "O";


                if (s1.equals(s2) && s1.equals(s3)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s1.setBackgroundColor(0xFF0FA434);
                    btn_s2.setBackgroundColor(0xFF0FA434);
                    btn_s3.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s1.equals(s4) && s1.equals(s7)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s1.setBackgroundColor(0xFF0FA434);
                    btn_s4.setBackgroundColor(0xFF0FA434);
                    btn_s7.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s1.equals(s5) && s1.equals(s9)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s1.setBackgroundColor(0xFF0FA434);
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s9.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }


            }


        } else if (random_value2 == 2) {

            if (btn_s2_clicked == true) {

                newRandomCreate();

            } else {

                btn_s2.setText("O");
                btn_s2.setTextSize(50);
                btn_s2_clicked = true;
                s2 = "O";


                if (s2.equals(s1) && s2.equals(s3)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s2.setBackgroundColor(0xFF0FA434);
                    btn_s1.setBackgroundColor(0xFF0FA434);
                    btn_s3.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s2.equals(s5) && s2.equals(s8)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s2.setBackgroundColor(0xFF0FA434);
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s8.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }


            }


        } else if (random_value2 == 3) {

            if (btn_s3_clicked == true) {

                newRandomCreate();


            } else {

                btn_s3.setText("O");
                btn_s3.setTextSize(50);
                btn_s3_clicked = true;
                s3 = "O";

                if (s3.equals(s2) && s3.equals(s1)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s3.setBackgroundColor(0xFF0FA434);
                    btn_s2.setBackgroundColor(0xFF0FA434);
                    btn_s1.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s3.equals(s6) && s3.equals(s9)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s3.setBackgroundColor(0xFF0FA434);
                    btn_s6.setBackgroundColor(0xFF0FA434);
                    btn_s9.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s3.equals(s5) && s3.equals(s7)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s3.setBackgroundColor(0xFF0FA434);
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s7.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }

            }


        } else if (random_value2 == 4) {

            if (btn_s4_clicked == true) {

                newRandomCreate();


            } else {

                btn_s4.setText("O");
                btn_s4.setTextSize(50);
                btn_s4_clicked = true;
                s4 = "O";


                if (s4.equals(s1) && s4.equals(s7)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s4.setBackgroundColor(0xFF0FA434);
                    btn_s1.setBackgroundColor(0xFF0FA434);
                    btn_s7.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s4.equals(s5) && s4.equals(s6)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s4.setBackgroundColor(0xFF0FA434);
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s6.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }


            }


        } else if (random_value2 == 5) {

            if (btn_s5_clicked == true) {

                newRandomCreate();


            } else {

                btn_s5.setText("O");
                btn_s5.setTextSize(50);
                btn_s5_clicked = true;
                s5 = "O";

                if (s5.equals(s4) && s5.equals(s6)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s4.setBackgroundColor(0xFF0FA434);
                    btn_s6.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s5.equals(s2) && s5.equals(s8)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s2.setBackgroundColor(0xFF0FA434);
                    btn_s8.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s5.equals(s1) && s5.equals(s9)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s1.setBackgroundColor(0xFF0FA434);
                    btn_s9.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }

            }


        } else if (random_value2 == 6) {

            if (btn_s6_clicked == true) {

                newRandomCreate();


            } else {

                btn_s6.setText("O");
                btn_s6.setTextSize(50);
                btn_s6_clicked = true;
                s6 = "O";


                if (s6.equals(s3) && s6.equals(s9)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s6.setBackgroundColor(0xFF0FA434);
                    btn_s3.setBackgroundColor(0xFF0FA434);
                    btn_s9.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s6.equals(s5) && s6.equals(s4)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s6.setBackgroundColor(0xFF0FA434);
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s4.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }

            }


        } else if (random_value2 == 7) {

            if (btn_s7_clicked == true) {

                newRandomCreate();


            } else {

                btn_s7.setText("O");
                btn_s7.setTextSize(50);
                btn_s7_clicked = true;
                s7 = "O";

                if (s7.equals(s4) && s7.equals(s1)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s7.setBackgroundColor(0xFF0FA434);
                    btn_s4.setBackgroundColor(0xFF0FA434);
                    btn_s1.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s7.equals(s8) && s7.equals(s9)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s7.setBackgroundColor(0xFF0FA434);
                    btn_s8.setBackgroundColor(0xFF0FA434);
                    btn_s9.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s7.equals(s5) && s7.equals(s3)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s7.setBackgroundColor(0xFF0FA434);
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s3.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }

            }


        } else if (random_value2 == 8) {

            if (btn_s8_clicked == true) {

                newRandomCreate();


            } else {

                btn_s8.setText("O");
                btn_s8.setTextSize(50);
                btn_s8_clicked = true;
                s8 = "O";

                if (s8.equals(s5) && s8.equals(s2)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s8.setBackgroundColor(0xFF0FA434);
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s2.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s8.equals(s7) && s1.equals(s9)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s8.setBackgroundColor(0xFF0FA434);
                    btn_s7.setBackgroundColor(0xFF0FA434);
                    btn_s9.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }

            }


        } else if (random_value2 == 9) {

            if (btn_s9_clicked == true) {

                newRandomCreate();


            } else {

                btn_s9.setText("O");
                btn_s9.setTextSize(50);
                btn_s9_clicked = true;
                s9 = "O";


                if (s9.equals(s8) && s9.equals(s7)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s9.setBackgroundColor(0xFF0FA434);
                    btn_s8.setBackgroundColor(0xFF0FA434);
                    btn_s7.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s9.equals(s6) && s9.equals(s3)) {


                    Toast.makeText(SinglePlayerActivity.this, "OOPS!!! You lose", Toast.LENGTH_SHORT).show();
                    btn_s9.setBackgroundColor(0xFF0FA434);
                    btn_s6.setBackgroundColor(0xFF0FA434);
                    btn_s3.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                } else if (s9.equals(s5) && s9.equals(s1)) {


                    Toast.makeText(SinglePlayerActivity.this, "Congrats!!! You wins", Toast.LENGTH_SHORT).show();
                    btn_s9.setBackgroundColor(0xFF0FA434);
                    btn_s5.setBackgroundColor(0xFF0FA434);
                    btn_s1.setBackgroundColor(0xFF0FA434);

                    btn_s1_clicked = true;
                    btn_s2_clicked = true;
                    btn_s3_clicked = true;
                    btn_s4_clicked = true;
                    btn_s5_clicked = true;
                    btn_s6_clicked = true;
                    btn_s7_clicked = true;
                    btn_s8_clicked = true;
                    btn_s9_clicked = true;


                    s1 = "";
                    s2 = "";
                    s3 = "";
                    s4 = "";
                    s5 = "";
                    s6 = "";
                    s7 = "";
                    s8 = "";
                    s9 = "";


                }

            }


        }


    }

    public void new_game_s(View view) {


        s1 = "";
        s2 = "";
        s3 = "";
        s4 = "";
        s5 = "";
        s6 = "";
        s7 = "";
        s8 = "";
        s9 = "";


        btn_s1_clicked = false;
        btn_s2_clicked = false;
        btn_s3_clicked = false;
        btn_s4_clicked = false;
        btn_s5_clicked = false;
        btn_s6_clicked = false;
        btn_s7_clicked = false;
        btn_s8_clicked = false;
        btn_s9_clicked = false;


        btn_s1.setText("");
        btn_s2.setText("");
        btn_s3.setText("");
        btn_s4.setText("");
        btn_s5.setText("");
        btn_s6.setText("");
        btn_s7.setText("");
        btn_s8.setText("");
        btn_s9.setText("");


        btn_s1.setBackgroundResource(R.drawable.roundedbutton);
        btn_s2.setBackgroundResource(R.drawable.roundedbutton);
        btn_s3.setBackgroundResource(R.drawable.roundedbutton);
        btn_s4.setBackgroundResource(R.drawable.roundedbutton);
        btn_s5.setBackgroundResource(R.drawable.roundedbutton);
        btn_s6.setBackgroundResource(R.drawable.roundedbutton);
        btn_s7.setBackgroundResource(R.drawable.roundedbutton);
        btn_s8.setBackgroundResource(R.drawable.roundedbutton);
        btn_s9.setBackgroundResource(R.drawable.roundedbutton);
    }






}


























