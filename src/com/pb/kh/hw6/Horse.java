package com.pb.kh.hw6;

public class Horse extends Animal{

    public String speedy = "Быстрый";

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
        return super.toString();
    }
    @Override
    public boolean equals(Object o) {
        System.out.println("Сравнение животных: ");
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        System.out.println(getName() + "hash: ");
        return super.hashCode();
    }
}
