package com.xworkz.aurora.dto;


import lombok.*;

import java.util.Arrays;
import java.util.Objects;

@Getter
@AllArgsConstructor
@ToString
public class SweetDTO {
    private String name;
    private double price;
    private String[] ingredients;
    private double quantity;
    private int pack;

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj!=null){
            if(obj instanceof SweetDTO){
                SweetDTO casted = (SweetDTO) obj;
                return Arrays.equals(this.ingredients, casted.ingredients);
            }
        }
        return false ;
    }
}
