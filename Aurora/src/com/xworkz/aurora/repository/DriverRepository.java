package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.DriverDTO;

import java.util.Set;

public interface DriverRepository {
    Set<DriverDTO> findAll();
}
