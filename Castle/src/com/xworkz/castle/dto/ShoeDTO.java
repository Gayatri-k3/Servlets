package com.xworkz.castle.dto;

import com.xworkz.castle.constant.ShoeConstant;
import lombok.*;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class ShoeDTO {
    private String brand;
    private double size;
    private String payment;
    private String material;
    private LocalDate manDate;
    private String type;
    private String created_by = ShoeConstant.SYSTEM.toString();
    private Timestamp created_at = Timestamp.valueOf(LocalDateTime.now());
}
