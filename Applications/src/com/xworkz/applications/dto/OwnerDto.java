package com.xworkz.applications.dto;

import lombok.*;


@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class OwnerDto {
    private String ownerName;
    private String ownerEmail;
    private Long ownerPhone;
}
