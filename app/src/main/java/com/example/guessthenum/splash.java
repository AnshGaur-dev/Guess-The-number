package com.example.guessthenum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Intent home= new Intent(splash.this,select_level.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(home);
            }
            },2000
        );
    }}
