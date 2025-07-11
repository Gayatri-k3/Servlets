package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.SecurityDTO;

import java.util.Set;

public interface SecurityRepository {
    Set<SecurityDTO> findAll();

}
