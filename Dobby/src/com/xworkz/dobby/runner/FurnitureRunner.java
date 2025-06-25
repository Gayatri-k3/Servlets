package com.xworkz.dobby.runner;

import com.xworkz.dobby.dto.FurnitureDto;
import com.xworkz.dobby.repository.FurnitureRepositoryImpl;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRunner {
    public static void main(String[] args) {
        FurnitureRepositoryImpl furnitureRepository = new FurnitureRepositoryImpl();
        Collection<FurnitureDto> furnitureDtos = furnitureRepository.findAll();
        furnitureRepository.multiple(furnitureDtos);
        furnitureRepository.weight(furnitureDtos);
    }
}
