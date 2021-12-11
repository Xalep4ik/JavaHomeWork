package com.pb.kh.hw12;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ContactList {

    public static void main(String[] args) {


        List<People> people = Arrays.asList(new People("Kat", LocalDate.of(1988, 12, 11), (98) - 888 - 88 - 88, "London"),
                new People("Rik", LocalDate.of(1999, 2, 7), (96) - 767 - 67 - 67, "Berlin")
        );


    }

    public static  List<People> SearchByName (List<People> people, String name){
        return people.stream().filter(people1 -> people1.name.equals(name)).collect(Collectors.toList());
    }
}
