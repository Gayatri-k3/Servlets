package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.NumberLengthException;

public class AadharNumberValidation {
    public static void main(String[] args) {
        Long number = 9876534567l;
        if (String.valueOf(number).length() != 10) {
            throw new NumberLengthException("Invalid Aadhar number, must be exactly 12 digits");
        } else {
            System.out.println("Aadhar number is valid");
        }
    }
}
