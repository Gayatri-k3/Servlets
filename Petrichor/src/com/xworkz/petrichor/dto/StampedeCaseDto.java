package com.xworkz.petrichor.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class StampedeCaseDto {
    private String event;
    private int deaths;
    private int injuries;
    private String location;

}
