package com.example.darkdeveloper.andridlearningapp.Android_Program;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;

import com.example.darkdeveloper.andridlearningapp.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Activity_Spinner extends AppCompatActivity {

//    Spinner spinner;
//
//    String[] Car_Company_names = {"Mercedes","Nissan","Chevrolet","Lexus","Ferrari","Audi","BMW","Bentley","Bugatti"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__spinner);



        ImageView mIcon11 = findViewById(R.id.spinnerxml); //xml

        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(), R.drawable.spinnerxml); //drawable
        RoundedBitmapDrawable mDrawable11 = RoundedBitmapDrawableFactory.create(getResources(), bitmap11);
        mDrawable11.setCircular(false);
        mIcon11.setImageDrawable(mDrawable11);

        mIcon11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Spinner.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.spinnerxml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });




        ImageView mIcon111 = findViewById(R.id.spinnercode); //xml

        Bitmap bitmap111 = BitmapFactory.decodeResource(getResources(), R.drawable.spinnercode); //drawable
        RoundedBitmapDrawable mDrawable111 = RoundedBitmapDrawableFactory.create(getResources(), bitmap111);
        mDrawable111.setCircular(false);
        mIcon111.setImageDrawable(mDrawable111);

        mIcon111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Spinner.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.spinnercode);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        ImageView mIcon = findViewById(R.id.spnnerresultak); //xml

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.spinnerresult_ak); //drawable
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Spinner.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.spinnerresult_ak);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        ImageView mIcon01 = findViewById(R.id.spinnerresultdo); //xml

        Bitmap bitmap01 = BitmapFactory.decodeResource(getResources(), R.drawable.spinnerresult_do); //drawable
        RoundedBitmapDrawable mDrawable01 = RoundedBitmapDrawableFactory.create(getResources(), bitmap01);
        mDrawable01.setCircular(false);
        mIcon01.setImageDrawable(mDrawable01);

        mIcon01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Spinner.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.spinnerresult_do);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });





//
//        spinner = (Spinner)findViewById(R.id.spinnerr);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                                            (Activity_Spinner.this,android.R.layout.simple_list_item_1,Car_Company_names);
//
//        spinner.setAdapter(arrayAdapter);
//

    }
}
