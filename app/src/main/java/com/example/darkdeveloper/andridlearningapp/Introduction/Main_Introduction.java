package com.example.darkdeveloper.andridlearningapp.Introduction;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import com.example.darkdeveloper.andridlearningapp.R;

public class Main_Introduction extends AppCompatActivity {

    Button buttonlayout,buttonwidgets,buttondatabase,buttonfragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main__introduction);

        Layout();
        Widgets();
        Database();
        ActviFragments();
    }

    public void Layout()
    {
        buttonlayout = (Button)findViewById(R.id.layout);
        buttonlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Introduction.this,Layoutintro.class);
                startActivity(intent);
            }
        });
    }

    public void Widgets()
    {
        buttonwidgets = (Button)findViewById(R.id.widgtess);
        buttonwidgets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Introduction.this,Widgetintro.class);
                startActivity(intent);



            }
        });
    }

    public void Database()
    {
        buttondatabase = (Button)findViewById(R.id.database);
        buttondatabase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Introduction.this,Databaseintro.class);
                startActivity(intent);



            }
        });
    }

    public void ActviFragments()
    {
        buttonfragments = (Button)findViewById(R.id.actifrag);
        buttonfragments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main_Introduction.this,AcFragintro.class);
                startActivity(intent);


            }
        });
    }
}
