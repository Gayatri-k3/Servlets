package com.xworkz.streamexamples.dto;


import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ProductDto implements Comparable<ProductDto>{
    public int id;
    public String name;
    public String type;
    public LocalDate manufacturedDate;
    public String manufacturer;
    public double costPerItem;
    public double discount;
    public int quantity;
    public int warrantyInYears;



    @Override
    public int compareTo(ProductDto o) {
        return Double.compare(this.id,o.id);
    }
}
