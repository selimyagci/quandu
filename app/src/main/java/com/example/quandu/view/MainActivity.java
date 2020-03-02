package com.example.quandu.view;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.quandu.service.GetDataService;
import com.example.quandu.R;
import com.example.quandu.service.RetrofitClientInstance;
import com.example.quandu.adapter.CustomAdapter;
import com.example.quandu.model.RestaurantList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView restaurantList;
    CustomAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<RestaurantList> call = service.getAll();
        call.enqueue(new Callback<RestaurantList>() {
            @Override
            public void onResponse(Call<RestaurantList> call, Response<RestaurantList> response) {
                generateDataList(response.body());
            }

            @Override
            public void onFailure(Call<RestaurantList> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void generateDataList(RestaurantList resList){
        restaurantList = findViewById(R.id.restaurant_list);
        adapter = new CustomAdapter(this,resList);
        restaurantList.setLayoutManager(new GridLayoutManager(this,3));
        restaurantList.setAdapter(adapter);
    }
}
