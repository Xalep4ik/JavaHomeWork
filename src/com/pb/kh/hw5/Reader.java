package com.pb.kh.hw5;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Reader {

 public String readerName;
 public String numberReader;
 public String faculty;
 public String birthday;
 public String phone;

 public Reader(String readerName, String numberReader, String faculty, String birthday, String phone) {
  this.readerName = readerName;
  this.numberReader = numberReader;
  this.faculty = faculty;
  this.birthday = birthday;
  this.phone = phone;
 }

 public void takeBook(int bookCount){
  for (int i = 0; i<=bookCount; i++)
   break;
  System.out.println(readerName + " взял :" + bookCount + " книги");
 }

 public void takeBook(String bookName){
  System.out.println(readerName + " взял книги : " + bookName );

 }
 public void takeBook(Book books ){
  System.out.println(readerName + " взял " + books.bookName + books.author + books.year  + " книги");

 }

 public void returnBook(int bookCount){
  for (int i = 0; i<=bookCount; i++)
   break;
  System.out.println(readerName + " вернул " + bookCount +  " книг");

 }
 public void returnBook(String bookName){

  System.out.println(readerName + " вернул книги " + bookName );

 }
 public void returnBook(Book books){;
  System.out.println(readerName + " взял " + books.bookName + books.author + books.year  + " книги");

 }

}
