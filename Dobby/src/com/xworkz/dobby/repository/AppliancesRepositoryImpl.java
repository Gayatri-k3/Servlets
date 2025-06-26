package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.AppliancesDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AppliancesRepositoryImpl implements AppliancesRepository {

    @Override
    public Collection<AppliancesDto> findAll() {
        AppliancesDto appliancesDto1 = new AppliancesDto("Refrigerator", 500.0, 35000.0, 0, "Steel");
        AppliancesDto appliancesDto2 = new AppliancesDto("Washing Machine", 300.0, 25000.0, 0, "Plastic");
        AppliancesDto appliancesDto3 = new AppliancesDto("Microwave Oven", 30.0, 12000.0, 0, "Metal");
        AppliancesDto appliancesDto4 = new AppliancesDto("Air Conditioner", 100.0, 40000.0, 0, "Aluminium");
        AppliancesDto appliancesDto5 = new AppliancesDto("Laptop", 512.0, 60000.0, 16.0, "Aluminium");
        AppliancesDto appliancesDto6 = new AppliancesDto("Smartphone", 256.0, 30000.0, 8.0, "Glass");
        AppliancesDto appliancesDto7 = new AppliancesDto("Tablet", 128.0, 20000.0, 6.0, "Metal");
        AppliancesDto appliancesDto8 = new AppliancesDto("Smartwatch", 16.0, 10000.0, 2.0, "Plastic");
        AppliancesDto appliancesDto9 = new AppliancesDto("Dishwasher", 250.0, 38000.0, 0, "Steel");
        AppliancesDto appliancesDto10 = new AppliancesDto("Television", 64.0, 45000.0, 4.0, "Glass");

        Collection<AppliancesDto> collection = new ArrayList<>();
        collection.add(appliancesDto1);
        collection.add(appliancesDto2);
        collection.add(appliancesDto3);
        collection.add(appliancesDto4);
        collection.add(appliancesDto5);
        collection.add(appliancesDto6);
        collection.add(appliancesDto7);
        collection.add(appliancesDto8);
        collection.add(appliancesDto9);
        collection.add(appliancesDto10);

        return collection;
    }

    public void moreThan10k(Collection<AppliancesDto> collection) {
        System.out.println("Appliances that cost more than 20K");
        Iterator<AppliancesDto> iterator = collection.iterator();
        System.out.println("Total size: " + collection.size());
        while (iterator.hasNext()) {
            AppliancesDto appliancesDto = iterator.next();
            if (appliancesDto.getPrice() > 20000) {
                iterator.remove();
            }
        }
        System.out.println("Total size after removing: " + collection.size());
    }

    public void smartAppliances(Collection<AppliancesDto> collection) {
        System.out.println("For Each loop");
        System.out.println("Smart Devices in the collection");
        for (AppliancesDto smart : collection) {
            if (smart.getRAM() > 0) {
                System.out.println(smart.getType());
            }
        }
    }

    public void check(Collection<AppliancesDto> collection, String type, double storage, double price, double RAM,String material) {
        System.out.println("Is Collection empty? "+collection.isEmpty());
        AppliancesDto test = new AppliancesDto(type, storage,price,RAM,material);
        System.out.println("Contains? " + collection.contains(test));
    }
}

