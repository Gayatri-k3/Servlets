package com.xworkz.dobby.runner;

import com.xworkz.dobby.dto.FurnitureDto;

import java.util.ArrayList;
import java.util.Collection;

public class FurnitureRunner {
    public static void main(String[] args) {

        FurnitureDto furnitureDto1 = new FurnitureDto("Sofa", true, 25000.0, 30.5, "Leather");
        FurnitureDto furnitureDto2 = new FurnitureDto("Dining Table", true, 18000.0, 40.0, "Teak Wood");
        FurnitureDto furnitureDto3 = new FurnitureDto("Office Chair", false, 5500.0, 8.5, "Mesh");
        FurnitureDto furnitureDto4 = new FurnitureDto("Bookshelf", false, 7000.0, 18.0, "Engineered Wood");
        FurnitureDto furnitureDto5 = new FurnitureDto("Coffee Table", false, 4000.0, 12.0, "Glass");
        FurnitureDto furnitureDto6 = new FurnitureDto("Wardrobe", true, 32000.0, 60.0, "Plywood");
        FurnitureDto furnitureDto7 = new FurnitureDto("Bed", true, 28000.0, 50.0, "Sheesham Wood");
        FurnitureDto furnitureDto8 = new FurnitureDto("TV Stand", false, 6000.0, 15.5, "Particle Board");
        FurnitureDto furnitureDto9 = new FurnitureDto("Study Table", false, 8000.0, 20.0, "Laminate");
        FurnitureDto furnitureDto10 = new FurnitureDto("Recliner", false, 22000.0, 25.0, "Fabric");

        Collection<FurnitureDto> collection = new ArrayList<>();
        collection.add(furnitureDto1);
        collection.add(furnitureDto2);
        collection.add(furnitureDto3);
        collection.add(furnitureDto4);
        collection.add(furnitureDto5);
        collection.add(furnitureDto6);
        collection.add(furnitureDto7);
        collection.add(furnitureDto8);
        collection.add(furnitureDto9);
        collection.add(furnitureDto10);

        for(FurnitureDto furnitureDto : collection){
            System.out.println(furnitureDto);
        }
    }
}
