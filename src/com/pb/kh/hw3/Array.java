package com.pb.kh.hw3;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Create array");
        array[0] = scan.nextInt();
        array[1] = scan.nextInt();
        array[2] = scan.nextInt();
        array[3] = scan.nextInt();
        array[4] = scan.nextInt();
        array[5] = scan.nextInt();
        array[6] = scan.nextInt();
        array[7] = scan.nextInt();
        array[8] = scan.nextInt();
        array[9] = scan.nextInt();
        System.out.println(" ");
        for (int x = 0; x < array.length; ++x) {
            System.out.println("Your array number is " + array[x]);
        }
        System.out.println(" ");
        System.out.println("Your array length is " + array.length);
        System.out.println(" ");
        int sum = 0;
        for (int i = 0; i < array.length; i++ ){
            sum += array[i];
            System.out.println("Sum of arreys is " + sum);
            System.out.println("");
        }
        int su = 0;
        int counter = 0;
        for (int b = 0; b < array.length; b++){
            if (array[b]>0) {
                su += array[b];
                counter++;
                System.out.println("Sum of positive elements is " + su);
                System.out.println("");
                System.out.println("Positive is " + counter);
                System.out.println("");
            }
        }
        System.out.println("Sorting Bubble:");

        for (int y = 0; y < array.length - 1; ++y) {
            int min = array[y];
            int position = y;
            for (int z = y + 1; z < array.length; ++z)
                if (min > array[z]) {
                    position = z;
                    min = array[z];

                }
            int z = array[y];
            array[y] = array[position];
            array[position] = z;

        }
        for (int val : array) System.out.println( val + " ");




    }

}
