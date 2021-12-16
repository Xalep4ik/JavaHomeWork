package com.pb.kh.hw12;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.module.SimpleModule;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ContactList {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        ObjectMapper om = new ObjectMapper();
        om.enable(SerializationFeature.INDENT_OUTPUT);

        SimpleModule module = new SimpleModule();
        module.addSerializer(LocalDate.class, new LocalDateSerializer());
        module.addDeserializer(LocalDate.class, new LocalDateDeserializer());
        om.registerModule(module);

        List<People> people = new ArrayList<>();
        people.add(new People("Sam", "567898765", "Rio", LocalDate.of(1988, 2, 2)));
        people.add(new People("Rik", "78439868754", "Tokio", LocalDate.of(1987, 3, 3)));
        people.add(new People("Morti", "47875784", "Montecarlo", LocalDate.of(1986, 4, 4)));

        System.out.println("Ведите команду : " +
                "new - для создания нового контакта " +
                "delete - для удаления " +
                "search - для поиска " +
                "show n - вывод всех записей по имени " +
                "show b - вывод всех записей по дате рождения " +
                "update - редактирование элемента " +
                "view - для просмотра файла контактов " +
                "exit - для выхода ");

        String option = sc.nextLine();


        while (!option.equals("exit")) {
            om.writeValue(new File("file\\contactslist"), people);
            switch (option) {
                case "new":
                    System.out.println("Введите данные контакта в формате : Имя, номер телефона, адресс, дата рождения (год,месяц,день) :");
                    people.add(new People(sc.nextLine(), sc.nextLine(), sc.nextLine(),LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt())));
                    om.writeValue(new File("file\\contactslist"), people);
                    System.out.println("Контакт добавлен ! " + LocalDateTime.now());
                    System.out.println(people);
                    break;
                case "delete":
                    System.out.println("Введите имя для удаления контакта : ");
                    DeleteByName(people, sc.nextLine());
                    System.out.println("Контакт удален ! " + LocalDateTime.now());
                    om.writeValue(new File("file\\contactslist"), people);
                    System.out.println(people);
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
                    break;
                case "show b":
                    people.stream()
                            .collect(Collectors.groupingBy(People::getDateOfBirthday))
                            .entrySet()
                            .forEach(System.out::println);
                    break;
                case "update":
                    System.out.println("Введите имя контакта");
                    String search = sc.nextLine();
                    System.out.println("ВВедите новые данный :");
                    boolean b = false;
                    for (People people1 : people) {
                        if (people1.getName().equals(search)) {
                            people1.setName(sc.nextLine());
                            people1.setPhonenumber(sc.nextLine());
                            people1.setAdress(sc.nextLine());
                            people1.setDateOfBirthday(LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                            b = true;
                            break;
                        }
                    }
                    if (!b) {
                        System.out.println("Человек не найден !");
                    }
                    om.writeValue(new File("file\\contactslist"), people);
                    om.writeValueAsString(people);
                    System.out.println(people);
                    break;

                case "view":
                    String peopleJson = om.writeValueAsString(people);
                    List peoples = om.readValue(peopleJson, List.class);
                    System.out.println(peoples.get(0).getClass().getName());
                    System.out.println(peoples);
                    break;
                case "exit":
                    System.out.println("Завершение работы");
                default:
                    System.out.println("Введите команду !");
                    om.writeValue(new File("file\\contactslist"), people);
                    break;
            }
            om.writeValue(new File("file\\contactslist.txt"), people);
            option = sc.nextLine();
        }

    }

    public static List<People> SearchByName(List<People> people, String name) {
        return people.stream().filter(people1 -> people1.getName().equals(name)).collect(Collectors.toList());
    }

    public static boolean DeleteByName(List<People> people, String name) {
        return people.removeIf(peopl -> Arrays.equals(peopl.getName().toCharArray(), name.toCharArray()));
    }
}
