package com.pb.kh.hw12;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.BufferedWriter;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class ContactList {

    public static void main(String[] args) throws JsonProcessingException {


        Scanner sc = new Scanner(System.in);
        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);

         List<People> people = new ArrayList<>();
         people.add(new People("Sam", "678909876"));
         people.add(new People("Rik", "78439868754"));
         people.add(new People("Morti", "47875784"));


        String writetofile = om.writeValueAsString(people);

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
                    people.add(new People(sc.nextLine(), sc.nextLine()));
                    System.out.println(people);
                    break;
                case "delete":
                    System.out.println("Введите имя для удаления контакта : ");
                    DeleteByName(people, sc.nextLine());
                    System.out.println("Контакт удален ! " + LocalDateTime.now());
                    System.out.println(people);
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
                    break;
                case "show p":
                    people.stream()
                            .collect(Collectors.groupingBy(People::getPhonenumber))
                            .entrySet()
                            .forEach(System.out::println);
                    break;
                case "renew":
                    System.out.println("Введите имя контакта");
                    people.stream().filter(people1 -> people.contains(sc.nextLine()));

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
        return people.removeIf(peopl -> Arrays.equals(peopl.getName().toCharArray(), name.toCharArray()));
    }
    public void WriteToFile(){
        Path path = Paths.get("file\\contacts.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.newLine();
        } catch (Exception ex) {
            System.out.println("Не вышло записать файл :" + ex);
        }
    }

}
