package com.example.quandu.adapter;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.quandu.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class ImageAdapter extends PagerAdapter {
    Context mContext;
    ArrayList<String> sliderImageId;

    public ImageAdapter(Context context, ArrayList<String> sliderImageId){
        this.mContext=context;
        this.sliderImageId = sliderImageId;
    }

    @Override
    public boolean isViewFromObject(View view, Object object){
        return view == ((ImageView)object);
    }



    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        ImageView imageView = new ImageView(mContext);
        Picasso.get()
                .load(sliderImageId.get(position))
                .resize(200, 120)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(imageView);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((ImageView) object);
    }

    @Override
    public int getCount() {
        return sliderImageId.size();
    }
}
