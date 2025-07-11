package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class PresidentDTO {
    private String name;
    private String party;
    private int termYears;
    private DriverDTO driver;
}
