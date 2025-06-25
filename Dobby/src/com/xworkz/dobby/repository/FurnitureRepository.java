package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.FurnitureDto;

import java.io.Serializable;
import java.util.Collection;

public interface FurnitureRepository extends Serializable {
    Collection<FurnitureDto> findAll();
}
