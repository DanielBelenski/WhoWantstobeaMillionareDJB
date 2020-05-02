package com.example.whowantstobeamillionaredjb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class FailScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail_screen);
        getSupportActionBar().hide();
    }

    //
    public void toTitle(View view){

        Intent restart = new Intent(this, MainActivity.class);
        startActivity(restart);
    }
}
