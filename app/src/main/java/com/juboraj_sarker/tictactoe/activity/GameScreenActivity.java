package com.juboraj_sarker.tictactoe.activity;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.juboraj_sarker.tictactoe.R;
import com.juboraj_sarker.tictactoe.gameplay.TicTacToe;
import com.juboraj_sarker.tictactoe.gameplay.TicTacToeAIEasy;
import com.juboraj_sarker.tictactoe.gameplay.TicTacToeAIHard;
import com.juboraj_sarker.tictactoe.gameplay.TicTacToeAIImpossible;
import com.juboraj_sarker.tictactoe.gameplay.TicTacToeAINormal;

import java.io.File;

public class GameScreenActivity extends AppCompatActivity {

    protected TextView playerTV, cpuTV, difficultyTV;

    protected Button btnTL, btnTM, btnTR;
    protected Button btnML, btnMM, btnMR;
    protected Button btnBL, btnBM, btnBR;
    protected TextView txtPlayerScore, txtCPUScore;
    protected TicTacToe game;
    protected TextView lblStatus;




    private int aiOption = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_screen);


        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

        android.support.v7.app.ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);



        Bundle bundle=getIntent().getExtras();
        aiOption=bundle.getInt("option");


        btnTL = (Button)findViewById(R.id.btnTL);
        btnTM = (Button)findViewById(R.id.btnTM);
        btnTR = (Button)findViewById(R.id.btnTR);
        btnML = (Button)findViewById(R.id.btnML);
        btnMM = (Button)findViewById(R.id.btnMM);
        btnMR = (Button)findViewById(R.id.btnMR);
        btnBL = (Button)findViewById(R.id.btnBL);
        btnBM = (Button)findViewById(R.id.btnBM);
        btnBR = (Button)findViewById(R.id.btnBR);
        txtPlayerScore = (TextView)findViewById(R.id.txtPlayerScore);
        txtCPUScore = (TextView)findViewById(R.id.txtCPUScore);

        playerTV = (TextView) findViewById(R.id.player_TV);
        cpuTV = (TextView) findViewById(R.id.cpu_TV);
        difficultyTV = (TextView) findViewById(R.id.difficulty_TV);


        MobileAds.initialize(getApplicationContext(), "ca-app-pub-5809082953640465/7040061742");
        AdView mAdView = (AdView) findViewById(R.id.adView1);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice("93448558CC721EBAD8FAAE5DA52596D3").build();
        mAdView.loadAd(adRequest);






        if (aiOption==0){



            final Dialog dialog = new Dialog(this);
            dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            dialog.setCancelable(false);
            dialog.setContentView(R.layout.dialog_layout);


            final EditText player_one = (EditText) dialog.findViewById(R.id.player_one_Name_ET);
            final EditText player_two = (EditText) dialog.findViewById(R.id.player_two_name_ET);



            Button dialogButton = (Button) dialog.findViewById(R.id.saveBTN);
            dialogButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String o = player_one.getText().toString();
                    String t  = player_two.getText().toString();

                    if (o.equals("") || t.equals("")){

                        Toast.makeText(getApplicationContext(), "Please enter right value", Toast.LENGTH_SHORT).show();

                    }else {


                        playerTV.setText(o+ ":");
                        cpuTV.setText(t + ": ");

                        dialog.dismiss();
                    }


                }
            });

            dialog.show();


            game = new TicTacToe();




        }else if(aiOption==1){
            game = new TicTacToeAIEasy();

            difficultyTV.setText("LEVEL: EASY");


        }else if(aiOption==2) {
            game = new TicTacToeAINormal();

            difficultyTV.setText("LEVEL: NORMAL");

        }else if (aiOption==3){ //aiOption==3
            game = new TicTacToeAIHard();
            difficultyTV.setText("LEVEL: HARD");

        }else{  //aiOption==4

            game = new TicTacToeAIImpossible();
            difficultyTV.setText("LEVEL: IMPOSSIBLE");
        }


        game.setController(this);
        game.resetBoard();


        btnTL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(0, 0);
            }
        });


        btnTM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(1, 0);
            }
        });


        btnTR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(2, 0);
            }
        });


        btnML.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(0, 1);
            }
        });



        btnMM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(1, 1);
            }
        });



        btnMR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(2, 1);
            }
        });



        btnBL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(0, 2);
            }
        });



        btnBM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(1, 2);
            }
        });



        btnBR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                game.genericBtnClick(2, 2);
            }
        });












    }

    public void createOverlay(String strMessage){
//
//        //Creates buttons, label, original scene, and original window for overlay
//        Button btnMainMenu = new Button("Main Menu");
//        Button btnPlayAgain= new Button("Play Again");
//        Text lblMessage = new Text(strMessage);
//        Scene origScene = btnBL.getScene();
//        Stage window = (Stage) origScene.getWindow();
//
//        //Setting up the buttons
//        btnMainMenu.setMaxWidth(200);
//        btnPlayAgain.setMaxWidth(200);
//
//        //This section for setting the display of buttons
//        VBox layout = new VBox(lblMessage, btnMainMenu, btnPlayAgain);
//        layout.setStyle("-fx-background-color: rgba(0, 0, 0, 0.3);");
//        layout.getStylesheets().add(getClass().getResource("styleScene4-overlay.css").toExternalForm());
//        layout.setMaxWidth(btnBL.getScene().getWidth());
//        layout.setMaxHeight(btnBL.getScene().getHeight());
//        layout.setSpacing(10);
//        layout.setAlignment(Pos.CENTER);
//        //End section
//
//
//        //This gets a snapshot of the game, then blurs it and sets it as the background
//        //Maybe use fade animation?
//        ImageView imageView = new ImageView(btnBL.getScene().snapshot(null));
//        imageView.setEffect(new GaussianBlur(5));
//
//        //This combines the blurred background with the buttons
//        StackPane background = new StackPane(imageView,layout);
//
//        //Creates a new scene for the overlay
//        Scene scene4Overlay = new Scene(background);
//
//        //Displays overlay to user (replaces game board scene)
//        window.setScene(scene4Overlay);
//
//
//        //User chooses play again, game board resets and scene is switched
//        //to game board
//        btnPlayAgain.setOnAction(event -> {
//            game.resetBoard();
//            window.setScene(origScene);
//        });
//
//
//        //User chooses Main Menu, scene for main menu is created and then switched too.
//        btnMainMenu.setOnAction(event -> {
//            try {
//                FXMLLoader loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
//                Scene scene1 = new Scene((Parent) loader.load());
//                scene1.getStylesheets().add(getClass().getResource("styleScene1.css").toExternalForm());
//                window.setScene(scene1);
//            } catch (Exception ignored){}
//        });
    }

    public void resetButtons() {

        String blank = "";
        //lblStatus.setText(blank);
        btnTL.setText(blank);
        btnTM.setText(blank);
        btnTR.setText(blank);
        btnML.setText(blank);
        btnMM.setText(blank);
        btnMR.setText(blank);
        btnBL.setText(blank);
        btnBM.setText(blank);
        btnBR.setText(blank);
    }

    public void setBtnText(int i, int j,String text){
        if (i == 0 && j==0) btnTL.setText(text);
        else if (i == 1 && j==0) btnTM.setText(text);
        else if (i == 2 && j==0) btnTR.setText(text);
        else if (i == 0 && j==1) btnML.setText(text);
        else if (i == 1 && j==1) btnMM.setText(text);
        else if (i == 2 && j==1) btnMR.setText(text);
        else if (i == 0 && j==2) btnBL.setText(text);
        else if (i == 1 && j==2) btnBM.setText(text);
        else if (i == 2 && j==2) btnBR.setText(text);
    }

    public void setLblText(String text) {//lblStatus.setText(text);}
    }

    public void setBanner(String text){

    }

    public void setTxtPlayerScore(int score){
        txtPlayerScore.setText(String.valueOf(score));
    }
    public void setTxtCPUScore(int score){
        txtCPUScore.setText(String.valueOf(score));
    }
    public void setAiOption(int x){aiOption=x;}

    public int getAiOption(){return aiOption;}


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

        startActivity(new Intent(GameScreenActivity.this, AboutMeActivity.class));
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

