package com.shreyash.pincode;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/weather")
public class Controller {

    @Autowired
    private MyService weatherService;

    // Get weather data by pincode and date
    @GetMapping
    public List<WeatherInfo> getWeatherByPincodeAndDate(@RequestParam String pincode, @RequestParam String date) {
        LocalDate localDate = LocalDate.parse(date);
        return weatherService.getWeatherByPincodeAndDate(pincode, localDate);
    }

    // Post weather data including pincode, lat, lon, and weather info
    @PostMapping("/add")
    public WeatherInfo addWeatherData(@RequestBody WeatherInfo weatherInfo) {
        return weatherService.addWeatherData(weatherInfo);
    }
}
