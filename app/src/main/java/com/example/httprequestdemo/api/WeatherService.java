package com.example.httprequestdemo.api;

import com.example.httprequestdemo.model.City;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherService {

    //weather?q=Mexico,MX&appid=aeeb0cb1f91be6e91250d89b9fbcb0a6
    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key);
    @GET("weather")
    Call<City> getCity(@Query("q") String city, @Query("appid") String key, @Query("units") String units);
}
