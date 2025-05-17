package com.xworkz.myapp.dto;

public class LdDto {
    private String fn;
    private String ln;
    private String em;
    private String vehicleType;
    private String vehicleNumber;

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public void setLn(String ln) {
        this.ln = ln;
    }

    public String getVehicleType() {
        return vehicleNumber;
    }

    public String getFn() {
        return fn;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getEm() {
        return em;
    }

    public String getLn() {
        return ln;
    }

    @Override
    public String toString() {
        return "DonationDto{" +
                "firstName='" + fn + '\'' +
                ", lastName='" + ln + '\'' +
                ", email='" + em + '\'' +
                ", cause='" + vehicleNumber + '\'' +
                ", amount=" + vehicleType +
                '}';
    }
}

