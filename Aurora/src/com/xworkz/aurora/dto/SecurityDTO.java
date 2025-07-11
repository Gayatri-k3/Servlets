package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class SecurityDTO {
    private String name;
    private int age;
    private String shift;
    private JobDTO job;
}
