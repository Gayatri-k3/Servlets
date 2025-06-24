package com.xworkz.dobby.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class BookDto {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;
}
