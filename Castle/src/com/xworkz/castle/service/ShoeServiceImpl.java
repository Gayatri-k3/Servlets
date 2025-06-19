package com.xworkz.castle.service;

import com.xworkz.castle.dto.ShoeDTO;
import com.xworkz.castle.repository.ShoeRepository;
import com.xworkz.castle.repository.ShoeRepositoryImpl;

import java.util.Arrays;
import java.util.Optional;

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
        if (shoeDTO.getPayment() == null || shoeDTO.getPayment().isEmpty()) {
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
    ShoeRepository shoeRepository=new ShoeRepositoryImpl();
    @Override
    public Optional<ShoeDTO> findById(int shoeID) {

        System.out.println("findById method in shoe service implementation");
        if(shoeID>0)
        {
            System.out.println("shoe is valid");


            shoeRepository.findById(shoeID);
        }

        return ShoeService.super.findById(shoeID);
    }

    @Override
    public ShoeDTO[] findAll() {
        System.out.println(Arrays.toString(shoeRepository.findAll()));
        return shoeRepository.findAll();
    }
}
