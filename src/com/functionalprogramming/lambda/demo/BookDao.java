package com.functionalprogramming.lambda.demo;

import java.util.ArrayList;
import java.util.List;

public class BookDao {

    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(102, "hibernate", 500));
        books.add(new Book(103, "spring", 650));
        books.add(new Book(101, "core java", 400));
        books.add(new Book(104, "web services", 600));

        return books;
    }
}
