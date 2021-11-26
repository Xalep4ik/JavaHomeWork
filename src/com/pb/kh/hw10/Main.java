package com.pb.kh.hw10;

public class Main {
    public static void main(String[] args) {
        NumBox<Integer> number = new NumBox<Integer>(5);
        NumBox<Float> floatNumBox = new NumBox<>(4);

        number.add(1);
        number.add(11);
        number.add(66);
        number.add(33);
        number.add(44);
        //number.add(55);

        floatNumBox.add(19.0f);
        floatNumBox.add(11.0f);
        floatNumBox.add(22.2f);
        floatNumBox.add(33.3f);
        //floatNumBox.add(44.4f);

        System.out.println(number.get(3));
        System.out.println(floatNumBox.get(3));

        System.out.println(number.length());
        System.out.println(floatNumBox.length());

        System.out.println(number.sum());
        System.out.println(floatNumBox.sum());

        System.out.println(number.average());
        System.out.println(floatNumBox.average());

        System.out.println(number.max());
        System.out.println(floatNumBox.max());



    }
}
