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

public class Activty_SendDataother extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activty__send_dataother);

        ImageView mIcon = findViewById(R.id.senddataxml); //xml

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.senddataxml); //drawable
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activty_SendDataother.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.senddataxml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        ImageView mIcon1 = findViewById(R.id.senddataxmll); //xml

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.senddataxmll); //drawable
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        mDrawable1.setCircular(false);
        mIcon1.setImageDrawable(mDrawable1);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activty_SendDataother.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.senddataxmll);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        ImageView mIcon2 = findViewById(R.id.senddatacode); //xml

        Bitmap bitmap2 = BitmapFactory.decodeResource(getResources(), R.drawable.senddatacode); //drawable
        RoundedBitmapDrawable mDrawable2 = RoundedBitmapDrawableFactory.create(getResources(), bitmap2);
        mDrawable2.setCircular(false);
        mIcon2.setImageDrawable(mDrawable2);

        mIcon2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activty_SendDataother.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.senddatacode);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        ImageView mIcon3 = findViewById(R.id.senddatacode); //xml

        Bitmap bitmap3 = BitmapFactory.decodeResource(getResources(), R.drawable.senddatacode); //drawable
        RoundedBitmapDrawable mDrawable3 = RoundedBitmapDrawableFactory.create(getResources(), bitmap3);
        mDrawable3.setCircular(false);
        mIcon3.setImageDrawable(mDrawable3);

        mIcon3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activty_SendDataother.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.senddatacode);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        ImageView mIcon4 = findViewById(R.id.senddatacodee); //xml

        Bitmap bitmap4 = BitmapFactory.decodeResource(getResources(), R.drawable.senddatacodee); //drawable
        RoundedBitmapDrawable mDrawable4 = RoundedBitmapDrawableFactory.create(getResources(), bitmap4);
        mDrawable4.setCircular(false);
        mIcon4.setImageDrawable(mDrawable4);

        mIcon4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activty_SendDataother.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.senddatacodee);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        ImageView mIcon5 = findViewById(R.id.senddataresult); //xml

        Bitmap bitmap5 = BitmapFactory.decodeResource(getResources(), R.drawable.senddataresult); //drawable
        RoundedBitmapDrawable mDrawable5 = RoundedBitmapDrawableFactory.create(getResources(), bitmap5);
        mDrawable5.setCircular(false);
        mIcon5.setImageDrawable(mDrawable5);

        mIcon5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activty_SendDataother.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.senddataresult);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        ImageView mIcon6 = findViewById(R.id.senddataresultt); //xml

        Bitmap bitmap6 = BitmapFactory.decodeResource(getResources(), R.drawable.senddataresultt); //drawable
        RoundedBitmapDrawable mDrawable6 = RoundedBitmapDrawableFactory.create(getResources(), bitmap6);
        mDrawable6.setCircular(false);
        mIcon6.setImageDrawable(mDrawable5);

        mIcon6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activty_SendDataother.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.senddataresultt);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


    }
}
