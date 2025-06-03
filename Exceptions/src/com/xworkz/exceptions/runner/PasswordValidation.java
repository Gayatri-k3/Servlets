package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.LengthMismatchException;

public class PasswordValidation {
    public static void main(String[] args) {
        String password="";
        if (password.length() < 8|| password.length()>16) {
            throw new LengthMismatchException("Password should be more than 8 characters and less than 16");
        }
        else{
            System.out.println("password is valid");
        }
    }
}
