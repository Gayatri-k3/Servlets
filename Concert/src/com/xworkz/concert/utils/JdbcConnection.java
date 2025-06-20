package com.xworkz.concert.utils;

import lombok.Getter;

@Getter
public enum JdbcConnection {


    DRIVER("com.mysql.cj.jdbc.Driver"),
    URL("jdbc:mysql://localhost:3306/Connection"),
    USERNAME("root"),
    SECRET("gayatri");

    private final String prop;

    JdbcConnection(String prop) {
        this.prop = prop;
    }
}