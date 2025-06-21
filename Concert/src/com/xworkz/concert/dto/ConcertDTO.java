package com.xworkz.concert.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.sql.Timestamp;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConcertDTO {
    private String name;
    private String email;
    private Long number;
    private String AName;
    private String location;
    private int id;
    private Timestamp created_at = Timestamp.valueOf(LocalDateTime.now());
}
