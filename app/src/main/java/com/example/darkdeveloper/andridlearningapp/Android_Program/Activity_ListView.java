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
import android.widget.ListView;

import com.example.darkdeveloper.andridlearningapp.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Activity_ListView extends AppCompatActivity {
//    ListView listView;


//    String[] countries = {"Pakistan","India","China","Russia","Turkey","Canada","France","Italy"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();

        setContentView(R.layout.activity__list_view);

        ImageView mIcon = findViewById(R.id.listxml); //xml

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.listviewxml); //drawable
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_ListView.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.listviewxml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });




        ImageView mIcon1 = findViewById(R.id.listcode); //xml

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.listviewcode); //drawable
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        mDrawable.setCircular(false);
        mIcon1.setImageDrawable(mDrawable1);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_ListView.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.listviewcode);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        ImageView mIcon11 = findViewById(R.id.listresult); //xml

        Bitmap bitmap11 = BitmapFactory.decodeResource(getResources(), R.drawable.listviewresult); //drawable
        RoundedBitmapDrawable mDrawable11 = RoundedBitmapDrawableFactory.create(getResources(), bitmap11);
        mDrawable11.setCircular(false);
        mIcon11.setImageDrawable(mDrawable11);

        mIcon11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_ListView.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.listviewresult);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



//        listView = (ListView)findViewById(R.id.list_view);
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>
//                                              (Activity_ListView.this,android.R.layout.simple_list_item_1,countries);
//        listView.setAdapter(arrayAdapter);
//    }
    }
}