package com.xworkz.furniture.dto;

public class Furnituredto {
    private String brand;
    private  String size;
    private String material;
    private String model;
    private String productBenefits;

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setProductBenefits(String productBenefits) {
        this.productBenefits = productBenefits;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public String getModel() {
        return model;
    }

    public String getProductBenefits() {
        return productBenefits;
    }

    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Dto{" +
                "brand='" + brand + '\'' +
                ", size='" + size + '\'' +
                ", material='" + material + '\'' +
                ", model='" + model + '\'' +
                ", productBenefits='" + productBenefits + '\'' +
                '}';
    }
}
