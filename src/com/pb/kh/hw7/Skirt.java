package com.pb.kh.hw7;

abstract class Skirt extends Clothes implements WomenClothes{

    @Override
    public void dressWomen() {
        System.out.println( name + "размер : " + Size + " цена : " + Prise + " цвет : " + Color);
    }
}
