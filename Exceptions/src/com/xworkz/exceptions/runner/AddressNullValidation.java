package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.NullException;

public class AddressNullValidation {
    public static void main(String[] args) {
        String address="";
        if(address.length() == 0){
            throw new NullException("Address cant be null");
        }
        else{
            System.out.println("Address is valid");
        }
    }
}
