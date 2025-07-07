package com.xworkz.applications.runner;

import com.xworkz.applications.dto.ApplicationDto;
import com.xworkz.applications.dto.ApplicationType;
import com.xworkz.applications.repository.ApplicationRepository;
import com.xworkz.applications.repository.ApplicationRepositoryImpl;


import java.util.List;


public class ApplicationRunner {
    public static void main(String[] args) {
        ApplicationRepository applicationRepository = new ApplicationRepositoryImpl();
        List<ApplicationDto> list = applicationRepository.findAll();
        System.out.println(" Find all applications by type: WEB");
        list.stream().filter(applicationDto->applicationDto.getType()== ApplicationType.WEB).forEach(System.out::println);
        System.out.println(" Find all applications by type: DESKTOP");
        list.stream().filter(applicationDto->applicationDto.getType()== ApplicationType.DESKTOP).forEach(System.out::println);
        System.out.println(" Find all applications by type: MOBILE");
        list.stream().filter(applicationDto->applicationDto.getType()== ApplicationType.MOBILE).forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("Find chargePerUSer by application name");
        list.forEach(dto-> System.out.println(dto.getName()+" Charge per person: "+dto.getChargePerPerson()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
}
