package com.xworkz.dobby.runner;


import com.xworkz.dobby.dto.BookDto;
import com.xworkz.dobby.repository.BookRepositoryImpl;

import java.util.Collection;
import java.util.ArrayList;

public class BookRunner {
    public static void main(String[] args) {
        BookRepositoryImpl bookRepository = new BookRepositoryImpl();
        Collection<BookDto> collection = bookRepository.findAll();
        bookRepository.pages(collection);
        System.out.println("======================");
        bookRepository.price(collection);

    }
}
