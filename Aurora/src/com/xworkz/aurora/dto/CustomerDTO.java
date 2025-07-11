package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class CustomerDTO {
    private String name;
    private String email;
    private long phone;
    private PassportDTO passport;
}
