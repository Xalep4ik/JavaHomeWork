package com.pb.kh.hw5;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    public static void main(String[] args){

        Book book1 = new Book("Приключения "," Иванов И. И."," 2000 г.");
        Book book2 = new Book("Словарь "," Сидоров А. В."," 2010 г.");
        Book book3 = new Book("Энциклопедия "," Гусев К. В."," 2010 г.");
        Reader reader1 = new Reader("Петров В. В.","1234","Философский","20.20.1990","3809999999");
        Reader reader2 = new Reader("Иванов И.И","5678","Географический" ,"21.21.1991","3809999991");
        Reader reader3 = new Reader("Смирнов С.С.","9012","Литературный","22.22.1992","3809999992");

        Reader[] readers = new Reader[] {reader1,reader2,reader3};
        System.out.println("==================================");
        for (int a = 0; a<readers.length; a++)
            System.out.println(readers[a]);


        Book [] books = new Book[] {book1,book2,book3};
        System.out.println("==================================");
        for (int b = 0; b<books.length; b++)
            System.out.println(books[b]);


        System.out.println("==================================");
        reader1.takeBook(3);
        reader1.takeBook(book1,book2,book3);
        reader3.takeBook(book1,book2,book3);

        reader2.returnBook(3);
        reader2.returnBook(book1,book2,book3);
        reader3.returnBook(book1,book2,book3);





    }

}
