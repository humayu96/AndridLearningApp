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

public class Activity_Toast extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity__toast);

        ImageView mIcon = findViewById(R.id.toastjava);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.tost_java);
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Toast.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.tost_java);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });

        ImageView mIcon1 = findViewById(R.id.toastresult);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.toast_result);
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable1.setCircular(false);
        mIcon1.setImageDrawable(mDrawable);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Toast.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.toast_result);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



    }
}
