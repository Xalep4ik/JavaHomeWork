package com.pb.kh.hw6;

import java.util.Objects;

public class Cat extends Animal{


    public String softy = "Пушистый";

    public Cat(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мурр мурр");

    }

    @Override
    public void eat() {

        super.eat();
        System.out.println(getFood());
    }

    @Override
    public void sleep() {

        super.sleep();
        System.out.println("ZZZzzz");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }


}
