package com.example.demolibsdk;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        Picasso.with(ImageActivity.this)
                .load("https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcRx7cNCJH659lHPp-BykSkHbbY4I5pIzV5DGFaFocWsEdQB-zvG")
                .into(imageView);
    }
}
