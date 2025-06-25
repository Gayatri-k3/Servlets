package com.xworkz.dobby.runner;

import com.xworkz.dobby.dto.AppliancesDto;
import com.xworkz.dobby.repository.AppliancesRepositoryImpl;
import java.util.Collection;

public class AppliancesRunner {
    public static void main(String[] args) {
        AppliancesRepositoryImpl appliancesRepository = new AppliancesRepositoryImpl();
        Collection<AppliancesDto> collection = appliancesRepository.findAll();
        appliancesRepository.moreThan10k(collection);
        System.out.println("============================================");
        appliancesRepository.smartAppliances(collection);
    }
}
