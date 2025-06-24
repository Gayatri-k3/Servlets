package com.xworkz.dobby.runner;

import com.xworkz.dobby.dto.SareeDto;

import java.util.ArrayList;
import java.util.Collection;

public class SareeRunner {
    public static void main(String[] args) {
        SareeDto sareeDto1 = new SareeDto("Silk", "Pink", "Mysore", "Marriage", 35000);
        SareeDto sareeDto2 = new SareeDto("Cotton", "White", "Chennai", "Temple Visit", 1200);
        SareeDto sareeDto3 = new SareeDto("Kanjeevaram", "Red", "Kanchipuram", "Festival", 42000);
        SareeDto sareeDto4 = new SareeDto("Georgette", "Blue", "Mumbai", "Party", 2500);
        SareeDto sareeDto5 = new SareeDto("Chiffon", "Green", "Delhi", "Office Wear", 1800);
        SareeDto sareeDto6 = new SareeDto("Banarasi", "Gold", "Varanasi", "Wedding", 55000);
        SareeDto sareeDto7 = new SareeDto("Linen", "Beige", "Kolkata", "Casual", 2200);
        SareeDto sareeDto8 = new SareeDto("Tussar", "Maroon", "Bangalore", "Reception", 3900);
        SareeDto sareeDto9 = new SareeDto("Organza", "Purple", "Hyderabad", "Engagement", 3000);
        SareeDto sareeDto10 = new SareeDto("Patola", "Orange", "Ahmedabad", "Cultural Event", 47000);

        Collection<SareeDto> collection = new ArrayList<>();
        collection.add(sareeDto1);
        collection.add(sareeDto2);
        collection.add(sareeDto3);
        collection.add(sareeDto4);
        collection.add(sareeDto5);
        collection.add(sareeDto6);
        collection.add(sareeDto7);
        collection.add(sareeDto8);
        collection.add(sareeDto9);
        collection.add(sareeDto10);

        for(SareeDto sareeDto : collection){
            System.out.println(sareeDto );
        }
    }
}
