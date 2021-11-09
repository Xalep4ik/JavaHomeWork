package com.pb.kh.hw7;


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
