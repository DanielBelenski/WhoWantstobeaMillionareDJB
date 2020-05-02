package com.example.whowantstobeamillionaredjb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FailScreen extends AppCompatActivity {

    TextView lossText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //get amount won this game
        Bundle extras = getIntent().getExtras();
        int money = extras.getInt("money");

        //get view for textview
        lossText = (TextView) findViewById(R.id.failureTextView);

        //Show amount won to the user
        lossText.setText("You lost\n" +
                "But at least you won $" + money);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fail_screen);
    }

    //
    public void toTitle(View view){

        Intent restart = new Intent(this, MainActivity.class);
        startService(restart);
    }
}
