package com.pb.kh.hw6;

import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

import java.util.Objects;

public class Animal {

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    private String name;
    private String food;
    private String location;



    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

        public String getName() { return name; }

        public void setName(String name) { this.name = name; }

        public void makeNoise () { System.out.println( name + "животное говорит : "); }

        public void eat () { System.out.println( name + "животное ест : "); }

        public void sleep () {
            System.out.println( name + "животное спит. ");
        }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(name, animal.name) && Objects.equals(food, animal.food) && Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, food, location);
    }
}
