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

        System.out.println("==================================");
        System.out.println("Dog is cat :" + dog.equals(cat));
        System.out.println("Dog Hashcode :" + dog.hashCode());
        System.out.println("Cat is cat :" + cat.equals(cat));
        System.out.println("Cat Hashcode :" + cat.hashCode());

        System.out.println("==================================");
        Animal[] animals = new Animal[]{cat, dog, horse};
        System.out.println(Arrays.asList(animals));
        System.out.println("==================================");


        Veterinarian veterinarian = new Veterinarian();

        for (Animal animal: animals) {
            veterinarian.treatAnimal(animal);
        }
        System.out.println("==================================");
        veterinarian.treatAnimal(dog);







    }
}
