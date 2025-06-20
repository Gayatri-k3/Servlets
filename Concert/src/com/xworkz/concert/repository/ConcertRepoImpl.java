package com.xworkz.concert.repository;

import com.xworkz.concert.dto.ConcertDTO;
import com.xworkz.concert.utils.JdbcConnection;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

public class ConcertRepoImpl implements ConcertRepo {
    ConcertDTO concertDTO = new ConcertDTO();

    public ConcertRepoImpl() {
        System.out.println("repo const");
    }

    @Override
    public boolean persist(ConcertDTO concertDTO) {
        if (concertDTO != null) {
            try {
                Class.forName(JdbcConnection.DRIVER.getProp());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            String query = "INSERT INTO concert(name,number,email,artist_name,location,created_at) VALUES (?,?,?,?,?,?)";
            try (Connection connection = DriverManager.getConnection(JdbcConnection.URL.getProp(), JdbcConnection.USERNAME.getProp(), JdbcConnection.SECRET.getProp());
                 PreparedStatement statement = connection.prepareStatement(query);) {
                statement.setString(1, concertDTO.getName());
                statement.setLong(2, concertDTO.getNumber());
                statement.setString(3, concertDTO.getEmail());
                statement.setString(4, concertDTO.getAName());
                statement.setString(5, concertDTO.getLocation());
                statement.setTimestamp(6, concertDTO.getCreated_at());
                int result = statement.executeUpdate();
            } catch (SQLException e) {
                System.out.println("Save to db failed");
                throw new RuntimeException(e);
            }
        }
        return false;
    }
    @Override
    public Optional<ConcertDTO> findById(int id) {
        System.out.println("findById method in ConcertRepoImpl");
        try {
            Class.forName(JdbcConnection.DRIVER.getProp());
            Connection connection = DriverManager.getConnection(
                    JdbcConnection.URL.getProp(),
                    JdbcConnection.USERNAME.getProp(),
                    JdbcConnection.SECRET.getProp()
            );
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM concert WHERE id=" + id;
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                Long number = resultSet.getLong("number");
                String email = resultSet.getString("email");
                String artistName = resultSet.getString("artist_name");
                String location = resultSet.getString("location");
                Timestamp createdAt = resultSet.getTimestamp("created_at");

                ConcertDTO concertDTO = new ConcertDTO();
                concertDTO.setName(name);
                concertDTO.setNumber(number);
                concertDTO.setEmail(email);
                concertDTO.setAName(artistName);
                concertDTO.setLocation(location);
                concertDTO.setCreated_at(createdAt);

                return Optional.of(concertDTO);
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error in findById: " + e.getMessage());
        }

        return Optional.empty();
    }


}