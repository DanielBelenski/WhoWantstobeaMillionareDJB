package com.example.whowantstobeamillionaredjb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

//screen for when the user loses the game
public class FailScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail_screen);
        getSupportActionBar().hide();
    }

    //method to take user back to the splash screen
    public void toTitle(View view){

        Intent restart = new Intent(this, MainActivity.class);
        startActivity(restart);
    }
}
