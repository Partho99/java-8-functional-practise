package com.functionalprogramming.lambda.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {
    public List<Book> getBookInSort(){
        List<Book> book = new BookDao().getBooks();
        Collections.sort(book,(o1,o2) ->(
            o2.getName().compareTo(o1.getName()))
        );
        return book;
    }

    public static void main(String[] args){
        System.out.println(new BookService().getBookInSort());
    }
}

// class MyComparator implements Comparator<Book>{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o2.getName().compareTo(o1.getName());
//    }
//}