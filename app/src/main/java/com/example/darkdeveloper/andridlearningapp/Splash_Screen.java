package com.example.darkdeveloper.andridlearningapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_Screen extends AppCompatActivity {

    private static int Splash_Scren = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_splash__screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this,Nav_Main.class);
                startActivity(intent);
            }
        },Splash_Scren);

    }
}
