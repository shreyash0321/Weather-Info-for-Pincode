package com.shreyash.pincode;


import java.time.LocalDate;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface WeatherJpa extends JpaRepository<WeatherInfo, Long> {
    List<WeatherInfo> findByPincodeAndDate(String pincode, LocalDate date);
}