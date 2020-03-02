package com.example.quandu.service;

import com.example.quandu.model.RestaurantList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {

    @GET("v1/merchants")
    Call<RestaurantList> getAll();
}
