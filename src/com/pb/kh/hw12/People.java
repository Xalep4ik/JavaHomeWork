package com.pb.kh.hw12;

import java.time.LocalDate;

public class People {

    private String name;
    private String phonenumber;
    private String adress;
    private LocalDate DateOfBirthday;

    public People(String name, String phonenumber, String adress, LocalDate DateOfBirthday) {
        this.name = name;
        this.phonenumber = phonenumber;
        this.adress = adress;
        this.DateOfBirthday=DateOfBirthday;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirthday() {
        return DateOfBirthday;
    }

    public void setDateOfBirthday(LocalDate DateOfBirthday) {
        this.DateOfBirthday=DateOfBirthday;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", adress='" + adress + '\'' +
                ", date=" + DateOfBirthday +
                '}';
    }
}

