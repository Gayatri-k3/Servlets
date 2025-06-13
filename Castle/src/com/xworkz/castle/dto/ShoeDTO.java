package com.xworkz.castle.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class ShoeDTO {
    private String brand;
    private double size;
    private Boolean payment;
    private String material;
    private LocalDate manDate;
    private  String type;
}
