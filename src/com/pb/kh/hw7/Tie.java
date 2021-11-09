package com.pb.kh.hw7;


abstract class Tie extends Clothes implements ManClothes {

    @Override
    public void dressMan() {
        System.out.println(name + "размер : " + Size + " цена : " + Prise + " цвет : " + Color);
    }
}
