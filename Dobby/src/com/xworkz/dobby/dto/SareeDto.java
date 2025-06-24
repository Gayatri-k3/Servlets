package com.xworkz.dobby.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString

public class SareeDto {
    private String material;
    private String color;
    private String origin;
    private String occasion;
    private double price;
}
