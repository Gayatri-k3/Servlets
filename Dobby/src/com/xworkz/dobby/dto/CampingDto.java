package com.xworkz.dobby.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class CampingDto {
    private String productType;
    private boolean isWaterproof;
    private double price;
    private double weightInKg;
    private String suitableFor;
}
