package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class CompanyDTO {
    private String name;
    private String location;
    private int employeeCount;
    private CeoDTO ceo;
}
