package com.example.whowantstobeamillionaredjb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

//Splash Screen Activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    // method to take the user to the first question of the game
    public void toGame(View view){

        //this is a new comment
        Intent start = new Intent(this, Question1.class);
        startActivity(start);
    }
}