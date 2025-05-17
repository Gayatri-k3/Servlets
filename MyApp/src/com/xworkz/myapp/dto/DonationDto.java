package com.xworkz.myapp.dto;

public class DonationDto {
    private String firstName;
    private String lastName;
    private String email;
    private String cause;
    private double amount;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAmount() {
        return amount;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getCause() {
        return cause;
    }

    public String getEmail() {
        return email;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "DonationDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", cause='" + cause + '\'' +
                ", amount=" + amount +
                '}';
    }
}
