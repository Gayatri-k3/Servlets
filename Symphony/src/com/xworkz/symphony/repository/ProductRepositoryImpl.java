package com.xworkz.symphony.repository;

import com.xworkz.symphony.dto.ProductDto;

public class ProductRepositoryImpl implements ProductRepository{
    public ProductRepositoryImpl(){
        System.out.println("no-arg const of product repo impl");
    }
    @Override
    public boolean persist(ProductDto productDto) {
        System.out.println("persist method in Product Repository Implementation");
        return true;
    }
}
