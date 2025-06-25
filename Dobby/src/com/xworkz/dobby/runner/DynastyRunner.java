package com.xworkz.dobby.runner;

import com.xworkz.dobby.dto.DynastyDto;
import com.xworkz.dobby.repository.DynastyRepositoryImpl;

import java.util.Collection;

public class DynastyRunner {
    public static void main(String[] args) {
        DynastyRepositoryImpl dynastyRepository = new DynastyRepositoryImpl();
        Collection<DynastyDto> collection = dynastyRepository.findAll();
        dynastyRepository.year(collection);
        dynastyRepository.maurya(collection);
    }
}
