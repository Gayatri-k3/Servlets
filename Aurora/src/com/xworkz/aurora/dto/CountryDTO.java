package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class CountryDTO {
    private String name;
    private String capital;
    private long population;
    private PresidentDTO president;
}
