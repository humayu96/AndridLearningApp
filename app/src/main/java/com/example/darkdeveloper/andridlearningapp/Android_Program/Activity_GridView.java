package com.example.darkdeveloper.andridlearningapp.Android_Program;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.darkdeveloper.andridlearningapp.R;
import com.github.chrisbanes.photoview.PhotoView;

public class Activity_GridView extends AppCompatActivity {

    GridView gridView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__grid_view);




        ImageView mIcon1 = findViewById(R.id.gridxml);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(), R.drawable.gridxml);
        RoundedBitmapDrawable mDrawable1 = RoundedBitmapDrawableFactory.create(getResources(), bitmap1);
        mDrawable1.setCircular(false);
        mIcon1.setImageDrawable(mDrawable1);

        mIcon1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder mBuilder = new AlertDialog.Builder(Activity_GridView.this);
                View mView = getLayoutInflater().inflate(R.layout.dialog_custom_layout, null);
                PhotoView photoView = mView.findViewById(R.id.imageView);
                photoView.setImageResource(R.drawable.gridxml);
                mBuilder.setView(mView);
                AlertDialog mDialog = mBuilder.create();
                mDialog.show();
            }
        });





       // gridView = (GridView) findViewById(R.id.gridview);
        //gridView.setAdapter(new ImageAdapter2(this));

        }
//    public class ImageAdapter2 extends BaseAdapter {
//        private Context nContext;
//
//        public ImageAdapter2(Context context) {
//            nContext = context;
//        }
//
//        public int getCount() {
//            return mThumbIds.length;
//        }
//
//        public Object getItem(int position) {
//            return null;
//        }
//
//        public long getItemId(int position) {
//            return 0;
//        }
//
//        // create a new ImageView for each item referenced by the Adapter
//        public View getView(int position, View convertView, ViewGroup parent) {
//            ImageView imageView;
//            if (convertView == null) {
//                // if it's not recycled, initialize some attributes
//                imageView = new ImageView(nContext);
//                imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
//                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//                imageView.setPadding(8, 8, 8, 8);
//            } else {
//                imageView = (ImageView) convertView;
//            }
//
//            imageView.setImageResource(mThumbIds[position]);
//            return imageView;
//        }
//
//        // references to our images
//        private Integer[] mThumbIds = {
//                R.drawable.car2,R.drawable.gallardo, R.drawable.maleran, R.drawable.rain, R.drawable.car2,
//        };
//    }
}



