package com.pb.kh.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Auth {

    Scanner scanner = new Scanner(System.in);

    private String login = scanner.nextLine();
    private String password = scanner.nextLine();
    private String confirmPassword = scanner.nextLine();

    public Auth (){}

    public void signUp() throws WrongLoginException,WrongPasswordException {

        System.out.println("Регистрация на сайте : ");

        if (5>login.length() || login.length()<=20)
            Pattern.matches("[a-zA-Z0-9]{5,20}",login);
        {
            System.out.println("Логин принят , введите пароль :");
        }

            System.out.println("Неверный формат логина !" );

        if (password.length()<8){
            System.out.println("Неверный формат пароля !");
        }
    }

    public void signIn(){}

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
