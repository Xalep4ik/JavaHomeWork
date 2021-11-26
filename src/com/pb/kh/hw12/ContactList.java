package com.pb.kh.hw12;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class ContactList {

    public static void main(String[] args) {


        List<People> people = Arrays.asList(new People("Kat",LocalDate.of(1988, 12, 11),(98)-888-88-88,"London"),
                new People("Rik",LocalDate.of(1999, 2, 7),(96)-767-67-67, "Berlin")
        );

    }
    static class People {

        private String name;
        private LocalDate date;
        private long phonenumber;
        private String adress;



        public People(String name, LocalDate date, long phonenumber, String adress) {
            this.name = name;
            this.date = date;
            this.phonenumber = phonenumber;
            this.adress = adress;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }

        public long getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(long phonenumber) {
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
                    ", date=" + date +
                    ", phonenumber=" + phonenumber +
                    ", adress='" + adress + '\'' +
                    '}';
        }
    }
}
