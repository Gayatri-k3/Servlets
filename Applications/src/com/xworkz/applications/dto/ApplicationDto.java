package com.xworkz.applications.dto;


import lombok.*;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
@NoArgsConstructor
public class ApplicationDto {
    private String name;
    private ApplicationVersion version;
    private LocalDate createdDate;
    private double size;
    private ApplicationType type;
    private boolean isFree;
    private double chargePerPerson;
    List<OwnerDto> owner;
}
