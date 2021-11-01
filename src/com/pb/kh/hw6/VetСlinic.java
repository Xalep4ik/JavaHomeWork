package com.pb.kh.hw6;

import java.util.Arrays;

public class VetСlinic {

    //В цикле отправляйте животных на прием к ветеринару.

    public static void main(String[] args) {


        Dog dog = new Dog();
        Cat cat = new Cat();
        Horse horse = new Horse();
        dog.setName("Тузик ");
        cat.setName("Барсик ");
        horse.setName("Молния ");
        dog.setFood("Мясо");
        cat.setFood("Рыба");
        horse.setFood("Трава");
        dog.setLocation("Будка");
        cat.setLocation("Дом");
        horse.setLocation("Конюшня");

        cat.makeNoise();
        cat.eat();
        cat.sleep();

        System.out.println(dog.equals(cat));
        System.out.println(dog.hashCode());
        System.out.println(cat.equals(horse));
        System.out.println(cat.toString());
        System.out.println(cat.hashCode());

        Animal[] animals = new Animal[] {cat,dog,horse};
        System.out.println(Arrays.asList(animals));
        System.out.println("=====================");

        Veterinarian veterinarian = new Veterinarian();
        veterinarian.treatAnimal();





    }
}
