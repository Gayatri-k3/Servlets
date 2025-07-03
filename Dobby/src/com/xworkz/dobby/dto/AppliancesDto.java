package com.xworkz.dobby.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class AppliancesDto implements Comparable<AppliancesDto>{
    private String type;
    private double storage;
    private double price;
    private double RAM;
    private String material;

    @Override
    public int compareTo(AppliancesDto o) {
        System.out.println("running compare to in AppliancesDto");
        AppliancesDto left=this;
        if(left.price== o.price){
            return 0;
        } else if (left.price> o.price) {
            return 1;
        }
        return -1;
    }
}
