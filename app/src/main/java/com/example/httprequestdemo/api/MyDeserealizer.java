package com.example.httprequestdemo.api;

import com.example.httprequestdemo.model.City;
import com.example.httprequestdemo.model.Temperature;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class MyDeserealizer implements JsonDeserializer<City> {

    @Override
    public City deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonObject cityJSObject = json.getAsJsonObject();

        //Propiedades directas del JSon
        String name = cityJSObject.get("name").getAsString();
        int id = cityJSObject.get("id").getAsInt();

        //Objeto que contiene los datos de la temperatura. En el Json viene como 'main'
        Temperature temp = City.parseTempJSON(cityJSObject.getAsJsonObject("main").toString());

        //propiedad que viene dentro de un objeto con mas propiedades. Pero solo me interesa esta
        String countyCode = cityJSObject.getAsJsonObject("sys").get("country").getAsString();

        City city = new City(id, name, temp, countyCode);

        return city;
    }
}
