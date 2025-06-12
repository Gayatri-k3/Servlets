package com.xworkz.weather.repository;

import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import com.xworkz.weather.dto.WeatherDTO;
import com.xworkz.weather.utils.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;

public class WeatherRepositoryImpl implements WeatherRepository{

    public WeatherRepositoryImpl(){
        System.out.println("Running no-arg const of WeatherRepoImpl");
    }
    LocalTime localTime = LocalTime.now();
    @Override
    public boolean persist(WeatherDTO weatherDTO) {
        if(weatherDTO != null){
            System.out.println("Saving to DTO");
            try {
                Class.forName(JdbcConnection.driverName);
                Connection connection = DriverManager.getConnection(JdbcConnection.url, JdbcConnection.userName, JdbcConnection.password);
                String query =("INSERT INTO weather_report VALUES (0, '" + weatherDTO.getPlace() + "', '" +
                        weatherDTO.getWeather() + "', " + weatherDTO.getHumidity() + ", " +
                        weatherDTO.getPrecipitation() + ", " + weatherDTO.getMinTemp() + ", " +
                        weatherDTO.getMaxTemp() + ", '" + weatherDTO.getCloudy() + "', '" +
                        weatherDTO.getRaining() + "', " + weatherDTO.getRainInMM() + ", " +
                        weatherDTO.getWind() + ", '" + weatherDTO.getSunrise() + "', '" +
                        weatherDTO.getSunset() + "', '" + weatherDTO.getRainStart() + "', '" +
                        weatherDTO.getRainEnd() + "', '" + weatherDTO.getMoonRise() + "', '" +
                        weatherDTO.getMoonSet() + "', localTime)");
                Statement statement = connection.createStatement();
                statement.executeUpdate(query);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("persist running in repo");
            return true;
        }
        return false;
    }
}
