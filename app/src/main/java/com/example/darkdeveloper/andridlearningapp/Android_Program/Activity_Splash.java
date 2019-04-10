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

import com.example.darkdeveloper.andridlearningapp.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Activity_Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity__splash);

        ImageView mIcon = findViewById(R.id.splashxml);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.splash_xml);
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Splash.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.splash_xml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        ImageView mIcon1 = findViewById(R.id.splashcode);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.splash_code);
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        mDrawable1.setCircular(false);
        mIcon1.setImageDrawable(mDrawable1);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Splash.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.splash_code);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });
    }
}
