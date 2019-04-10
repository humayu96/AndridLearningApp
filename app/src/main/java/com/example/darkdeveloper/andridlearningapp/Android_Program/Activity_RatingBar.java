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
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.darkdeveloper.andridlearningapp.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Activity_RatingBar extends AppCompatActivity {
//    RatingBar bar,bar1;
//    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__rating_bar);


        ImageView mIcon = findViewById(R.id.ratingxml);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.ratingbarxml);
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_RatingBar.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.ratingbarxml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        ImageView mIcon1 = findViewById(R.id.ratingcode);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.ratingbarcode);
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        mDrawable.setCircular(false);
        mIcon1.setImageDrawable(mDrawable1);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_RatingBar.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.ratingbarcode);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        ImageView mIcon11 = findViewById(R.id.ratingresult);

        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(), R.drawable.ratingbarresult);
        RoundedBitmapDrawable mDrawable11 = RoundedBitmapDrawableFactory.create(getResources(), bitmap11);
        mDrawable.setCircular(false);
        mIcon11.setImageDrawable(mDrawable11);

        mIcon11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_RatingBar.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.ratingbarresult);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });





//
//        textView = (TextView)findViewById(R.id.text_rating);
//
//        bar = (RatingBar)findViewById(R.id.rating_5);
//        bar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//            @Override
//            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//                float rate = bar.getRating();
//
//                textView.setText("you give"+rate);
//            }
//        });




        //textView.setText("You selected" +bar);
//        bar = (RatingBar)findViewById(R.id.rating_5);
//        textView = (TextView)findViewById(R.id.text_rating);

//
//        textView.setText("You give Rate" +bar);
//
////        bar1 = (RatingBar)findViewById(R.id.rating_6);
//////        bar1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
//////            @Override
//////            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
//////
//////            }
//////        });
    }
}
