package com.xworkz.weather.service;

import com.xworkz.weather.dto.WeatherDTO;
import com.xworkz.weather.repository.WeatherRepository;
import com.xworkz.weather.repository.WeatherRepositoryImpl;

import java.time.LocalTime;

public class WeatherServiceImpl implements WeatherService{

    public WeatherServiceImpl(){
        System.out.println("No-arg const of service");
    }
    @Override
    public boolean save(WeatherDTO weatherDTO) {
        if (weatherDTO == null) {
            System.out.println("DTO is null");
            return false;
        }

        if (weatherDTO.getPlace() == null || weatherDTO.getPlace().isEmpty()) {
            System.out.println("Invalid place");
            return false;
        }

        if (weatherDTO.getWeather() == null || weatherDTO.getWeather().isEmpty()) {
            System.out.println("Invalid weather");
            return false;
        }

        if (weatherDTO.getHumidity() < 0) {
            System.out.println("Humidity cannot be negative");
            return false;
        }

        if (weatherDTO.getPrecipitation() < 0) {
            System.out.println("Precipitation cannot be negative");
            return false;
        }

        if (weatherDTO.getMinTemp() > weatherDTO.getMaxTemp()) {
            System.out.println("Min temperature cannot be greater than max temperature");
            return false;
        }

        if (weatherDTO.getCloudy() == null || weatherDTO.getCloudy().isEmpty()) {
            System.out.println("Cloudy info is missing");
            return false;
        }

        if (weatherDTO.getRaining() == null || weatherDTO.getRaining().isEmpty()) {
            System.out.println("Raining info is missing");
            return false;
        }

        if (weatherDTO.getRainInMM() < 0) {
            System.out.println("Rain in mm cannot be negative");
            return false;
        }

        if (weatherDTO.getWind() < 0) {
            System.out.println("Wind cannot be negative");
            return false;
        }

        if (weatherDTO.getSunrise() == null) {
            System.out.println("Sunrise time is missing");
            return false;
        }

        if (weatherDTO.getSunset() == null) {
            System.out.println("Sunset time is missing");
            return false;
        }

        if (weatherDTO.getRainStart() == null) {
            System.out.println("Rain start time is missing");
            return false;
        }

        if (weatherDTO.getRainEnd() == null) {
            System.out.println("Rain end time is missing");
            return false;
        }

        if (weatherDTO.getMoonRise() == null) {
            System.out.println("Moon rise time is missing");
            return false;
        }

        if (weatherDTO.getMoonSet() == null) {
            System.out.println("Moon set time is missing");
            return false;
        }

        System.out.println("Validation successful, saving data...");
        WeatherRepository weatherRepository = new WeatherRepositoryImpl();
        weatherRepository.persist(weatherDTO);
        return true;
    }
}