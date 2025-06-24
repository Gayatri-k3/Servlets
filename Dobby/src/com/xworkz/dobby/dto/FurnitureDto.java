package com.xworkz.dobby.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class FurnitureDto {
    private String furnitureType;
    private boolean multiplePieces;
    private double price;
    private double weightInKg;
    private String material;
}
