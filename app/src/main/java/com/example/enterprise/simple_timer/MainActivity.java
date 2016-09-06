package com.example.enterprise.simple_timer;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//Get reference of the XML layout's widgets
        final TextView tView = (TextView) findViewById(R.id.tv);

        //The number of milliseconds in the future from
        //the call to start() until the countdown is done
        long millisInFuture = 25000; //25 seconds
        //The interval along the way to receive onTick(long) callbacks
        long countDownInterval = 1000; //1 second

        //Initialize a new CountDownTimer instance
        new CountDownTimer(millisInFuture, countDownInterval) {
            public void onTick(long millisUntilFinished) {
                //do something in every tick
                //Display the remaining seconds to app interface
                //1 second = 1000 milliseconds
                tView.setText("Seconds remaining : " + millisUntilFinished / 1000);
            }

            public void onFinish() {
                //Do something when count down finished
                tView.setText("Time over...");
            }
        }.start();
    }
}