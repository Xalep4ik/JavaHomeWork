package com.pb.kh.hw6;

public class Horse extends Animal{

    public String speedy = "Быстрый";

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void makeNoise() {

        super.makeNoise();
        System.out.println(" Игго го ");
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
