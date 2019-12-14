# HTTPRequestDemo 

Ejemplo de peticiones HTTP en Android con GSON y Retrofit

- El api usado es el siguiente: <https://openweathermap.org/current>
- El JSon recibido en esta app es:

~~~
{
  "coord": {
    "lon": -111.63,
    "lat": 28.62
  },
  "weather": [
    {
      "id": 800,
      "main": "Clear",
      "description": "clear sky",
      "icon": "01n"
    }
  ],
  "base": "stations",
  "main": {
    "temp": 11.39,
    "feels_like": 9.98,
    "temp_min": 10,
    "temp_max": 12.78,
    "pressure": 1017,
    "humidity": 92
  },
  "wind": {
    "speed": 2.13,
    "deg": 308
  },
  "clouds": {
    "all": 2
  },
  "dt": 1576305999,
  "sys": {
    "type": 3,
    "id": 2016202,
    "country": "MX",
    "sunrise": 1576246230,
    "sunset": 1576283461
  },
  "timezone": -25200,
  "id": 3991622,
  "name": "Mexico",
  "cod": 200
}
~~~
