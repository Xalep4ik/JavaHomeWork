package com.pb.kh.hw12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.stream.Collector;

public class People {

        private String name;
        private String phonenumber;
       /* public String adress;
        private LocalDate date;*/
        //private LocalDateTime changed;

        public People(String name,String phonenumber) {
            this.name = name;
            this.phonenumber = phonenumber;

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

/*        public LocalDate getDate() {
            return date;
        }

        public void setDate(LocalDate date) {
            this.date = date;
        }*/

        public String getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber =phonenumber;
        }

/*        public String getAdress() {
            return adress;
        }

        public void setAdress(String adress) {
            this.adress = adress;
        }*/

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                '}';
    }
}


