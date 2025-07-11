package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class VehicleDTO {
    private String type;
    private String model;
    private String color;
    private CompanyDTO company;
}
