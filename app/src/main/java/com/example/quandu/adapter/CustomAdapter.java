package com.example.quandu.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.quandu.R;
import com.example.quandu.view.RestaurantDetailActivity;
import com.example.quandu.model.Restaurant;
import com.example.quandu.model.RestaurantList;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomViewHolder> {

    private RestaurantList dataList;
    private Context context;

    public CustomAdapter(Context context, RestaurantList dataList){
        this.context = context;
        this.dataList = dataList;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        public final View mView;

        TextView txtTitle;
        private ImageView coverImage;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;

            txtTitle = mView.findViewById(R.id.res_name);
            coverImage = mView.findViewById(R.id.res_image);
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.rest_display, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, final int position) {
        holder.txtTitle.setText(dataList.getMerchants().get(position).getName());

        Restaurant.Ima im = dataList.getMerchants().get(position).getImages().get(0);

        Picasso.get()
                .load(im.getUrl())
                .resize(120, 120)
                .centerCrop()
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.coverImage);
        final ArrayList<String> urls = new ArrayList<String>();
        for (Restaurant.Ima ima :dataList.getMerchants().get(position).getImages()) {
            urls.add(ima.getUrl());
        }

        holder.coverImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resActivityIntent = new Intent(context, RestaurantDetailActivity.class);
                resActivityIntent.putExtra("images",urls);
                resActivityIntent.putExtra("title",dataList.getMerchants().get(position).getName());
                resActivityIntent.putExtra("phoneNumber",dataList.getMerchants().get(position).getPhoneNumber());
                resActivityIntent.putExtra("score",dataList.getMerchants().get(position).getReviewScore());
                resActivityIntent.putExtra("location",dataList.getMerchants().get(position).getLocation().getAddress().getCity()
                + "-" + dataList.getMerchants().get(position).getLocation().getAddress().getCountry() + "-"
                + dataList.getMerchants().get(position).getLocation().getAddress().getStreet() + "-"
                + dataList.getMerchants().get(position).getLocation().getAddress().getNumber()
                + "-" + dataList.getMerchants().get(position).getLocation().getAddress().getZipcode());
                context.startActivity(resActivityIntent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.getMerchants().size();
    }
}
