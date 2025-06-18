package com.xworkz.castle.repository;

import com.xworkz.castle.dto.ShoeDTO;
import com.xworkz.castle.utils.JdbcConnection;

import java.sql.*;
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
                Class.forName(JdbcConnection.Driver.getProp());
                Connection connection = DriverManager.getConnection(JdbcConnection.Url.getProp(),JdbcConnection.Username.getProp(), JdbcConnection.Secret.getProp());
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
        try{
            Class.forName(JdbcConnection.Driver.getProp());
            Connection connection = DriverManager.getConnection(JdbcConnection.Url.getProp(),JdbcConnection.Username.getProp(), JdbcConnection.Secret.getProp());
            Statement statement=connection.createStatement();
            String query="SELECT * FROM shoe AS shoe where shoe.id="+shoeID+";";
            ResultSet resultSet=statement.executeQuery(query);
            while(resultSet.next())
            {
                String brand=resultSet.getString("brand");
                double size=resultSet.getDouble("size");
                String payment=resultSet.getString("payment");
                String type=resultSet.getString("type");
                String material=resultSet.getString("materisl");
                LocalDate manuDate=resultSet.getDate("manDate").toLocalDate();

                ShoeDTO shoeDTO=new ShoeDTO(brand,size,payment,material,manuDate,type);
                return Optional.of(shoeDTO);
            }

        } catch (SQLException |ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        return Optional.empty();
    }
}
