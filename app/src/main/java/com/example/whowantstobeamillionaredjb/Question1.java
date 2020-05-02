package com.example.whowantstobeamillionaredjb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        getSupportActionBar().hide();
    }

    public void toQuestion2(final View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure this is your answer?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent nextQuestion = new Intent(Question1.this, Question2.class);
                        Question1.this.startActivity(nextQuestion);
                        CharSequence text = "Congratulations, you won some money!";
                        Toast.makeText(Question1.this, text, Toast.LENGTH_SHORT).show();
                    }
                })
        .setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.create();
    }

    public void fail1(View view){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure this is your answer?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent fail = new Intent(Question1.this, FailScreen.class);
                        fail.putExtra("money",0);
                        Question1.this.startActivity(fail);
                        CharSequence text = "Sorry, wrong answer";
                        Toast.makeText(Question1.this, text, Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        builder.create();
    }
}
