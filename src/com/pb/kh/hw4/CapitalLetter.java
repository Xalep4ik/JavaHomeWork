package com.pb.kh.hw4;

import java.util.Scanner;

public class CapitalLetter {

    public static void main(String[] args){
        firstUpperLatter();
    }
        static void firstUpperLatter ()
        {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            char[] userMes = s.toCharArray();

            for (int i = 0; i < userMes.length; i++) {
                Comparable space = userMes[i];
                userMes[0] = Character.toUpperCase(userMes[0]);
                if (space.equals(' ')) {
                    userMes[i + 1] = Character.toUpperCase(userMes[i + 1]);
                }
            }
            System.out.println(userMes);
        }
}
