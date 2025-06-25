package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.DynastyDto;

import java.util.Collection;

public interface DynastyRepository {
    Collection<DynastyDto> findAll();
}
