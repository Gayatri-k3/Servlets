package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.CampingDto;

import java.io.Serializable;
import java.util.Collection;

public interface CampingRepository extends Serializable {
    Collection<CampingDto> findAll();
}
