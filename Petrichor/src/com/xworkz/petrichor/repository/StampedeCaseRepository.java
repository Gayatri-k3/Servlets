package com.xworkz.petrichor.repository;

import com.xworkz.petrichor.dto.StampedeCaseDto;

public interface StampedeCaseRepository {
    boolean persist(StampedeCaseDto stampedeCaseDto);
}
