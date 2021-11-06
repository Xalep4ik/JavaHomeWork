package com.pb.kh.hw6;

import java.lang.reflect.Constructor;
import java.util.Arrays;

public class VetСlinic {


    public static void main(String[] args) throws Exception {

        Animal dog = new Animal("Тузик ", "Мясо ", "Будка ");
        Animal cat = new Animal("Барсик ", "Рыба ", "Дом ");
        Animal horse = new Animal("Молния ", "Трава ", "Конюшня ");

        cat.makeNoise();
        cat.eat();
        cat.sleep();

        System.out.println("Dog is cat :" + dog.equals(cat));
        System.out.println("Dog Hashcode :" + dog.hashCode());
        System.out.println("Cat is horse :" + cat.equals(horse));
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
