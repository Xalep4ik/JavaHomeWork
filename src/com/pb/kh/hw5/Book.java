package com.pb.kh.hw5;

import java.sql.SQLOutput;

public class Book {

    public String book;
    public String author;
    public String year;

     String takeBook() {
        return "[ Взял книгу : " + book + " " + author + " " + year + "]";
    }
     String returnBook() {
        return "[ Вернул книгу : " + book + " " + author + " " + year + "]";
    }
     String infoBook (){
         return "[" + book + author + year + "]";
    }


}

