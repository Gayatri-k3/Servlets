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
                String query = "INSERT INTO shoe (brand, size, payment, material, man_date, type, created_at, created_by) VALUES (?,?,?,?,?,?,?,?)";
                PreparedStatement statement = connection.prepareStatement(query);
                statement.setString(1,shoeDTO.getBrand());
                statement.setDouble(2,shoeDTO.getSize());
                statement.setString(3,shoeDTO.getPayment());
                statement.setString(4,shoeDTO.getMaterial());
                statement.setDate(5, Date.valueOf(shoeDTO.getManDate()));
                statement.setString(6,shoeDTO.getType());
                statement.setTimestamp(7, shoeDTO.getCreated_at());
                statement.setString(8, shoeDTO.getCreated_by());
                int result = statement.executeUpdate(query);
                if(result > 0){
                    return true;
                }
            } catch (SQLException | ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        return false;
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
                String material=resultSet.getString("material");
                LocalDate manuDate=resultSet.getDate("manDate").toLocalDate();
                String created_by = resultSet.getString("created_by");
                Timestamp created_at = resultSet.getTimestamp("created_at");

                ShoeDTO shoeDTO=new ShoeDTO(brand,size,payment,material,manuDate,type, created_by, created_at);
                return Optional.of(shoeDTO);
            }

        } catch (SQLException |ClassNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        return Optional.empty();
    }

    @Override
    public ShoeDTO[] findAll() {
        ShoeDTO[] shoeDTOs = null;
        try{
            Class.forName(JdbcConnection.Driver.getProp());
            Connection connection = DriverManager.getConnection(JdbcConnection.Url.getProp(),JdbcConnection.Username.getProp(), JdbcConnection.Secret.getProp());
            String query = "SELECT * FROM shoe";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int index=0;
                int arraySize=1;
                shoeDTOs = new ShoeDTO[arraySize];
                System.out.println(resultSet.getString("brand"));
                System.out.println(resultSet.getDouble("size"));
                System.out.println(resultSet.getString("payment"));
                System.out.println(resultSet.getString("type"));
                System.out.println(resultSet.getString("material"));
                System.out.println(resultSet.getDate("manDate").toLocalDate());
                System.out.println(resultSet.getString("created_by"));
                System.out.println( resultSet.getTimestamp("created_at"));
                System.out.println("---------------------------------------------");
                ShoeDTO shoeDTO = new ShoeDTO();
                shoeDTO.setBrand(resultSet.getString("brand"));
                shoeDTO.setType(resultSet.getString("type"));
                shoeDTO.setSize(resultSet.getDouble("size"));
                shoeDTO.setPayment(resultSet.getString("payment"));
                shoeDTO.setMaterial(resultSet.getString("material"));
                shoeDTO.setManDate(resultSet.getDate("manDate").toLocalDate());
                shoeDTO.setCreated_by(resultSet.getString("created_by"));
                shoeDTO.setCreated_at(resultSet.getTimestamp("created_at"));
                shoeDTOs[index]=shoeDTO;
                arraySize++;
                index++;
            }
        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
        return shoeDTOs;
    }
}
