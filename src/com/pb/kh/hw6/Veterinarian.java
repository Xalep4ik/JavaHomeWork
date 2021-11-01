package com.pb.kh.hw6;

import java.util.concurrent.Callable;

public class Veterinarian extends Animal {
    //Создайте класс Veterinarian (Ветеринар), в котором определите метод void treatAnimal(Animal animal).
    //Пусть этот метод печатает на экран food и location пришедшего на прием животного.
    Dog dog = new Dog();
    Cat cat = new Cat();
    Horse horse = new Horse();

    @Override
    public  String toString() {
        return getFood() + getLocation();
    }

      void treatAnimal(){
        this.toString();
        System.out.println("На приеме: ");
        System.out.println(dog.toString());
        System.out.println(cat.toString());
        System.out.println(horse.toString());
    }
}
