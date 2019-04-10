package com.example.darkdeveloper.andridlearningapp.Android_Program;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.darkdeveloper.andridlearningapp.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Activity_CheckBox extends AppCompatActivity {

    Button bttn;
    CheckBox checkBox_pakistan, checkBox_india;
    TextView textView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__check_box);




        ImageView mIcon = findViewById(R.id.checkxml);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.check_xml);
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_CheckBox.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.check_xml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



        ImageView mIcon1 = findViewById(R.id.checkcode);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.check_code);
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        mDrawable1.setCircular(false);
        mIcon1.setImageDrawable(mDrawable1);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_CheckBox.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.check_code);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });




//
//        checkBox_pakistan = (CheckBox)findViewById(R.id.pak);
//        checkBox_india = (CheckBox)findViewById(R.id.Ind);
//
//        textView1 = (TextView)findViewById(R.id.check_text);
//
//        bttn = (Button)findViewById(R.id.btn_chk);
//        bttn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if (checkBox_pakistan.isChecked())
//                {
//                    textView1.setText("YOU ARE FROM PAKISTAN");
//                   // Intent intent
//                }
//
//                else if (checkBox_india.isChecked())
//                {
//                    textView1.setText("YOU ARE FROM INDIA");
//                }
//                else if(checkBox_india.isChecked() &&checkBox_pakistan.isChecked())
//                {
//                    textView1.setText("Please Select only one Country");
//
//                }
//
//                else
//                {
//                    Toast.makeText(Activity_CheckBox.this, "Nothing is selected", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });
    }

//    public void check(View view)
//    {
//        if (checkBox_pakistan.isChecked())
//        {
//            textView1.setText("YOU ARE FROM PAKISTAN");
//        }
//
//        else if (checkBox_india.isChecked())
//        {
//            textView1.setText("YOU ARE FROM INDIA");
//        }
//
//        else
//        {
//            Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
//        }
//
//    }
}
