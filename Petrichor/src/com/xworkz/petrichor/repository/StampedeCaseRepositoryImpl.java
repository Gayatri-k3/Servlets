package com.xworkz.petrichor.repository;

import com.xworkz.petrichor.dto.StampedeCaseDto;
import com.xworkz.petrichor.utils.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedeCaseRepositoryImpl implements StampedeCaseRepository {
    @Override
    public boolean persist(StampedeCaseDto stampedeCaseDto) {
        if (stampedeCaseDto != null) {
            System.out.println("Saving to the db");
            try {
                Class.forName(JdbcConnection.driverName);
                Connection connection = DriverManager.getConnection(JdbcConnection.url, JdbcConnection.userName, JdbcConnection.password);
                String query = "insert into stampede_case values(0,'"+ stampedeCaseDto.getEvent() +"'," + stampedeCaseDto.getDeaths() + "," + stampedeCaseDto.getInjuries() + ",'" + stampedeCaseDto.getLocation() + "')";
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
