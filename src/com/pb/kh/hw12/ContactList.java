package com.pb.kh.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class ContactList {

    public static void main(String[] args) throws JsonProcessingException {


        Scanner sc = new Scanner(System.in);
        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);

        List<People> people = Arrays.asList(
                new People("Kat", "888-888-88"),
                new People("Rik", "123-234-22"),
                new People("Morti", "777-777-77")
        );

        String writetofile = om.writeValueAsString(people);

        Path path = Paths.get("file\\contacts.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write(writetofile);
        } catch (Exception ex) {
            System.out.println("Не вышло записать файл :" + ex);
        }
        System.out.println("Файл создан!");

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
                    new People(sc.nextLine(), sc.nextLine());
                    String addNew = om.writeValueAsString(people);
                    try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                        writer.write(addNew);
                    } catch (Exception ex) {
                        System.out.println("Не вышло записать файл :" + ex);
                    }
                    System.out.println("Контакт добавлен !" + LocalDateTime.now());
                    System.out.println(addNew);
                    break;
                case "delete":
                    System.out.println("Введите имя для удаления контакта : ");
                    String nam = sc.nextLine();
                    people.removeIf(people1 -> people1.getName().equals(nam));
                    String delete = om.writeValueAsString(people);
                    System.out.println("Контакт удален ! " + LocalDateTime.now());
                    System.out.println(delete);
                    break;
                case "search":
                    System.out.println("Введите имя для поиска :");
                    //writetofile = om.writeValueAsString(SearchByName(people, sc.nextLine()));
                    System.out.println(SearchByName(people, sc.nextLine()));
                    //System.out.println(writetofile);
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
                case "renew":
                    System.out.println("Введите имя контакта");

                    break;
                case "exit":
                    System.out.println("Завершение работы");
                    break;
            }
    }

    public static  List<People> SearchByName (List<People> people, String name){
        return people.stream().filter(people1 -> people1.getName().equals(name)).collect(Collectors.toList());
    }
    public static boolean DeleteByName(List<People> people, String name){
        return people.removeIf(peopl -> peopl.getName().equals(name));
    }

}
