package com.xworkz.dobby.runner;


import com.xworkz.dobby.dto.SareeDto;
import com.xworkz.dobby.repository.SareeRepositoryImpl;

import java.util.Collection;

public class SareeRunner {
    public static void main(String[] args) {
        SareeRepositoryImpl sareeRepository = new SareeRepositoryImpl();
        Collection<SareeDto> collection = sareeRepository.findAll();
        sareeRepository.color(collection);
        sareeRepository.price(collection);

    }
}
