package com.example.httprequestdemo.api;

import com.example.httprequestdemo.model.City;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {

    public static final String KEY = "aeeb0cb1f91be6e91250d89b9fbcb0a6";
    public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/";

    private static Retrofit retrofit = null;

    public static Retrofit getApi() {
        if (retrofit == null) {
            GsonBuilder builder = new GsonBuilder();
            builder.registerTypeAdapter(City.class, new MyDeserealizer());
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(builder.create()))
                    .build();
        }

        return retrofit;
    }
}
