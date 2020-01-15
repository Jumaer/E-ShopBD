package com.example.eshopbd;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;


public class SplashActivity extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_first_show);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent homeintent = new Intent(SplashActivity.this, Account.class);
                startActivity(homeintent);

                finish();
            }
        },SPLASH_TIME_OUT);

    }
    @Override
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
    }
}
