package com.xworkz.dobby.runner;

import com.xworkz.dobby.dto.BookDto;

import java.util.Collection;
import java.util.ArrayList;

public class BookRunner {
    public static void main(String[] args) {
        BookDto book1 = new BookDto("The Silent Patient", "Alex Michaelides", "Thriller", 336, 399.0);
        BookDto book2 = new BookDto("Atomic Habits", "James Clear", "Self-help", 320, 450.0);
        BookDto book3 = new BookDto("1984", "George Orwell", "Dystopian", 328, 299.0);
        BookDto book4 = new BookDto("To Kill a Mockingbird", "Harper Lee", "Classic", 281, 349.0);
        BookDto book5 = new BookDto("The Alchemist", "Paulo Coelho", "Fiction", 208, 299.0);
        BookDto book6 = new BookDto("Sapiens", "Yuval Noah Harari", "History", 443, 499.0);
        BookDto book7 = new BookDto("Rich Dad Poor Dad", "Robert Kiyosaki", "Finance", 336, 379.0);
        BookDto book8 = new BookDto("The Subtle Art of Not Giving a F*ck", "Mark Manson", "Self-help", 224, 399.0);
        BookDto book9 = new BookDto("The Hobbit", "J.R.R. Tolkien", "Fantasy", 310, 450.0);
        BookDto book10 = new BookDto("The Power of Now", "Eckhart Tolle", "Spirituality", 236, 299.0);

        Collection<BookDto> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        books.add(book6);
        books.add(book7);
        books.add(book8);
        books.add(book9);
        books.add(book10);

        for(BookDto bookDto:books){
            System.out.println(bookDto);
        }
    }
}
