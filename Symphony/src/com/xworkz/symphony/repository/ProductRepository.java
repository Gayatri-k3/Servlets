package com.xworkz.symphony.repository;

import com.xworkz.symphony.dto.ProductDto;

public interface ProductRepository {
    boolean persist(ProductDto productDto);
}
