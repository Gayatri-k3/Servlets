package com.xworkz.castle.repository;

import com.xworkz.castle.dto.ShoeDTO;
import com.xworkz.castle.utils.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

public class ShoeRepositoryImpl implements ShoeRepository{
    public ShoeRepositoryImpl(){
        System.out.println("Running No-arg const of Shoe repo impl");
    }
    LocalDateTime local = LocalDateTime.now();
    @Override
    public boolean persist(ShoeDTO shoeDTO) {
        if(shoeDTO != null){
            System.out.println("Saving to DTO");
            try{
                Class.forName(JdbcConnection.driverName);
                Connection connection = DriverManager.getConnection(JdbcConnection.url,JdbcConnection.userName,JdbcConnection.password);
                String query = "INSERT INTO shoe VALUES (0, '" +
                        shoeDTO.getBrand() + "', " +
                        shoeDTO.getSize() + ",' " +
                        shoeDTO.getPayment() + "', '" +
                        shoeDTO.getMaterial() + "', '" +
                        shoeDTO.getManDate() + "', '" +
                        shoeDTO.getType() + "', NOW())";
                Statement statement = connection.createStatement();
                statement.executeUpdate(query);
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("persist running in repo");
        return true;
    }
    @Override
    public Optional<ShoeDTO> findById(int shoeID) {
        System.out.println("findById method in shoe Repository impl");
        return ShoeRepository.super.findById(shoeID);
    }
}

