package com.xworkz.symphony.service;

import com.xworkz.symphony.dto.ProductDto;

public class ProductServiceImpl implements ProductService {
    @Override
    public boolean save(ProductDto productDto) {

        String name = productDto.getName();
        if (name != null && name.length() >= 3 && name.length() <= 20) {
            System.out.println("Name is valid");
        } else {
            System.err.println("Name is invalid");
            return false;
        }

        String type = productDto.getType();
        if (type != null && type.length() >= 3 && type.length() <= 20) {
            System.out.println("Type is valid");
        } else {
            System.err.println("Type is invalid");
            return false;
        }

        String desc = productDto.getDesc();
        if (desc != null && desc.length() >= 3 && desc.length() <= 20) {
            System.out.println("Description is valid");
        } else {
            System.err.println("Description is invalid");
            return false;
        }

        String brand = productDto.getBrand();
        if (brand != null && brand.length() >= 3 && brand.length() <= 20) {
            System.out.println("Brand is valid");
        } else {
            System.err.println("Brand is invalid");
            return false;
        }

        String quantity = productDto.getQuantity();
        if (quantity != null && quantity.length() >= 1 && quantity.length() <= 20) {
            System.out.println("Quantity is valid");
        } else {
            System.err.println("Quantity is invalid");
            return false;
        }

        String color = productDto.getColor();
        if (color != null && color.length() >= 3 && color.length() <= 20) {
            System.out.println("Color is valid");
        } else {
            System.err.println("Color is invalid");
            return false;
        }

        String manfDate = productDto.getManfDate();
        if (manfDate != null && manfDate.length() >= 3 && manfDate.length() <= 20) {
            System.out.println("Manufacturing Date is valid");
        } else {
            System.err.println("Manufacturing Date is invalid");
            return false;
        }

        String warranty = productDto.getWarranty();
        if (warranty != null && warranty.length() >= 3 && warranty.length() <= 20) {
            System.out.println("Warranty is valid");
        } else {
            System.err.println("Warranty is invalid");
            return false;
        }

        String returnPolicy = productDto.getReturnPolicy();
        if (returnPolicy != null && returnPolicy.length() >= 3 && returnPolicy.length() <= 20) {
            System.out.println("Return Policy is valid");
        } else {
            System.err.println("Return Policy is invalid");
            return false;
        }

        double priceIn = productDto.getPriceIn();
        if (priceIn > 500 && priceIn < 100000) {
            System.out.println("Price In is valid");
        } else {
            System.err.println("Price In is invalid");
            return false;
        }

        double priceS = productDto.getPriceS();
        if (priceS > 500 && priceS < 100000) {
            System.out.println("Price S is valid");
        } else {
            System.err.println("Price S is invalid");
            return false;
        }

        double mrp = productDto.getMrp();
        if (mrp > 500 && mrp < 100000) {
            System.out.println("MRP is valid");
        } else {
            System.err.println("MRP is invalid");
            return false;
        }

        double weight = productDto.getWeight();
        if (weight >= 1 && weight <= 100) {
            System.out.println("Weight is valid");
        } else {
            System.err.println("Weight is invalid");
            return false;
        }

        System.out.println("All fields are valid, saving ProductDto...");
        return true;
    }
}
