package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CountryDTO;

import java.util.Set;

public interface CountryRepository {
    Set<CountryDTO> findAll();
}
