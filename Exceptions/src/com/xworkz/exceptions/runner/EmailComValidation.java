package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.EmailInvalidException;

public class EmailComValidation {
    public static void main(String[] args) {
    String email="gayatri@gmail";
        if(!email.contains(".com")){
            throw new EmailInvalidException("Invalid email, doesnt contain .com");
        }
        else{
            System.out.println("Email is valid");
        }
    }
}
