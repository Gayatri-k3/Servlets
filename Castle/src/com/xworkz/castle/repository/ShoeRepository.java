package com.xworkz.castle.repository;

import com.xworkz.castle.dto.ShoeDTO;

import java.util.Optional;

public interface ShoeRepository {
    boolean persist(ShoeDTO shoeDTO);

    default Optional<ShoeDTO> findById(int shoeID)
    {
        return Optional.empty();
    }

    ShoeDTO[] findAll();
}
