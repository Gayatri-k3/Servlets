package com.xworkz.weather.repository;

import com.xworkz.weather.dto.WeatherDTO;

public interface WeatherRepository {
    boolean persist(WeatherDTO weatherDTO);
}
