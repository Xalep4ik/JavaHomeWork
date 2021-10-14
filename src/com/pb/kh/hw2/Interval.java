package com.pb.kh.hw2;

import java.util.Scanner;

public class Interval {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        int userNum = scanner.nextInt();

        if (0<=userNum&&userNum<=14) {
            System.out.println("Interval is 0-14");
            return;
        }
        else if  (15<=userNum&&userNum<=35) {
            System.out.println("Interval is 15-35");
            return;

        }
        else if (36<=userNum&&userNum<=50) {
            System.out.println("Interval is 36-50");
            return;
        }
        else if (51<=userNum&&userNum<=100) {
            System.out.println("Interval is 51-100");
            return;
        }
       else {
           System.out.println("Cant find number in intervals");
       }


        }

    }


