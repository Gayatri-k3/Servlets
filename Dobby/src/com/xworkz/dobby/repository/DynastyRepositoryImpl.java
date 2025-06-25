package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.DynastyDto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DynastyRepositoryImpl implements DynastyRepository{
    @Override
    public Collection<DynastyDto> findAll() {
        DynastyDto dynasty1 = new DynastyDto("Maurya", "Magadha", -322, -185, "Ashoka");
        DynastyDto dynasty2 = new DynastyDto("Gupta", "North India", 319, 550, "Chandragupta II");
        DynastyDto dynasty3 = new DynastyDto("Chola", "Tamil Nadu", 850, 1279, "Raja Raja Chola I");
        DynastyDto dynasty4 = new DynastyDto("Pallava", "Kanchipuram", 275, 897, "Mahendravarman I");
        DynastyDto dynasty5 = new DynastyDto("Satavahana", "Deccan", -230, 220, "Gautamiputra Satakarni");

        Collection<DynastyDto> dynasties = new ArrayList<>();
        dynasties.add(dynasty1);
        dynasties.add(dynasty2);
        dynasties.add(dynasty3);
        dynasties.add(dynasty4);
        dynasties.add(dynasty5);

        return dynasties;
    }
}
