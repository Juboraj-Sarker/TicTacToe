package com.juboraj_sarker.tictactoe.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.juboraj_sarker.tictactoe.R;

/**
 * Created by jubor on 8/25/2017.
 */

public class ViewDialog {

    String one, two;


    public String getOne() {
        return one;
    }

    public String getTwo() {
        return two;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public void showDialog(final Activity activity, String msg ){
        final Dialog dialog = new Dialog(activity);
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

                    Toast.makeText(activity, "Please enter value", Toast.LENGTH_SHORT).show();

                }else {


                    setOne(player_one.getText().toString());
                    setTwo(player_two.getText().toString());
                    dialog.dismiss();
                }


            }
        });

        dialog.show();

    }
}
