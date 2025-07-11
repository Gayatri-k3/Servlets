package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class PassportDTO {
    private String number;
    private String issueDate;
    private String expiryDate;
    private CountryDTO country;
}
