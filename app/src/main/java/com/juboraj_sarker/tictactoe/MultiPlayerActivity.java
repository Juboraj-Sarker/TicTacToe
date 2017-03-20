package com.juboraj_sarker.tictactoe;

import android.content.Intent;
import android.os.Bundle;
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

public class MultiPlayerActivity extends AppCompatActivity {

    InterstitialAd mInterstitialAd;

    Button btn_x1, btn_x2, btn_x3, btn_y1, btn_y2, btn_y3, btn_z1, btn_z2, btn_z3;

    StringBuilder queue = new StringBuilder();

    Boolean btn_x1_clicked = false, btn_x2_clicked = false, btn_x3_clicked = false,
            btn_y1_clicked = false, btn_y2_clicked = false, btn_y3_clicked = false,
            btn_z1_clicked = false, btn_z2_clicked = false, btn_z3_clicked = false;

    String x1 = "", x2 = "", x3 = "", y1 = "", y2 = "", y3 = "", z1 = "", z2 = "", z3 = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_player);

        btn_x1 = (Button) findViewById(R.id.btn_x1);
        btn_x2 = (Button) findViewById(R.id.btn_x2);
        btn_x3 = (Button) findViewById(R.id.btn_x3);
        btn_y1 = (Button) findViewById(R.id.btn_y1);
        btn_y2 = (Button) findViewById(R.id.btn_y2);
        btn_y3 = (Button) findViewById(R.id.btn_y3);
        btn_z1 = (Button) findViewById(R.id.btn_z1);
        btn_z2 = (Button) findViewById(R.id.btn_z2);
        btn_z3 = (Button) findViewById(R.id.btn_z3);





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

        Intent about_me = new Intent(MultiPlayerActivity.this, AboutMeActivity.class);
        startActivity(about_me);
    }


    public void home(MenuItem item) {

        Intent homeIntent = new Intent(MultiPlayerActivity.this, HomeScreenActivity.class);
        startActivity(homeIntent);
    }






    public void click(View view) {

        switch (view.getId()) {

            case R.id.btn_x1: {

                if (btn_x1_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_x1.setText("X");
                        btn_x1.setTextSize(50);
                        queue.append("X");
                        btn_x1_clicked = true;
                        x1 = "X";

                        if (x1.equals(x2) && x1.equals(x3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();


                            btn_x1.setBackgroundColor(0xFF0FA434);
                            btn_x2.setBackgroundColor(0xFF0FA434);
                            btn_x3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        } else if (x1.equals(y1) && x1.equals(z1)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_x1.setBackgroundColor(0xFF0FA434);
                            btn_y1.setBackgroundColor(0xFF0FA434);
                            btn_z1.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        } else if (x1.equals(y2) && x1.equals(z3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_x1.setBackgroundColor(0xFF0FA434);
                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_z3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_x1.setText("O");
                            btn_x1.setTextSize(50);
                            queue.append("0");
                            btn_x1_clicked = true;
                            x1 = "0";


                            if (x1.equals(x2) && x1.equals(x3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (x1.equals(y1) && x1.equals(z1)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (x1.equals(y2) && x1.equals(z3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        } else {

                            btn_x1.setText("X");
                            btn_x1.setTextSize(50);
                            queue.append("X");
                            btn_x1_clicked = true;
                            x1 = "X";


                            if (x1.equals(x2) && x1.equals(x3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (x1.equals(y1) && x1.equals(z1)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (x1.equals(y2) && x1.equals(z3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


            case R.id.btn_x2: {

                if (btn_x2_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_x2.setText("X");
                        btn_x2.setTextSize(50);
                        queue.append("X");
                        btn_x2_clicked = true;
                        x2 = "X";


                        if (x2.equals(x1) && x2.equals(x3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_x2.setBackgroundColor(0xFF0FA434);
                            btn_x1.setBackgroundColor(0xFF0FA434);
                            btn_x3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";

                        } else if (x2.equals(y2) && x2.equals(z2)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_x2.setBackgroundColor(0xFF0FA434);
                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_z2.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_x2.setText("O");
                            btn_x2.setTextSize(50);
                            queue.append("0");
                            btn_x2_clicked = true;
                            x2 = "0";


                            if (x2.equals(x1) && x2.equals(x3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (x2.equals(y2) && x2.equals(z2)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_z2.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        } else {

                            btn_x2.setText("X");
                            btn_x2.setTextSize(50);
                            queue.append("X");
                            btn_x2_clicked = true;
                            x2 = "X";


                            if (x2.equals(x1) && x2.equals(x3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;


                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (x2.equals(y2) && x2.equals(z2)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_z2.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;


                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


            case R.id.btn_x3: {

                if (btn_x3_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_x3.setText("X");
                        btn_x3.setTextSize(50);
                        queue.append("X");
                        btn_x3_clicked = true;
                        x3 = "X";

                        if (x3.equals(x2) && x3.equals(x1)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_x3.setBackgroundColor(0xFF0FA434);
                            btn_x2.setBackgroundColor(0xFF0FA434);
                            btn_x1.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;


                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";

                        } else if (x3.equals(y3) && x3.equals(z3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();


                            btn_x3.setBackgroundColor(0xFF0FA434);
                            btn_y3.setBackgroundColor(0xFF0FA434);
                            btn_z3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;


                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        } else if (x3.equals(y2) && x3.equals(z1)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_x3.setBackgroundColor(0xFF0FA434);
                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_z1.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_x3.setText("O");
                            btn_x3.setTextSize(50);
                            queue.append("0");
                            btn_x3_clicked = true;
                            x3 = "0";


                            if (x3.equals(x2) && x3.equals(x1)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_x3.setBackgroundColor(0xFF0FA434);
                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (x3.equals(y3) && x3.equals(z3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_x3.setBackgroundColor(0xFF0FA434);
                                btn_y3.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (x3.equals(y2) && x3.equals(z1)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_x3.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        } else {

                            btn_x3.setText("X");
                            btn_x3.setTextSize(50);
                            queue.append("X");
                            btn_x3_clicked = true;
                            x3 = "X";


                            if (x3.equals(x2) && x3.equals(x1)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_x3.setBackgroundColor(0xFF0FA434);
                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (x3.equals(y3) && x3.equals(z3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_x3.setBackgroundColor(0xFF0FA434);
                                btn_y3.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (x3.equals(y2) && x3.equals(z1)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_x3.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


            case R.id.btn_y1: {

                if (btn_y1_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_y1.setText("X");
                        btn_y1.setTextSize(50);
                        queue.append("X");
                        btn_y1_clicked = true;
                        y1 = "X";


                        if (y1.equals(x1) && y1.equals(z1)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_y1.setBackgroundColor(0xFF0FA434);
                            btn_x1.setBackgroundColor(0xFF0FA434);
                            btn_z1.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";

                        } else if (y1.equals(y2) && y1.equals(y3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();


                            btn_y1.setBackgroundColor(0xFF0FA434);
                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_y3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;


                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_y1.setText("O");
                            btn_y1.setTextSize(50);
                            queue.append("0");
                            btn_y1_clicked = true;
                            y1 = "0";


                            if (y1.equals(x1) && y1.equals(z1)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (y1.equals(y2) && y1.equals(y3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_y3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        } else {

                            btn_y1.setText("X");
                            btn_y1.setTextSize(50);
                            queue.append("X");
                            btn_y1_clicked = true;
                            y1 = "X";


                            if (y1.equals(x1) && y1.equals(z1)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (y1.equals(y2) && y1.equals(y3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_y3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


            case R.id.btn_y2: {

                if (btn_y2_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_y2.setText("X");
                        btn_y2.setTextSize(50);
                        queue.append("X");
                        btn_y2_clicked = true;
                        y2 = "X";


                        if (y2.equals(x2) && y2.equals(z2)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();


                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_x2.setBackgroundColor(0xFF0FA434);
                            btn_z2.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;


                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";

                        } else if (y2.equals(y1) && y2.equals(y3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_y1.setBackgroundColor(0xFF0FA434);
                            btn_y3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        } else if (y2.equals(x1) && y2.equals(z3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_x1.setBackgroundColor(0xFF0FA434);
                            btn_z3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_y2.setText("O");
                            btn_y2.setTextSize(50);
                            queue.append("0");
                            btn_y2_clicked = true;
                            y2 = "0";


                            if (y2.equals(x2) && y2.equals(z2)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_z2.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (y2.equals(y1) && y2.equals(y3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_y3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;


                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (y2.equals(x1) && y2.equals(z3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            }


                        } else {

                            btn_y2.setText("X");
                            btn_y2.setTextSize(50);
                            queue.append("X");
                            btn_y2_clicked = true;
                            y2 = "X";


                            if (y2.equals(x2) && y2.equals(z2)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_z2.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;


                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (y2.equals(y1) && y2.equals(y3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_y3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (y2.equals(x1) && y2.equals(z3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


            case R.id.btn_y3: {

                if (btn_y3_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_y3.setText("X");
                        btn_y3.setTextSize(50);
                        queue.append("X");
                        btn_y3_clicked = true;
                        y3 = "X";


                        if (y3.equals(y2) && y3.equals(y1)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_y3.setBackgroundColor(0xFF0FA434);
                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_y1.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";

                        } else if (y3.equals(x3) && y3.equals(z3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_y3.setBackgroundColor(0xFF0FA434);
                            btn_x3.setBackgroundColor(0xFF0FA434);
                            btn_z3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_y3.setText("O");
                            btn_y3.setTextSize(50);
                            queue.append("0");
                            btn_y3_clicked = true;
                            y3 = "0";


                            if (y3.equals(y2) && y3.equals(y1)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_y3.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_y1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;


                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (y3.equals(x3) && y3.equals(z3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_y3.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        } else {

                            btn_y3.setText("X");
                            btn_y3.setTextSize(50);
                            queue.append("X");
                            btn_y3_clicked = true;
                            y3 = "X";


                            if (y3.equals(y2) && y3.equals(y1)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_y3.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_y1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (y3.equals(x3) && y3.equals(z3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_y3.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


            case R.id.btn_z1: {

                if (btn_z1_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_z1.setText("X");
                        btn_z1.setTextSize(50);
                        queue.append("X");
                        btn_z1_clicked = true;
                        z1 = "X";


                        if (z1.equals(y1) && z1.equals(x1)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_z1.setBackgroundColor(0xFF0FA434);
                            btn_y1.setBackgroundColor(0xFF0FA434);
                            btn_x1.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        } else if (z1.equals(z2) && z1.equals(z3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_z1.setBackgroundColor(0xFF0FA434);
                            btn_z2.setBackgroundColor(0xFF0FA434);
                            btn_z3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        } else if (z1.equals(y2) && z1.equals(x3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_z1.setBackgroundColor(0xFF0FA434);
                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_x3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_z1.setText("O");
                            btn_z1.setTextSize(50);
                            queue.append("0");
                            btn_z1_clicked = true;
                            z1 = "0";

                            if (z1.equals(y1) && z1.equals(x1)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_z1.setBackgroundColor(0xFF0FA434);
                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (z1.equals(z2) && z1.equals(z3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_z1.setBackgroundColor(0xFF0FA434);
                                btn_z2.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (z1.equals(y2) && z1.equals(x3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_z1.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        } else {

                            btn_z1.setText("X");
                            btn_z1.setTextSize(50);
                            queue.append("X");
                            btn_z1_clicked = true;
                            z1 = "X";


                            if (z1.equals(y1) && z1.equals(x1)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_z1.setBackgroundColor(0xFF0FA434);
                                btn_y1.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (z1.equals(z2) && z1.equals(z3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_z1.setBackgroundColor(0xFF0FA434);
                                btn_z2.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (z1.equals(y2) && z1.equals(x3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_z1.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


            case R.id.btn_z2: {

                if (btn_z2_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_z2.setText("X");
                        btn_z2.setTextSize(50);
                        queue.append("X");
                        btn_z2_clicked = true;
                        z2 = "X";


                        if (z2.equals(z1) && z2.equals(z3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_z2.setBackgroundColor(0xFF0FA434);
                            btn_z1.setBackgroundColor(0xFF0FA434);
                            btn_z3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        } else if (z2.equals(x2) && z2.equals(y2)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_z2.setBackgroundColor(0xFF0FA434);
                            btn_x2.setBackgroundColor(0xFF0FA434);
                            btn_y2.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;


                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_z2.setText("O");
                            btn_z2.setTextSize(50);
                            queue.append("0");
                            btn_z2_clicked = true;
                            z2 = "0";


                            if (z2.equals(z1) && z2.equals(z3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_z2.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;


                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (z2.equals(x2) && z2.equals(y2)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_z2.setBackgroundColor(0xFF0FA434);
                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        } else {

                            btn_z2.setText("X");
                            btn_z2.setTextSize(50);
                            queue.append("X");
                            btn_z2_clicked = true;
                            z2 = "X";


                            if (z2.equals(z1) && z2.equals(z3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_z2.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);
                                btn_z3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            } else if (z2.equals(x2) && z2.equals(y2)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_z2.setBackgroundColor(0xFF0FA434);
                                btn_x2.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


            case R.id.btn_z3: {

                if (btn_z3_clicked == true) {

                    break;
                } else {

                    if (queue.toString().isEmpty()) {

                        btn_z3.setText("X");
                        btn_z3.setTextSize(50);
                        queue.append("X");
                        btn_z3_clicked = true;
                        z3 = "X";


                        if (z3.equals(z2) && z3.equals(z1)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_z3.setBackgroundColor(0xFF0FA434);
                            btn_z2.setBackgroundColor(0xFF0FA434);
                            btn_z1.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";

                        } else if (z3.equals(y3) && z3.equals(x3)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_z3.setBackgroundColor(0xFF0FA434);
                            btn_y3.setBackgroundColor(0xFF0FA434);
                            btn_x3.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";

                        } else if (z3.equals(y2) && z3.equals(x1)) {

                            Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                            btn_z3.setBackgroundColor(0xFF0FA434);
                            btn_y2.setBackgroundColor(0xFF0FA434);
                            btn_x1.setBackgroundColor(0xFF0FA434);

                            queue.setLength(0);

                            btn_x1_clicked = true;
                            btn_x2_clicked = true;
                            btn_x3_clicked = true;
                            btn_y1_clicked = true;
                            btn_y2_clicked = true;
                            btn_y3_clicked = true;
                            btn_z1_clicked = true;
                            btn_z2_clicked = true;
                            btn_z3_clicked = true;

                            x1 = "";
                            x2 = "";
                            x3 = "";

                            y1 = "";
                            y2 = "";
                            y3 = "";

                            z1 = "";
                            z2 = "";
                            z3 = "";


                        }


                    } else {

                        if (queue.toString().endsWith("X")) {

                            btn_z3.setText("O");
                            btn_z3.setTextSize(50);
                            queue.append("0");
                            btn_z3_clicked = true;
                            z3 = "0";


                            if (z3.equals(z2) && z3.equals(z1)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_z3.setBackgroundColor(0xFF0FA434);
                                btn_z2.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (z3.equals(y3) && z3.equals(x3)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_z3.setBackgroundColor(0xFF0FA434);
                                btn_y3.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (z3.equals(y2) && z3.equals(x1)) {

                                Toast.makeText(this, "Player2 wins...", Toast.LENGTH_SHORT).show();

                                btn_z3.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";

                            }


                        } else {

                            btn_z3.setText("X");
                            btn_z3.setTextSize(50);
                            queue.append("X");
                            btn_z3_clicked = true;
                            z3 = "X";


                            if (z3.equals(z2) && z3.equals(z1)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_z3.setBackgroundColor(0xFF0FA434);
                                btn_z2.setBackgroundColor(0xFF0FA434);
                                btn_z1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (z3.equals(y3) && z3.equals(x3)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_z3.setBackgroundColor(0xFF0FA434);
                                btn_y3.setBackgroundColor(0xFF0FA434);
                                btn_x3.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            } else if (z3.equals(y2) && z3.equals(x1)) {

                                Toast.makeText(this, "Player1 wins...", Toast.LENGTH_SHORT).show();

                                btn_z3.setBackgroundColor(0xFF0FA434);
                                btn_y2.setBackgroundColor(0xFF0FA434);
                                btn_x1.setBackgroundColor(0xFF0FA434);

                                queue.setLength(0);

                                btn_x1_clicked = true;
                                btn_x2_clicked = true;
                                btn_x3_clicked = true;
                                btn_y1_clicked = true;
                                btn_y2_clicked = true;
                                btn_y3_clicked = true;
                                btn_z1_clicked = true;
                                btn_z2_clicked = true;
                                btn_z3_clicked = true;

                                x1 = "";
                                x2 = "";
                                x3 = "";

                                y1 = "";
                                y2 = "";
                                y3 = "";

                                z1 = "";
                                z2 = "";
                                z3 = "";


                            }


                        }
                    }

                }


                break;
            }


        }


    }

    public void new_game(View view) {


        btn_x1.setText("");
        btn_x2.setText("");
        btn_x3.setText("");
        btn_y1.setText("");
        btn_y2.setText("");
        btn_y3.setText("");
        btn_z1.setText("");
        btn_z2.setText("");
        btn_z3.setText("");
        queue.setLength(0);

        btn_x1_clicked = false;
        btn_x2_clicked = false;
        btn_x3_clicked = false;
        btn_y1_clicked = false;
        btn_y2_clicked = false;
        btn_y3_clicked = false;
        btn_z1_clicked = false;
        btn_z2_clicked = false;
        btn_z3_clicked = false;

        x1 = "";
        x2 = "";
        x3 = "";

        y1 = "";
        y2 = "";
        y3 = "";

        z1 = "";
        z2 = "";
        z3 = "";

        btn_x1.setBackgroundColor(0xFFCCCCCC);
        btn_x2.setBackgroundColor(0xFFCCCCCC);
        btn_x3.setBackgroundColor(0xFFCCCCCC);
        btn_y1.setBackgroundColor(0xFFCCCCCC);
        btn_y2.setBackgroundColor(0xFFCCCCCC);
        btn_y3.setBackgroundColor(0xFFCCCCCC);

        btn_z1.setBackgroundColor(0xFFCCCCCC);
        btn_z2.setBackgroundColor(0xFFCCCCCC);
        btn_z3.setBackgroundColor(0xFFCCCCCC);





    }
}
