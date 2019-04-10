package com.example.darkdeveloper.andridlearningapp.Android_Program;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.darkdeveloper.andridlearningapp.R;

public class PRograms extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        Button btnToast , btnTextView , btneditText , btnbutton , btnSplash ,btnradio,btnCheckBox,
                btnRating , btnListview , btndate , btntime , btnwebview , btnnotify , btnintent ;
        setContentView(R.layout.activity_programs);



        //TOAST
        btnToast = (Button)findViewById(R.id.btn_Toast);
        btnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PRograms.this, Activity_Toast.class);
                startActivity(intent);
            }
        });



         //TEXT VIEW
        btnTextView = (Button)findViewById(R.id.btn_TextView);
        btnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PRograms.this, Activity_TextView.class);
                startActivity(intent);
            }
        });


         //EDIT TEXT
        btneditText = (Button)findViewById(R.id.btn_EditText);
        btneditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this, Activty_EditText.class);
                startActivity(intent);
            }
        });


        //SIMPLE BUTTON
        btnbutton = (Button)findViewById(R.id.btn_button);
        btnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this, Activity_Button.class);
                startActivity(intent);
            }
        });


        //Radio Button
        btnradio = (Button)findViewById(R.id.btn_Radio);
        btnradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(PRograms.this, Activity_Radio.class);
                startActivity(intent);
            }
        });


        //CHECKBOX
        btnCheckBox = (Button)findViewById(R.id.btn_Check);
        btnCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(PRograms.this, Activity_CheckBox.class);
                startActivity(intent);
            }
        });


          //SPLASH
        btnSplash = (Button)findViewById(R.id.btn_Splash);
        btnSplash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent  = new Intent(PRograms.this, Activity_Splash.class);
                startActivity(intent);
            }
        });



//        Rating Bar
        btnRating = (Button)findViewById(R.id.btn_ratingbar);
        btnRating.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_RatingBar.class);
                startActivity(intent);
            }
        });




//        List View
        btnListview = (Button)findViewById(R.id.btn_Listview);
        btnListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_ListView.class);
                startActivity(intent);
            }
        });




//        Grid View
        btnListview = (Button)findViewById(R.id.btn_Grid);
        btnListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_GridView.class);
                startActivity(intent);
            }
        });





//        Spinner
        btnListview = (Button)findViewById(R.id.btn_spinner);
        btnListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_Spinner.class);
                startActivity(intent);
            }
        });




//        Image View
        btnListview = (Button)findViewById(R.id.btn_Image);
        btnListview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_ImageView.class);
                startActivity(intent);
            }
        });


//                    DatePicker
        btndate = (Button)findViewById(R.id.btn_datepicker);
        btndate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_DatePicker.class);
                startActivity(intent);
            }
        });



//                         TImePicker
        btntime = (Button)findViewById(R.id.btn_timepicker);
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_TimePicker.class);
                startActivity(intent);
            }
        });



        //                         WebView
        btnwebview = (Button)findViewById(R.id.btn_timepicker);
        btnwebview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_WebView.class);
                startActivity(intent);
            }
        });


        //                         WebView
        btnnotify = (Button)findViewById(R.id.btn_Notification);
        btnnotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_Notification.class);
                startActivity(intent);
            }
        });


        //                         Intents
        btnintent = (Button)findViewById(R.id.btn_intent);
        btnintent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PRograms.this,Activity_Intent.class);
                startActivity(intent);
            }
        });

    }
}
