package com.pb.kh.hw2;

import java.util.Scanner;

public class Calkulator {
    static Scanner scan = new Scanner(System.in);
        public static void main(String[] args) {

            int a = scan.nextInt();
            int b = scan.nextInt();
            int result = calc(a, b, getOperation());

            System.out.println("Sum is " + result);
        }
            public static char getOperation(){
            System.out.println("Choose operation: ");
            char sign;
            if(scan.hasNext()){
                sign = scan.next().charAt(0);
            } else {
            scan.next();
                sign = getOperation();
            }
            return sign;
            }

            public static int calc ( int a, int b, char sign){
                int result;
                switch (sign) {
                    case '+':
                        result = (a + b);
                        break;
                    case '-':
                        result = (a - b);
                        break;
                    case '/':
                        if ( b==0) {
                            System.out.println("Cant divide by 0");
                        }
                        result = a / b;
                        break;
                    case '*':
                        result = a * b;
                        break;
                    default:
                      System.out.println("Error try again");
                      result = calc(a, b, getOperation());

                }
                return result;
            }

}
