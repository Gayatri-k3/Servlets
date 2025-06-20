package com.xworkz.concert.repository;

import com.xworkz.concert.dto.ConcertDTO;
import com.xworkz.concert.utils.JdbcConnection;

import java.sql.*;

public class ConcertRepoImpl implements ConcertRepo{
    public ConcertRepoImpl(){
        System.out.println("repo const");
    }
    @Override
    public boolean persist(ConcertDTO concertDTO) {
        if(concertDTO!=null){
            try {
                Class.forName(JdbcConnection.DRIVER.getProp());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            String query = "INSERT INTO concert(name,number,email,artist_name,location,created_at) VALUES (?,?,?,?,?,?)";
            try(Connection connection = DriverManager.getConnection(JdbcConnection.URL.getProp(),JdbcConnection.USERNAME.getProp(), JdbcConnection.SECRET.getProp());
                PreparedStatement statement = connection.prepareStatement(query);) {
                statement.setString(1,concertDTO.getName());
                statement.setLong(2,concertDTO.getNumber());
                statement.setString(3,concertDTO.getEmail());
                statement.setString(4,concertDTO.getAName());
                statement.setString(5,concertDTO.getLocation());
                statement.setTimestamp(6,concertDTO.getCreated_at());
                int result = statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println("Save to db failed");
                throw new RuntimeException(e);
            }
        }
        return false;
    }
}
