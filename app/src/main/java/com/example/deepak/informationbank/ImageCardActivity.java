package com.example.deepak.informationbank;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ImageCardActivity extends AppCompatActivity implements View.OnClickListener{
    ViewPager viewPager;
    int image[];
    ImageCardAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_card);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(this);

        image = new int[] { R.drawable.day1, R.drawable.day2,
                R.drawable.day3, R.drawable.day4,
                R.drawable.day5, R.drawable.day6, R.drawable.day7
        };

        // Locate the ViewPager in viewpager_main.xml
        viewPager = (ViewPager) findViewById(R.id.pager);
        // Pass results to ViewPagerAdapter Class
        adapter = new ImageCardAdapter(ImageCardActivity.this,image);
        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);
    }
    @Override
    public void onClick(View view) {

        //UPDATE DATABASE BY TAKING THE NEW CHOICES
        Intent i = new Intent(ImageCardActivity.this,SwipeCardActivity.class);

        startActivity(i);

    }

}
