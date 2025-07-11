package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.HouseDTO;

import java.util.Set;

public interface HouseRepository {
    Set<HouseDTO> findAll();
}
