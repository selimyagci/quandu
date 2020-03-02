package com.example.quandu.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RestaurantList {
    @SerializedName("merchants")
    private List<Restaurant> merchants;

    public List<Restaurant> getMerchants() {
        return merchants;
    }

    public void setMerchants(List<Restaurant> merchants) {
        this.merchants = merchants;
    }
}
