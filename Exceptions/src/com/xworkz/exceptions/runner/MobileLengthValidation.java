package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.NumberLengthException;

public class MobileLengthValidation {
    public static void main(String[] args) {
        Long number= 987654567l;
        if (String.valueOf(number).length() != 10) {
            throw new NumberLengthException("Invalid mobile number, must be exactly 10 digits");
        } else {
            System.out.println("Mobile number is valid");
        }
    }

}
