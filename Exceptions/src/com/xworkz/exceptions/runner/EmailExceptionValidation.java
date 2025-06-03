package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.EmailInvalidException;

public class EmailExceptionValidation {
    public static void main(String[] args) {
        String email="gayatri#gmail.com";
        if(!email.contains("@")){
            throw new EmailInvalidException("Email doesnt contain @");
        }
        else{
            System.out.println("Email is valid");
        }
    }
}
