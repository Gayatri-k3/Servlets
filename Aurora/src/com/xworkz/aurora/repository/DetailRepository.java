package com.xworkz.aurora.repository;


import com.xworkz.aurora.dto.DetailDTO;

import java.util.Set;

public interface DetailRepository {
    Set<DetailDTO> findAll();
}
