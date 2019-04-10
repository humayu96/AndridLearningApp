package com.example.darkdeveloper.andridlearningapp.Android_Program;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TimePicker;
import android.widget.Toast;

import com.example.darkdeveloper.andridlearningapp.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Activity_TimePicker extends AppCompatActivity {

    TimePicker timePicker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__time_picker);


        ImageView mIcon1 = findViewById(R.id.time_xml); //xml

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.timexml); //drawable
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        mDrawable1.setCircular(false);
        mIcon1.setImageDrawable(mDrawable1);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_TimePicker.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.timexml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        ImageView mIcon = findViewById(R.id.time_code); //xml

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.timecode); //drawable
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_TimePicker.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.timecode);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });




        ImageView mIcon12 = findViewById(R.id.time_result); //xml

        Bitmap bitmap12 = BitmapFactory.decodeResource(getResources(), R.drawable.timeresult); //drawable
        RoundedBitmapDrawable mDrawable12 = RoundedBitmapDrawableFactory.create(getResources(), bitmap12);
        mDrawable12.setCircular(false);
        mIcon12.setImageDrawable(mDrawable12);

        mIcon12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_TimePicker.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.timeresult);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



//        timePicker = (TimePicker)findViewById(R.id.timeset);
//        timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
//            @Override
//            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {
//                Toast.makeText(Activity_TimePicker.this, "Time in Your Country is"+hourOfDay+":"+minute,
//                                                                                                 Toast.LENGTH_SHORT).show();
//            }
//        });
    }
}
