package com.pb.kh.hw12;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactList {

    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);

        List<People> people = Arrays.asList(
                new People("Kat", "88888888"),
                new People("Rik", "123-234-22"),
                new People("Morti", "7777777777")
        );

        System.out.println("Ведите команду : " +
                "new - для создания нового контакта " +
                "delete - для удаления " +
                "search - для поиска " +
                "show n - вывод всех записей по имени " +
                "show p - вывод всех записей по номеру " +
                "renew - редактирование элемента " +
                "exit - для выхода ");


            String option = sc.nextLine();


            switch (option) {
                case "new":
                    System.out.println("Введите данные контакта в формате : Имя, номер телефона, адресс, дата рождения (год,месяц,день) :");
                    people.add(new People(sc.nextLine(), sc.nextLine()));
                    System.out.println("Контакт добавлен !");
                    System.out.println(LocalDateTime.now());
                    break;
                case "delete":
                    System.out.println("Введите имя для удаления контакта : ");
                    String nam = sc.nextLine();
                    people.removeIf(people2 -> people2.name.equals(nam));
                    System.out.println("Контакт удален ! " + LocalDateTime.now());
                    break;
                case "search":
                    System.out.println("Введите имя для поиска :");
                    System.out.println(SearchByName(people, sc.nextLine()));
                    break;
                case "show n":
                    people.stream()
                            .collect(Collectors.groupingBy(People::getName))
                            .entrySet()
                            .forEach(System.out::println);
                    people.stream().close();
                    break;
                case "show p":
                    people.stream()
                            .collect(Collectors.groupingBy(People::getPhonenumber))
                            .entrySet()
                            .forEach(System.out::println);
                    people.stream().close();
                    break;
                case "renew" :
                    System.out.println ("Введите имя контакта");

                    break;
                case "exit":
                    System.out.println("Завершение работы");
                    break;
            }

    }

    public static  List<People> SearchByName (List<People> people, String name){
        return people.stream().filter(people1 -> people1.name.equals(name)).collect(Collectors.toList());
    }
    public static boolean DeleteByName (List<People> people, String name){
        return people.removeIf(peopl -> peopl.name.equals(name));
    }
}
