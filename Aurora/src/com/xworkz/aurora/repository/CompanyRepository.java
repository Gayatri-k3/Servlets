package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CompanyDTO;

import java.util.Set;

public interface CompanyRepository {
    Set<CompanyDTO> findAll();
}
