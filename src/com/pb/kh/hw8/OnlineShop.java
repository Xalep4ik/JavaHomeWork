package com.pb.kh.hw8;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {

        Auth auth = new Auth();

        try {
            auth.signUp();
        }catch (WrongLoginException loginException){
            System.out.println("wrong login " + loginException);
        }catch (WrongPasswordException wrongPasswordException){
            System.out.println("try batter next time");
        }
        try {
            auth.signIn();
        }catch (WrongLoginException loginException){
            System.out.println("bla bla" + loginException);
        }
        catch (WrongPasswordException wrongPasswordException){
            System.out.println("not this time");
        }
        finally {
            System.out.println("Спасибо за посещение !");
        }

    }
}
