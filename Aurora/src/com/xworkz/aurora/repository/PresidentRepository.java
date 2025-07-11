package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.PresidentDTO;

import java.util.Set;

public interface PresidentRepository {
    Set<PresidentDTO> findAll();
}
