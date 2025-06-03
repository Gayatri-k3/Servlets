package com.xworkz.exceptions.exception;

import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;

public class EmailInvalidException extends RuntimeException{
    public EmailInvalidException(String message){
        super(message);
    }
}
