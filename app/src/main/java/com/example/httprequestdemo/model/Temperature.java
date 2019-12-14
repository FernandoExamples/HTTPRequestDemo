package com.example.httprequestdemo.model;

import com.google.gson.annotations.SerializedName;

public class Temperature {

    @SerializedName("temp")
    private float temperature;
    @SerializedName("pressure")
    private float pressure;
    @SerializedName("temp_min")
    private float tempMin;
    @SerializedName("temp_max")
    private float tempMax;
    @SerializedName("humidity")
    private float humidity;

    public Temperature() {
    }

    public Temperature(float temperature, float pressure, float tempMin, float tempMax, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.tempMin = tempMin;
        this.tempMax = tempMax;
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    public float getTempMin() {
        return tempMin;
    }

    public void setTempMin(float tempMin) {
        this.tempMin = tempMin;
    }

    public float getTempMax() {
        return tempMax;
    }

    public void setTempMax(float tempMax) {
        this.tempMax = tempMax;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
}
