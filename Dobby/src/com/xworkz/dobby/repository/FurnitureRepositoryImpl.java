package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.FurnitureDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class FurnitureRepositoryImpl implements FurnitureRepository{
    @Override
    public Collection<FurnitureDto> findAll() {

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

        return collection;
    }
    public void multiple(Collection<FurnitureDto> collection) {
        System.out.println("For Each loop");
        System.out.println("All these products have multiple pieces");
        for (FurnitureDto furnitureDto : collection) {
            if(furnitureDto.isMultiplePieces()) {
                System.out.println("Furniture: " + furnitureDto.getFurnitureType());
            }
        }
    }
    public void weight(Collection<FurnitureDto> collection){
        System.out.println("Iterator");
        System.out.println("All these products weigh more than 30kg");
        Iterator<FurnitureDto> iterator = collection.iterator();
        while(iterator.hasNext()){
            FurnitureDto furnitureDto = iterator.next();
            if(furnitureDto.getWeightInKg()>30){
                System.out.println("Furniture: "+furnitureDto.getFurnitureType()+", Weight: "+furnitureDto.getWeightInKg());
            }
        }
    }
}
