package com.xworkz.aurora.dto;

import lombok.*;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class HouseDTO {
    private String address;
    private String type;
    private int rooms;
    private SecurityDTO security;
}
