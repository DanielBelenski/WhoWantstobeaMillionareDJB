package com.example.whowantstobeamillionaredjb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        //hide the action bar
        getSupportActionBar().hide();
    }

    //method used by the correct answer to confirm the choice and transition to the next question
    public void toQuestion7(final View view){

        //building a dialogue to confirm answer
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //asking the user if they are sure
        builder.setMessage("Are you sure this is your answer?")
                //positive button moves the user to the next question
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent nextQuestion = new Intent(Question6.this, Question7.class);
                        Question6.this.startActivity(nextQuestion);
                        CharSequence text = "Congratulations, you won some money!";
                        Toast.makeText(Question6.this, text, Toast.LENGTH_SHORT).show();
                    }
                })
                //negative button dismisses the dialogue
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        //building and showing the dialogue
        builder.create();
        builder.show();
    }

    //method used by the wrong answers to take the user to the fail screen
    public void fail6(View view){

        //building a dialogue to confirm answer
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //asking the user if they are sure
        builder.setMessage("Are you sure this is your answer?")
                //positive button to confirm answer and take user to fail screen
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent fail = new Intent(Question6.this, FailScreen.class);
                        fail.putExtra("money",6000);
                        Question6.this.startActivity(fail);
                        CharSequence text = "Sorry, wrong answer";
                        Toast.makeText(Question6.this, text, Toast.LENGTH_SHORT).show();
                    }
                })
                //negative button dismisses the dialogue
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        //building and showing the dialogue
        builder.create();
        builder.show();
    }
}
