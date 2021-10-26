package com.pb.kh.hw5;

public class Library {
    public static void main(String[] args){

        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        book1.book = "Приключения ";
        book2.book = "Словарь ";
        book3.book = "Энциклопедия ";
        book1.author = " Иванов И. И.";
        book2.author = " Сидоров А. В.";
        book3.author = " Гусев К. В.";
        book1.year = " 2000 г.";
        book2.year = " 1980 г.";
        book3.year = " 2010 г.";

        Reader reader1 = new Reader();
        Reader reader2 = new Reader();
        Reader reader3 = new Reader();
        reader1.readerName = " Петров В. В. ";
        reader2.readerName = " Иванов И.И. ";
        reader3.readerName = " Смирнов С.С. ";
        reader1.setNumberReader("1234");
        reader2.setNumberReader("5678");
        reader3.setNumberReader("8901");
        reader1.setFaculty("Философский");
        reader2.setFaculty("Географический");
        reader3.setFaculty("Литературный");

        System.out.println(book1.infoBook() + book2.infoBook() + book3.infoBook());
        System.out.println(reader1.infoReader() + reader2.infoReader() + reader3.infoReader());

        reader1.threeBook(reader1.readerName);
        System.out.println(reader1.takeBook() + book1.book + "," + book2.book + "," + book3.book + ".");
        System.out.println(reader1.takeBook() + book1.infoBook() + book2.infoBook() + book3.infoBook());
        System.out.println(reader1.returnBook() + book1.book + "," + book2.book + ","+ book3.book + ".");
        System.out.println(reader1.returnBook() + book1.infoBook() + book2.infoBook() + book3.infoBook());




    }

}
