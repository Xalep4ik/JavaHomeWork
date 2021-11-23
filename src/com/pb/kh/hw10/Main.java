package com.pb.kh.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> number = new NumBox<Integer>(5);
        NumBox<Float> floatNumBox = new NumBox<>(4);

        number.set(0,1);
        number.set(1, 11);
        number.set(2, 22);
        number.set(3, 33);
        number.set(4, 44);
        // number.set(5, 55);

        floatNumBox.set(0, 19.0f);
        floatNumBox.set(1, 11.0f);
        floatNumBox.set(2, 22.2f);
        floatNumBox.set(3, 33.3f);
        //floatNumBox.set(4, 44.4f);

        System.out.println(number.length());
        System.out.println(number.sum());
        System.out.println(floatNumBox.sum());
        System.out.println(number.max());


    }
}
