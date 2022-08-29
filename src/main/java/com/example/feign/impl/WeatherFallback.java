package com.example.feign.impl;

import com.example.feign.client.IWeatherClient;
import org.springframework.http.ResponseEntity;

import java.util.Map;

public class WeatherFallback implements IWeatherClient {

    @Override
    public ResponseEntity<Map> getWeather() {
        return null;
    }
}
