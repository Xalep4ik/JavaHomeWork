package com.pb.kh.hw4;

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String [] args){
        isAnagram();
    }

    public static String isAnagram() {
        Scanner scanner = new Scanner(System.in);
        String s1,s2;
        s1 = scanner.nextLine().replaceAll("., ", "");
        s2 = scanner.nextLine().replaceAll("., ","");
        char [ ] c1 = s1.toUpperCase().toCharArray();
        char [ ] c2 = s2.toUpperCase().toCharArray();
        for  (int i = c1.length - 1;i >  0;i--)
        {
            for (int j = 0;j < i; j++)
            {
                if (c1[j] > c1[j + 1])
                {
                    char tmp = c1[j];
                    c1 [j]= c1[j + 1];
                    c1 [j + 1] = tmp;
                }
            }
        }
        for (int i = c2.length - 1;i >  0;i-- )
        {
            for (int j = 0;j < i; j++)
            {
                if (c2[j] > c2[j +1])
                {
                    char tmp = c2[j];
                    c2[j] = c2[j + 1];
                    c2[j + 1] = tmp;
                }
            }
        }
        String valueOfc1=String.valueOf(c1);
        String valueOfc2=String.valueOf(c2);
        valueOfc1=valueOfc1.replaceAll( " " , "" );
        valueOfc2=valueOfc2.replaceAll( " " , "" );
        System.out.println(valueOfc1);
        System.out.println(valueOfc2);
        System.out.println(valueOfc1.equalsIgnoreCase ( valueOfc2 ) ) ;
        boolean result=valueOfc1.equalsIgnoreCase(valueOfc2);
        System.out.println("There is anagram: " + result);

        return isAnagram();
    }

}

