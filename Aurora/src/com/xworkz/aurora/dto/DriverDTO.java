package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class DriverDTO {
    private String name;
    private String licenseNumber;
    private int experienceYears;
    private VehicleDTO vehicle;
}
