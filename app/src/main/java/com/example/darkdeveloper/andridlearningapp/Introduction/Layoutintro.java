package com.example.darkdeveloper.andridlearningapp.Introduction;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.darkdeveloper.andridlearningapp.R;

public class Layoutintro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_layoutintro);
    }
}
