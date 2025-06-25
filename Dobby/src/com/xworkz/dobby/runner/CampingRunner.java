package com.xworkz.dobby.runner;

import com.xworkz.dobby.dto.CampingDto;
import com.xworkz.dobby.repository.CampingRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;

public class CampingRunner {
    public static void main(String[] args) {
        CampingRepositoryImpl campingRepository = new CampingRepositoryImpl();
        Collection<CampingDto> collection = campingRepository.findAll();
        campingRepository.suitable(collection);
        System.out.println("==================");
        campingRepository.waterproof(collection);
    }
}
