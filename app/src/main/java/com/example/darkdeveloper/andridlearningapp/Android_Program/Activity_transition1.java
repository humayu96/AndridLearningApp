package com.example.darkdeveloper.andridlearningapp.Android_Program;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.darkdeveloper.andridlearningapp.R;

public class Activity_transition1 extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition1);

        button = (Button)findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity_transition1.this,Activity_transition2.class);
                startActivity(intent);
            }
        });

    }
}
