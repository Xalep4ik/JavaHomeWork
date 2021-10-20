package com.pb.kh.hw3;
import java.util.Random;
import java.util.Scanner;

public class Bingo {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Try to guess win number from 0 to 100");
        System.out.println("Or write 911 to quit");
        int ranNum = rand.nextInt(101);
        System.out.println(ranNum);
        int attempt = 0;
        final int maxattempt = 5;
        int quit = 911;


        while (attempt < maxattempt) {
            attempt++;
            System.out.println("Attempt number " + attempt + ":");
            int youNum = scan.nextInt();

            if (youNum==911){
                System.out.println("You quit with " + attempt + " attempts");
                break;
            }
            if (attempt== maxattempt){
                System.out.println("Its not your day, good luck");
                break;
            }
            if (0>youNum||youNum>=101) {
                System.out.println("Wrong diapason of number");
                break;
            }
            if (ranNum == youNum) {
                System.out.println("You won!!! W5ith " + attempt + " attempts.");
                break;
            }
            if (ranNum > youNum) {
                System.out.println("Try bigger number");
            }
            if (ranNum < youNum) {
                System.out.println("Try less number");
            }



        }




    }
}
