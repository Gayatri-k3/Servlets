package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class DetailDTO {
    private String description;
    private String languageKnown;
    private int experienceYears;
    private EducationDTO education;
}
