package com.xworkz.weather.servlet;

import com.xworkz.weather.dto.WeatherDTO;
import com.xworkz.weather.service.WeatherService;
import com.xworkz.weather.service.WeatherServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalTime;

@WebServlet(urlPatterns = "/weather", loadOnStartup = 1)
public class WeatherServlet extends HttpServlet {
    public WeatherServlet(){
        System.out.println("Running no-arg const of Weather Servlet");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Running doPost....");
         String place = req.getParameter("place");
         String weather= req.getParameter("weather");
         String humidity= req.getParameter("humidity");
         String precipitation= req.getParameter("precipitation");
         String minTemp= req.getParameter("mintemp");
         String maxTemp= req.getParameter("maxtemp");
         String cloudy= req.getParameter("cloudy");
         String raining= req.getParameter("raining");
         String rainInMM= req.getParameter("rainmm");
         String wind= req.getParameter("wind");
         String sunrise= req.getParameter("sunrise");
         String sunset= req.getParameter("sunset");
         String rainStart= req.getParameter("rainStartTime");
         String rainEnd= req.getParameter("rainEndTime");
         String moonRise= req.getParameter("moonrise");
         String moonSet= req.getParameter("moonset");

        WeatherDTO weatherDTO = new WeatherDTO(place,weather,Double.parseDouble(humidity),Double.parseDouble(precipitation),
                Double.parseDouble(minTemp),Double.parseDouble(maxTemp), cloudy, raining, Double.parseDouble(rainInMM),
                Double.parseDouble(wind), LocalTime.parse(sunrise),LocalTime.parse(sunset), LocalTime.parse(rainStart),
                LocalTime.parse(rainEnd), LocalTime.parse(moonRise),LocalTime.parse(moonSet));
        WeatherService weatherService = new WeatherServiceImpl();
        boolean saved = weatherService.save(weatherDTO);
        if(saved){
            System.out.println("Success");
        }
        else{
            System.out.println("Failed");
        }
    }
}
