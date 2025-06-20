package com.xworkz.concert.service;

import com.xworkz.concert.dto.ConcertDTO;
import com.xworkz.concert.repository.ConcertRepo;
import com.xworkz.concert.repository.ConcertRepoImpl;

import javax.xml.bind.SchemaOutputResolver;

public class ConcertServiceImpl implements ConcertService{
    public ConcertServiceImpl(){
        System.out.println("Service const");
    }
    ConcertRepo concertRepo = new ConcertRepoImpl();
    @Override
    public boolean save(ConcertDTO concertDTO) {
        if(concertDTO!=null){
            if(concertDTO.getName()==null || concertDTO.getAName()==null || concertDTO.getEmail() == null || concertDTO.getLocation() == null){
                System.out.println("One of the field is empty");
                return false;
            }
            if(String.valueOf(concertDTO.getNumber()).length() != 10){
                System.out.println("Contact number is invalid");
                return false;
            }
            if(concertDTO.getName().isEmpty()||!concertDTO.getName().matches("[a-zA-Z ]+")|| concertDTO.getName().length()<2 || concertDTO.getName().length()>20){
                System.out.println("Invalid name");
                return false;
            }
            if(concertDTO.getAName().isEmpty()||!concertDTO.getAName().matches("[a-zA-Z ]+")|| concertDTO.getAName().length()<2 || concertDTO.getAName().length()>20){
                System.out.println("Invalid Artist name");
                return false;
            }
            if(concertDTO.getEmail().isEmpty()){
                System.out.println("Invalid email");
                return false;
            }
            if(concertDTO.getLocation().isEmpty()||!concertDTO.getLocation().matches("[a-zA-Z ]+")|| concertDTO.getLocation().length()<2 || concertDTO.getLocation().length()>20){
                System.out.println("Invalid Location");
                return false;
            }
            System.out.println("Data is Valid");
            concertRepo.persist(concertDTO);
            return true;
        }
        System.out.println("Data is Invalid");
        return false;
    }
}
