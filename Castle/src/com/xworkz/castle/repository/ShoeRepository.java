package com.xworkz.castle.repository;

import com.xworkz.castle.dto.ShoeDTO;

public interface ShoeRepository {
    boolean persist(ShoeDTO shoeDTO);
}
