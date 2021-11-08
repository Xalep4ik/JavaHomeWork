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

 @Override
 public String toString() {
  return "Reader{" +
          "readerName='" + readerName + '\'' +
          ", numberReader='" + numberReader + '\'' +
          ", faculty='" + faculty + '\'' +
          ", birthday='" + birthday + '\'' +
          ", phone='" + phone + '\'' +
          '}';
 }

 public void takeBook(int bookCount){
  System.out.println(readerName + " взял : " + bookCount + " книги");
  System.out.println("==================================");
 }

 public void takeBook(String... bookNames){
  for (String name : bookNames) {
   System.out.println(readerName + " взял книги : " + bookNames);
  }
  System.out.println("==================================");
 }
 public void takeBook(Book... books ){
  System.out.println(readerName + " взял " );
  for (Book book : books) {
   System.out.println(book.bookName);
  }
  System.out.println("==================================");
 }

 public void returnBook(int bookCount){
  System.out.println(readerName + " вернул " + bookCount +  " книг");
  System.out.println("==================================");
 }
 public void returnBook(String... bookNames){
  for (String name : bookNames) {
   System.out.println(readerName + " вернул книги : " + bookNames);
  }
  System.out.println("==================================");
 }
 public void returnBook(Book... books) {
  System.out.println(readerName + " вернул ");
  for (Book book : books) {
   System.out.println(book.bookName);
  }
  System.out.println("==================================");
 }
}
