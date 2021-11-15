package com.pb.kh.hw7;


public abstract class Clothes  {

    public String Size;
    public int Prise;
    public String Color;
    public String name;

}

abstract class Pants extends Clothes implements ManClothes , WomenClothes {

    @Override
    public void dressMan() {
        System.out.println( name + "размер : " + Size + " цена : " + Prise + " цвет : " + Color);
    }

    @Override
    public void dressWomen() {
        System.out.println( name + "размер : " + Size + " цена : " + Prise + " цвет : " + Color);
    }

}


abstract class Skirt extends Clothes implements WomenClothes{

    @Override
    public void dressWomen() {
        System.out.println( name + "размер : " + Size + " цена : " + Prise + " цвет : " + Color);
    }
}

abstract class Tshirt extends Clothes implements ManClothes, WomenClothes {

    @Override
    public void dressMan() {
        System.out.println(name + "размер : " + Size + " цена : " + Prise + " цвет : " + Color);
    }

    @Override
    public void dressWomen() {
        System.out.println(name + "размер : " + Size + " цена : " + Prise + " цвет : " + Color);
    }
}

abstract class Tie extends Clothes implements ManClothes {

    @Override
    public void dressMan() {
        System.out.println(name + "размер : " + Size + " цена : " + Prise + " цвет : " + Color);
    }
}



