package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.PassportDTO;

import java.util.Set;

public interface PassportRepository {
    Set<PassportDTO> findAll();
}
