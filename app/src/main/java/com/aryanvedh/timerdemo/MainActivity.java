package com.aryanvedh.timerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       new CountDownTimer(10000, 1000){
           public void onTick(long millisecondsUntilDone){
               Log.i("Seconds left", String.valueOf(millisecondsUntilDone / 1000));
           }

           @Override
           public void onFinish() {
               Log.i("Done", "Countdown timer finished");
           }
       }.start();

//        Handler handler = new Handler();
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//
//                Log.i("Runnable has run", "a second must have passed");
//                handler.postDelayed(this, 1000);
//            }
//        };
//        handler.post(run);
    }
}