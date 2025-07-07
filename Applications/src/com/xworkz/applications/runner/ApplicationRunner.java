package com.xworkz.applications.runner;

import com.xworkz.applications.dto.ApplicationDto;
import com.xworkz.applications.dto.ApplicationType;
import com.xworkz.applications.dto.ApplicationVersion;
import com.xworkz.applications.dto.OwnerDto;
import com.xworkz.applications.repository.ApplicationRepository;
import com.xworkz.applications.repository.ApplicationRepositoryImpl;


import java.time.LocalDate;
import java.util.Arrays;
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

        String ownerName="Maya";
        System.out.println("6. Find all applications by ownerName");
        list.stream()
                .filter(dto -> dto.getOwner().stream().anyMatch(owner -> owner.getOwnerName().equalsIgnoreCase(ownerName)))
                .forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("7. Find Owner's by application name");
        String appName = "ShopEase";
        list.stream()
                .filter(dto -> dto.getName().equalsIgnoreCase(appName))
                .flatMap(dto -> dto.getOwner().stream())
                .forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("8. Find all owner email's");
        list.stream()
                .flatMap(dto -> dto.getOwner().stream())
                .map(OwnerDto::getOwnerEmail)
                .distinct()
                .forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("9. Find all owner name and email by type and version");
        ApplicationType type1 = ApplicationType.MOBILE;
        ApplicationVersion version = ApplicationVersion.RELEASE;

        list.stream()
                .filter(dto -> dto.getType() == type1 && dto.getVersion() == version)
                .flatMap(dto -> dto.getOwner().stream())
                .forEach(owner -> System.out.println(owner.getOwnerName() + " - " + owner.getOwnerEmail()));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("10. Find all application by Created Date");
        LocalDate date = LocalDate.of(2022, 1, 5);
        list.stream()
                .filter(dto -> dto.getCreatedDate().equals(date))
                .forEach(System.out::println);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("11. Add a application by index");
        list.add(5, new ApplicationDto("NewApp", ApplicationVersion.ALPHA, LocalDate.now(), 30.0, ApplicationType.WEB, true, 0.0, Arrays.asList(new OwnerDto("New Owner", "owner@example.com", 9999999999L))));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("12. Remove an application by index");
        list.remove(5);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("13. Get owner by Index");
        List<OwnerDto> owners = list.get(0).getOwner();
        OwnerDto owner = owners.get(0);
        System.out.println("Owner: " + owner.getOwnerName());
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


        System.out.println("14. set application by index");
        list.set(3, new ApplicationDto("UpdatedApp", ApplicationVersion.BETA, LocalDate.of(2025, 1, 1), 45.0, ApplicationType.DESKTOP, false, 200.0, Arrays.asList(new OwnerDto("Updated Owner", "updated@example.com", 8888888888L))));
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        System.out.println("15 Replace owner by application name");
        String appNameToUpdate = "ShopEase";
        OwnerDto newOwner = new OwnerDto("Replaced Owner", "replaced@example.com", 9876543210L);

        list.stream()
                .filter(dto -> dto.getName().equalsIgnoreCase(appNameToUpdate))
                .findFirst()
                .ifPresent(dto -> dto.getOwner().set(0, newOwner));

    }
}















