package com.xworkz.dobby.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
@Getter
@AllArgsConstructor
@ToString

public class DynastyDto implements Serializable {
    private String name;
    private String originRegion;
    private int startYear;
    private int endYear;
    private String famousRuler;
}
