package com.xworkz.dobby.runner;

import com.xworkz.dobby.dto.AppliancesDto;
import com.xworkz.dobby.repository.AppliancesRepositoryImpl;


import java.util.ArrayList;
import java.util.Collection;

public class AppliancesRunner {
    public static void main(String[] args) {
        AppliancesRepositoryImpl appliancesRepository = new AppliancesRepositoryImpl();
        Collection<AppliancesDto> collection = appliancesRepository.findAll();
        appliancesRepository.moreThan10k(collection);
        System.out.println("============================================");
        appliancesRepository.smartAppliances(collection);
        System.out.println("============================================");
        appliancesRepository.check(collection, "Microwave Oven", 30.0, 12000.0, 0, "Metal");
        System.out.println("============================================");
        System.out.println("Size before addAll: "+collection.size());
        System.out.println("============================================");
        AppliancesDto add1 = new AppliancesDto("Speaker",2,30000,0,"metal");
        AppliancesDto add2 = new AppliancesDto("Air fryer",4,30000,0,"Aluminium");
        Collection<AppliancesDto> collection1 = new ArrayList<>();
        collection1.add(add1);
        collection1.add(add2);
        collection.addAll(collection1);
        for (AppliancesDto dto: collection){
            System.out.println(dto);
        }
        System.out.println("============================================");
        System.out.println("Size after addAll: "+collection.size());
        System.out.println("============================================");
        System.out.println("Contains all Test appliances? "+collection.containsAll(collection1));
        System.out.println("============================================");
        collection.removeAll(collection1);
        System.out.println("Collection after removeAll: "+collection.size());
        System.out.println("============================================");
        System.out.println("Contains all Test appliances? "+collection.containsAll(collection1));


        collection.stream()
                .sorted()
                .forEach(System.out::println);

    }
}
