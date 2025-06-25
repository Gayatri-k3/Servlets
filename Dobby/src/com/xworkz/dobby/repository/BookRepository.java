package com.xworkz.dobby.repository;

import com.xworkz.dobby.dto.BookDto;

import java.io.Serializable;
import java.util.Collection;

public interface BookRepository extends Serializable {
    Collection<BookDto> findAll();
}
