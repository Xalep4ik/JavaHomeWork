package com.pb.kh.hw5;

public class Reader {

 public String readerName;
 private String numberReader;
 private String faculty;
 private String birthday;
 private String phone;

 public String getNumberReader() {
  return numberReader;
 }

 public void setNumberReader(String numberReader) {
  this.numberReader = numberReader;
 }

 public String getFaculty() {
  return faculty;
 }

 public void setFaculty(String faculty) {
  this.faculty = faculty;
 }

 public String getBirthday() {
  return birthday;
 }

 public void setBirthday(String birthday) {
  this.birthday = birthday;
 }

 public String getPhone() {
  return phone;
 }

 public void setPhone(String phone) {
  this.phone = phone;
 }
 public void threeBook (String three){
  System.out.println(three + " взял 3 книги. ");
 }

 String takeBook () {
  return readerName + " взял книги: ";
 }
 String returnBook (){
  return readerName + " вернул книги: " ;
 }
 String infoReader () {
  return readerName;
 }


}
