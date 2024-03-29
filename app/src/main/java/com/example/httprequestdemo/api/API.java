package com.example.httprequestdemo.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class API {

    public static final String KEY = "aeeb0cb1f91be6e91250d89b9fbcb0a6";
    public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/";

    private static Retrofit retrofit = null;

    public static Retrofit getApi() {
        if (retrofit == null)
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

        return retrofit;
    }
}
