package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.SareeDto;

import java.util.Collection;

public interface SareeRepository {
    Collection<SareeDto> findAll();
}
