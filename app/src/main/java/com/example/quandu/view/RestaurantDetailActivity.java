package com.example.quandu.view;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.quandu.R;
import com.example.quandu.adapter.ImageAdapter;

import java.util.ArrayList;

public class RestaurantDetailActivity extends AppCompatActivity {

    ArrayList<String> images;
    String resTitle, resPhoneNo, resLocation, resScore, resTags;
    TextView title,phoneNumber,location,score,tags;
    ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant);

        images = (ArrayList<String>) getIntent().getExtras().get("images");
        resTitle = (String) getIntent().getExtras().get("title");
        resPhoneNo = (String) getIntent().getExtras().get("phoneNumber");
        resScore = (String) getIntent().getExtras().get("score");
        resLocation = (String) getIntent().getExtras().get("location");
        getSupportActionBar().setTitle(resTitle);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        title = findViewById(R.id.title);
        title.setText("Name: "+ resTitle);
        phoneNumber = findViewById(R.id.phoneNumber);
        phoneNumber.setText("Phone no: "+ resPhoneNo);
        location = findViewById(R.id.location);
        location.setText("Location: " + resLocation);
        score = findViewById(R.id.reviewScore);
        score.setText("Review Score: " + resScore);
        tags = findViewById(R.id.tags);
        mViewPager= findViewById(R.id.viewPage);
        ImageAdapter adapterView = new ImageAdapter(this, images);
        mViewPager.setAdapter(adapterView);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        super.onBackPressed();
        return super.onOptionsItemSelected(item);
    }
}
