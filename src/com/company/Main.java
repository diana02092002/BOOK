package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Book book1 = new Book(1, "Harry Potter 1", 1999, "AST", "J.K.Rowling");
        Book book2 = new Book(2, "Harry Potter 2", 2000, "AST", "J.K.Rowling");
        Book book3 = new Book(3, "Harry Potter 3", 2001, "AST", "J.K.Rowling");
        Book book4 = new Book(4, "Harry Potter 4", 2003, "AST", "J.K.Rowling");
        Book book5 = new Book(5, "Harry Potter 5", 2005, "AST", "J.K.Rowling");

        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);
        Library library = new Library(books);
        library.printBookID(1);
        library.printBookAuthor("J.K.Rowling");
        library.printBookAge(2003);
        library.printBookAfterAge(2003);
    }
}