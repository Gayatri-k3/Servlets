package com.xworkz.petrichor.repository;

import com.xworkz.petrichor.dto.FeedbackDto;
import com.xworkz.petrichor.service.FeedbackServiceImpl;
import com.xworkz.petrichor.utils.JdbcConnection;
import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLOutput;

@NoArgsConstructor
public class FeedbackRepoImpl implements FeedbackRepo {

    @Override
    public boolean persist(FeedbackDto feedbackDto) {
        System.out.println("persist method in feedback Repository Implementation");
        try {
            Class.forName(JdbcConnection.driverName);
            Connection connection = DriverManager.getConnection(JdbcConnection.url, JdbcConnection.userName, JdbcConnection.password);
            if (connection != null) {
                System.out.println("Database connection established");
                return true;
            } else {
                System.out.println("Database connection failed");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }
}
