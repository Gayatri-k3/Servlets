package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.CountryException;

public class CountryValidation {
    public static void main(String[] args) {
        String country="China";
        if(country!="India"){
            throw new CountryException("Country should be India");
        }
        else{
            System.out.println("Country is valid");
        }
    }
}
