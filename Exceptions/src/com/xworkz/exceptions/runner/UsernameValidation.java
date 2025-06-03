package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.TypeMismatchException;

public class UsernameValidation {
    public static void main(String[] args) {
        String username="2Game";
        if(Character.isDigit(username.charAt(0))){
            throw new TypeMismatchException("Username starts with a number");
        }
        else{
            System.out.println("Username is valid");
        }
    }

}
