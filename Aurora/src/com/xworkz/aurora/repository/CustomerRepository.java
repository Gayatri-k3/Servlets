package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.CustomerDTO;

import java.util.Set;

public interface CustomerRepository {
    Set<CustomerDTO> findAll();
}
