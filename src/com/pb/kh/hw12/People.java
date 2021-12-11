package com.pb.kh.hw12;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

public class People {

        public String name;
        private List<String> phonenumber;
        public String adress;
        private LocalDate date;
        private LocalDateTime changed;

        public People(String name, List <String> phonenumber, String adress, LocalDate date, LocalDateTime changed) {
            this.name = name;
            this.date = date;
            this.phonenumber = phonenumber;
            this.adress = adress;
            this.changed = LocalDateTime.now();

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

        public List<String> getPhonenumber() {
            return phonenumber;
        }

        public void setPhonenumber(String phonenumber) {
            this.phonenumber = Collections.singletonList(phonenumber);
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


