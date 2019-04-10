package com.example.darkdeveloper.andridlearningapp.Android_Program;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.darkdeveloper.andridlearningapp.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Activity_Radio extends AppCompatActivity {


//    private Button button;
//
//    RadioButton radioButton1,radioButton2,radioButton3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__radio);

        ImageView mIcon = findViewById(R.id.radioxml);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.radio_xml);
        RoundedBitmapDrawable mDrawable = RoundedBitmapDrawableFactory.create(getResources(), bitmap);
        mDrawable.setCircular(false);
        mIcon.setImageDrawable(mDrawable);

        mIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Radio.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.radio_xml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });


        ImageView mIcon1 = findViewById(R.id.radiocode);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.radio_code);
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        mDrawable.setCircular(false);
        mIcon1.setImageDrawable(mDrawable1);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_Radio.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.radio_code);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });



//
//      radioButton1 = (RadioButton)findViewById(R.id.radio_name);
//      radioButton2 = (RadioButton)findViewById(R.id.radio_lastname);
//      radioButton3 = (RadioButton)findViewById(R.id.radio_age);
//      button = (Button)findViewById(R.id.button_submit);
//
//      button.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//
//           if(radioButton1.isChecked())
//           {
//               Toast.makeText(Activity_Radio.this, "Your Name is Humayun", Toast.LENGTH_SHORT).show();
//           }
//           else  if(radioButton2.isChecked())
//           {
//               Toast.makeText(Activity_Radio.this, "Your Name is SHEIKH", Toast.LENGTH_SHORT).show();
//           }
//              else if (radioButton3.isChecked())
//              {
//                  Toast.makeText(Activity_Radio.this, "Your Name is 22", Toast.LENGTH_SHORT).show();
//              }
//              else {
//               Toast.makeText(Activity_Radio.this, "Nothing is selected", Toast.LENGTH_SHORT).show();
//           }
//          }
//      });
    }

//    public void Radio(View view)
//    {
//        int radoi_id = radioGroup.getCheckedRadioButtonId();
//        radioButton = findViewById(radoi_id);
//
//        Toast.makeText(this, "You Name is" + radioButton.getText(), Toast.LENGTH_SHORT).show();
//
//    }
}
