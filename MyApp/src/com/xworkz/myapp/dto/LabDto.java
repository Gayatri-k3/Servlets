package com.xworkz.myapp.dto;

public class LabDto {
    private String firstName;
    private String lastName;
    private String email;
    private String testType;
    private Double amount;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getTestType() {
        return testType;
    }
    public void setTestType(String testType) {
        this.testType = testType;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "LabDto [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email +
                ", testType=" + testType + ", amount=" + amount + "]";
    }
}
