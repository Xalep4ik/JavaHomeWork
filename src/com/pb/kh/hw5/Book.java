package com.pb.kh.hw5;

import java.sql.SQLOutput;

public class Book {

    public String bookName;
    public String author;
    public String year;

    public Book(String bookName, String author, String year) {
        this.bookName = bookName;
        this.author = author;
        this.year = year;
    }
    public String getInfo() {
        return bookName + " (" + author + " " + year + " г.)";
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}

