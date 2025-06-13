package com.xworkz.castle.service;

import com.xworkz.castle.dto.ShoeDTO;
import com.xworkz.castle.repository.ShoeRepository;
import com.xworkz.castle.repository.ShoeRepositoryImpl;

public class ShoeServiceImpl implements ShoeService{
    public ShoeServiceImpl(){
        System.out.println("Running no-arg const of shoe service impl");
    }
    @Override
    public boolean save(ShoeDTO shoeDTO) {
        if(shoeDTO == null){
            System.err.println("DTO is Empty");
            return false;
        }
        if(shoeDTO.getBrand() == null || shoeDTO.getBrand().isEmpty() || shoeDTO.getBrand().length()<2){
            System.err.println("Invalid Brand Name");
            return false;
        }
        if(shoeDTO.getMaterial() == null || shoeDTO.getMaterial().isEmpty() || shoeDTO.getMaterial().length()<2){
            System.err.println("Invalid Material");
            return false;
        }
        if(shoeDTO.getType() == null || shoeDTO.getType().isEmpty() || shoeDTO.getType().length()<2){
            System.err.println("Invalid Type");
            return false;
        }
        if (!shoeDTO.getPayment() && shoeDTO.getPayment() != false) {
            System.out.println("Invalid payment method");
            return false;
        }
        if(shoeDTO.getManDate() == null){
            System.out.println("Invalid Manufactured date");
            return false;
        }
        if(shoeDTO.getSize()<2){
            System.out.println("Invalid size");
            return false;
        }
        System.out.println("Validation successful, Saving to Repo");
        ShoeRepository shoeRepository = new ShoeRepositoryImpl();
        shoeRepository.persist(shoeDTO);
        return true;
    }
}
