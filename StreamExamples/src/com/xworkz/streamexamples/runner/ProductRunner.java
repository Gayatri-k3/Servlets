package com.xworkz.streamexamples.runner;

import com.xworkz.streamexamples.dto.ProductDto;
import com.xworkz.streamexamples.repository.ProductRepository;
import com.xworkz.streamexamples.repository.ProductRepositoryImpl;

import java.util.*;
import java.util.stream.Collectors;


public class ProductRunner {
    public static void main(String[] args) {
        ProductRepository productRepository = new ProductRepositoryImpl();
        Collection<ProductDto> collection = productRepository.findAll();

        System.out.println("Print all product info");
        collection.forEach(System.out::println);
        System.out.println("-------------------------------------------");


        System.out.println("print all name's of the product");
        collection.forEach(productDto->System.out.println(productDto.getName()));
        System.out.println("-------------------------------------------");


        System.out.println("Print all product where discount is greater than 10 %");
        collection.stream()
                        .filter(productDto -> productDto.getDiscount()<10)
                                .forEach(System.out::println);
        System.out.println("-------------------------------------------");


        System.out.println("Collect all product if warranty less than 3");
        Collection<ProductDto> collected = collection.stream()
                .filter(productDto -> productDto.getWarrantyInYears()<3)
                .collect(Collectors.toCollection(ArrayList::new));
        collected.forEach(System.out::println);
        System.out.println("-------------------------------------------");


        System.out.println("Sort all product by id asc");
        collection.stream()
                .sorted()
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");


        System.out.println("Collect all product if quantity > 5 and sort by id");
        Collection<ProductDto> collected2 = collection.stream()
                .filter(productDto -> productDto.getQuantity()>5)
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
        collected2.forEach(System.out::println);
        System.out.println("-------------------------------------------");

        System.out.println("Collect only manufacturer of all product");
        collection.stream()
                .map(ProductDto::getManufacturer)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(System.out::println);
        System.out.println("-------------------------------------------");


        System.out.println("get the product with min discount");
        Optional<ProductDto> minimum=collection.stream()
                .min(Comparator.comparing(ProductDto::getDiscount));
        minimum.ifPresent(System.out::println);
        System.out.println("-------------------------------------------");

        System.out.println("get the product with latest manufacturedDate");
        Optional<ProductDto> latest= collection.stream().max(Comparator.comparing(ProductDto::getManufacturedDate));
        latest.ifPresent(System.out::println);
        System.out.println("-------------------------------------------");


        System.out.println("get the product with max costPerItem");
        Optional<ProductDto> maximum=collection.stream()
                .max(Comparator.comparing(ProductDto::getCostPerItem));
        maximum.ifPresent(System.out::println);
    }
}
