package com.xworkz.dobby.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.ToString;
@AllArgsConstructor
@Data
public class AppliancesDto {
    private String type;
    private double storage;
    private double price;
    private double RAM;
    private String material;

}
