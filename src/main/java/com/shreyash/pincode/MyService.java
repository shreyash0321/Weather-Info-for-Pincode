package com.shreyash.pincode;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {
	

    @Autowired
    private WeatherJpa weatherInfoRepo;

    // Retrieve weather info based on pincode and date
    
    public List<WeatherInfo> getWeatherByPincodeAndDate(String pincode, LocalDate date) {
        return weatherInfoRepo.findByPincodeAndDate(pincode, date);
    }
    
    // Add new weather info (including pincode, lat/lon, and weather details)
    
    public WeatherInfo addWeatherData(WeatherInfo weatherInfo) {
        return weatherInfoRepo.save(weatherInfo);
    }
}