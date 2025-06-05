package com.xworkz.restraunt.dto;

import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantDto {
    private String name;
    private String location;
    private String contactDetails;
    private String email;
    private String rating;
    private String []foodMenu;
    private String type;
    private LocalTime openingTime;
    private LocalTime closingTime;
    private LocalDate bookedDate;
    private LocalTime bookedTime;
}
