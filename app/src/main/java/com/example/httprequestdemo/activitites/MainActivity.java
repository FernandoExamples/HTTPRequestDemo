package com.example.httprequestdemo.activitites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.example.httprequestdemo.R;
import com.example.httprequestdemo.api.API;
import com.example.httprequestdemo.api.WeatherService;
import com.example.httprequestdemo.model.City;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = API.getApi();
        WeatherService service = retrofit.create(WeatherService.class);

        Call<City> cityCall = service.getCity("Mexico,MX", API.KEY, "metric");

        cityCall.enqueue(new Callback<City>() {
            @Override
            public void onResponse(Call<City> call, Response<City> response) {
                City city = response.body();
                Toast.makeText(MainActivity.this, city.getId() + " " + city.getName(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onFailure(Call<City> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Error al obtener la info", Toast.LENGTH_LONG).show();
            }
        });
    }
}
