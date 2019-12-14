package com.example.httprequestdemo.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.annotations.SerializedName;

public class City {

    private int id;
    private String name;

    @SerializedName("main")
    private Temperature temperature;

    private String countyCode;

    public City() {
    }

    public City(int id, String name, Temperature temperature) {
        this.id = id;
        this.name = name;
        this.temperature = temperature;
    }

    public City(int id, String name, Temperature temperature, String countyCode) {
        this.id = id;
        this.name = name;
        this.temperature = temperature;
        this.countyCode = countyCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public void setTemperature(Temperature temperature) {
        this.temperature = temperature;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public void setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public static Temperature parseTempJSON(String json){
        Gson gson = new GsonBuilder().create();
        Temperature temp = gson.fromJson(json, Temperature.class);
        return temp;
    }
}
