package com.xworkz.applications.runner;

import com.xworkz.applications.dto.ApplicationDto;
import com.xworkz.applications.dto.ApplicationType;
import com.xworkz.applications.repository.ApplicationRepository;
import com.xworkz.applications.repository.ApplicationRepositoryImpl;


import java.util.Comparator;
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

        System.out.println("3. Find all by created date and order in desc order");
        list.stream().sorted(Comparator.comparing(ApplicationDto::getCreatedDate).reversed()).forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("4. Sort all applications by Size in Desc order");
        list.stream().sorted((d1,d2)->Double.compare(d2.getSize(), d1.getSize())).forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("5. Find the version by name,type");
        String name = "ShopEase";
        ApplicationType type = ApplicationType.WEB;

        list.stream()
                .filter(dto -> dto.getName().equalsIgnoreCase(name) && dto.getType() == type)
                .findFirst()
                .ifPresent(dto -> System.out.println("Version: " + dto.getVersion()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("6. Find all applications by ownerName");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("7. Find Owner's by application name");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("8. Find all owner email's");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("9. Find all owner name and email by type and version");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("10. Find all application by Created Date");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("11. Add a application by index");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("12. Remove an application by index");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("13. Get owner by Index");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("14. set application by index");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("15 Replace owner by application name");
    }
}















