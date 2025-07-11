package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.EducationDTO;

import java.util.Set;

public interface EducationRepository {
    Set<EducationDTO> findAll();
}
