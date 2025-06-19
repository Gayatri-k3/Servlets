package com.xworkz.castle.service;

import com.xworkz.castle.dto.ShoeDTO;

import java.util.Optional;

public interface ShoeService {
    boolean save(ShoeDTO shoeDTO);

    default Optional<ShoeDTO> findById(int shoeID)
    {
        return Optional.empty();
    }
    ShoeDTO[] findAll();
}
