package com.xworkz.castle.utils;

import lombok.Getter;

@Getter
public enum JdbcConnection {


    Driver("com.mysql.cj.jdbc.Driver"),
    Url("jdbc:mysql://localhost:3306/Connection"),
    Username("root"),
    Secret("gayatri");

    private final String prop;

    JdbcConnection(String prop) {
        this.prop = prop;
    }
}