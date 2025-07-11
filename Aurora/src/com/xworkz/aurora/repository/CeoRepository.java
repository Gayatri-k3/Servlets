package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CeoDTO;

import java.util.Set;

public interface CeoRepository {
    Set<CeoDTO> findAll();
}
