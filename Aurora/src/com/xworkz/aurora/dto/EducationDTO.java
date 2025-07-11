package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class EducationDTO {
    private String qualification;
    private String university;
    private int yearOfPassing;
    private String grade;
}
