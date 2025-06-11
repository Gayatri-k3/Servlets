package com.xworkz.weather.dto;

import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class WeatherDTO {
    private String place;
    private String weather;
    private double humidity;
    private double precipitation;
    private double minTemp;
    private double maxTemp;
    private String cloudy;
    private String raining;
    private double rainInMM;
    private double wind;
    private LocalTime sunrise;
    private LocalTime sunset;
    private LocalTime rainStart;
    private LocalTime rainEnd;
    private LocalTime moonRise;
    private LocalTime moonSet;
}
