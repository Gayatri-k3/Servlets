package com.xworkz.symphony.dto;

import java.util.Date;

public class ProductDto {
    private String name;
    private String type;
    private double priceIn;
    private double priceS;
    private double mrp;
    private String desc;
    private String brand;
    private String quantity;
    private String color;
    private double weight;
    private String manfDate;
    private String warranty;
    private String returnPolicy;

    public void setMrp(double mrp) {
        this.mrp = mrp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPriceIn(double priceIn) {
        this.priceIn = priceIn;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPriceS(double priceS) {
        this.priceS = priceS;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setManfDate(String manfDate) {
        this.manfDate = manfDate;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getPriceIn() {
        return priceIn;
    }

    public double getPriceS() {
        return priceS;
    }

    public double getMrp() {
        return mrp;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getDesc() {
        return desc;
    }

    public String getManfDate() {
        return manfDate;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getReturnPolicy() {
        return returnPolicy;
    }

    public String getWarranty() {
        return warranty;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", priceIn='" + priceIn + '\'' +
                ", priceS='" + priceS + '\'' +
                ", mrp='" + mrp + '\'' +
                ", desc='" + desc + '\'' +
                ", brand='" + brand + '\'' +
                ", quantity='" + quantity + '\'' +
                ", color='" + color + '\'' +
                ", weight='" + weight + '\'' +
                ", manfDate='" + manfDate + '\'' +
                ", warranty='" + warranty + '\'' +
                ", returnPolicy='" + returnPolicy + '\'' +
                '}';
    }
}
