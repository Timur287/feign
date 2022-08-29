package com.example.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name="data" , url = "${feign.client.url}")
public interface IWeatherClient {

    @GetMapping
    ResponseEntity<Map> getWeather();


}
