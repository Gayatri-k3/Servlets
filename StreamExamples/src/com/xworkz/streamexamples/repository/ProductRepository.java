package com.xworkz.streamexamples.repository;

import com.xworkz.streamexamples.dto.ProductDto;

import java.util.Collection;

public interface ProductRepository {
    Collection<ProductDto> findAll();
}
