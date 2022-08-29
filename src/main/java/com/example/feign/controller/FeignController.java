package com.example.feign.controller;

import com.example.feign.client.IWeatherClient;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class FeignController {

    private IWeatherClient weatherClient;

    @GetMapping("/weather")
    public ResponseEntity<Map> getWeather(){
        return ResponseEntity.ok(weatherClient.getWeather().getBody());
    }
}
