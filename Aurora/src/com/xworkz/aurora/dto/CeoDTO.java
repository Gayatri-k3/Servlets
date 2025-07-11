package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class CeoDTO {
    private String name;
    private int age;
    private String vision;
    private HouseDTO house;
}
