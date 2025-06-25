package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.CampingDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class CampingRepositoryImpl implements CampingRepository{
    @Override
    public Collection<CampingDto> findAll() {
        CampingDto campingDto1 = new CampingDto("Tent", true, 3999.99, 5.0, "Rainy Season");
        CampingDto campingDto2 = new CampingDto("Sleeping Bag", true, 1499.50, 1.2, "Winter");
        CampingDto campingDto3 = new CampingDto("Lantern", false, 799.00, 0.8, "Night Camps");
        CampingDto campingDto4 = new CampingDto("Camping Stove", false, 1899.99, 2.5, "All Seasons");
        CampingDto campingDto5 = new CampingDto("Backpack", true, 2499.75, 1.0, "Hiking");
        CampingDto campingDto6 = new CampingDto("Water Bottle", true, 599.49, 0.6, "All Seasons");
        CampingDto campingDto7 = new CampingDto("First Aid Kit", false, 999.99, 0.9, "Emergency");
        CampingDto campingDto8 = new CampingDto("Camping Chair", false, 1199.00, 3.5, "Resting");
        CampingDto campingDto9 = new CampingDto("Fire Starter", false, 299.00, 0.2, "Survival");
        CampingDto campingDto10 = new CampingDto("Hiking Boots", true, 3499.00, 1.8, "Mountain Trek");

        Collection<CampingDto> collection = new ArrayList();
        collection.add(campingDto1);
        collection.add(campingDto2);
        collection.add(campingDto3);
        collection.add(campingDto4);
        collection.add(campingDto5);
        collection.add(campingDto6);
        collection.add(campingDto7);
        collection.add(campingDto8);
        collection.add(campingDto9);
        collection.add(campingDto10);

        return collection;
    }
    public void waterproof(Collection<CampingDto> collection) {
        System.out.println("For Each Loop");
        System.out.println("These products are waterproof");
        for (CampingDto campingDto : collection) {
            if (campingDto.isWaterproof()) {
                System.out.println("Product: "+campingDto.getProductType());
            }
        }
    }
    public void suitable(Collection<CampingDto> collection){
        System.out.println("Iterator");
        System.out.println("These products are suitable for all seasons");
        Iterator<CampingDto> iterator = collection.iterator();
        while (iterator.hasNext()){
            CampingDto campingDto = iterator.next();
            if(campingDto.getSuitableFor().equals("All Seasons")){
                System.out.println("Product: "+campingDto.getProductType());
            }
        }
    }
}
