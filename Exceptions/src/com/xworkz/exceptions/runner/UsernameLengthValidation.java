package com.xworkz.exceptions.runner;

import com.xworkz.exceptions.exception.LengthMismatchException;

public class UsernameLengthValidation {
    public static void main(String[] args) {
        String username="eg";
        if(username.length()<3){
            throw new LengthMismatchException("Username should be more than 3 characters");
        }
        else{
            System.out.println("Username is valid");
        }
    }
}
