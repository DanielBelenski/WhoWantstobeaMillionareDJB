package com.example.whowantstobeamillionaredjb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WinScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win_screen);
        getSupportActionBar().hide();
    }

    public void toTitle(View view){

        Intent restart = new Intent(this, MainActivity.class);
        startService(restart);
    }
}
