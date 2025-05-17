package com.xworkz.myapp.dto;

public class FIRDto {
    private String firstName;
    private String lastName;
    private String email;
    private String date;
    private String report;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDate() {
        return date;
    }

    public String getReport() {
        return report;
    }

    @Override
    public String toString() {
        return "FIRDto{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", date='" + date + '\'' +
                ", report='" + report + '\'' +
                '}';
    }
}
