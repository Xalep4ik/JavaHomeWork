package com.pb.kh.hw6;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetСlinic {


    public static void main(String[] args) throws Exception {

        Dog dog = new Dog("Тузик ","Мясо ","Будка ");
        Cat cat = new Cat("Барсик ","Рыба ","Дом ");
        Horse horse = new Horse("Молния ","Трава ","Конюшня ");

        cat.makeNoise();
        cat.eat();
        cat.sleep();

        System.out.println("Dog is cat :" + dog.equals(cat));
        System.out.println("Dog Hashcode :" + dog.hashCode());
        System.out.println("Cat is cat :" + cat.equals(cat));
        System.out.println("Cat Hashcode :" + cat.hashCode());

        Animal[] animals = new Animal[]{cat, dog, horse};
        System.out.println(Arrays.asList(animals));
        System.out.println("==================================");

        Veterinarian veterinarian = new Veterinarian();
        Class clazz = veterinarian.getClass();
        System.out.println(clazz);
        veterinarian.treatAnimal(cat);
        veterinarian.treatAnimal(dog);
        veterinarian.treatAnimal(horse);
        System.out.println("-----------------------------------");
        clazz.getConstructor();


    }
}
