package com.xworkz.applications.repository;

import com.xworkz.applications.dto.ApplicationDto;

import java.util.List;


public interface ApplicationRepository {
    List<ApplicationDto> findAll();
}
