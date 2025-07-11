package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class JobDTO {
    private String role;
    private String department;
    private double salary;
    private DetailDTO detail;
}
