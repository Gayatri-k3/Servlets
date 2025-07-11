package com.xworkz.aurora.repository;

import com.xworkz.aurora.dto.JobDTO;

import java.util.Set;

public interface JobRepository {
    Set<JobDTO> findAll();
}
