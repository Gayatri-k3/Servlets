package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.SweetDTO;

import java.util.Set;

public interface SweetRepository {
    Set<SweetDTO> findAll();
}
