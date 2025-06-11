package com.xworkz.petrichor.service;

import com.xworkz.petrichor.dto.StampedeCaseDto;
import com.xworkz.petrichor.repository.StampedeCaseRepository;
import com.xworkz.petrichor.repository.StampedeCaseRepositoryImpl;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class StampedeCaseServiceImpl implements StampedeCaseService{
    @Override
    public String save(StampedeCaseDto stampedeCaseDto) {

        if (stampedeCaseDto == null) {
            System.err.println("DTO is null");
            return "Failed";
        }

        if (stampedeCaseDto.getEvent() == null){
            System.err.println("event is null");
            return "Failed";
        }
        if (stampedeCaseDto.getInjuries() == 0) {
            System.err.println("no of injuries is null");
            return "Failed";
        }
        if (stampedeCaseDto.getDeaths() == 0) {
            System.err.println("no of deaths is null");
            return "Failed";
        }
        if(stampedeCaseDto.getLocation() == null ){
            System.err.println("location is null");
            return "Failed";
        }

        StampedeCaseRepository stampedeCaseRepository = new StampedeCaseRepositoryImpl();
        stampedeCaseRepository.persist(stampedeCaseDto);
        return "Success";
    }
}
