package com.pb.kh.hw8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Auth {

    Scanner scanner = new Scanner(System.in);

    private String login ;
    private String password ;



    public void signUp() throws WrongLoginException,WrongPasswordException {

        System.out.println("Регистрация на сайте, введите логин и пароль :");

        login = scanner.nextLine();
        if (Pattern.matches("[a-zA-Z0-9_]{5,20}" , login)) {
            System.out.println("Логин принят , введите пароль :");
            setLogin(login);
            }
        else {
            System.out.println("Неверный формат логина !");
            throw new WrongLoginException(login);
        }
        password = scanner.nextLine();
        if (Pattern.matches("[a-zA-Z0-9]{4,500}", password)){
            System.out.println("Пароль принят ! Подтвердите пароль : ");
            setPassword(password);
        }else {
            System.out.println("Неверный формат пароля !");
            throw new WrongPasswordException();
        }
        String confirmPassword = scanner.nextLine();
        if (password != null && password.matches(confirmPassword)) {
            System.out.println("Регистрация прошла успешно !");
           // Auth auth = new Auth();
        }else {
            System.out.println("Пароль не совпадает !");
            throw new WrongPasswordException();
        }

    }

    public void signIn() throws WrongLoginException,WrongPasswordException{
        System.out.println("-----------------------------");
        System.out.println("Выполните вход :");
        String login2 = scanner.nextLine();

        if (login2.matches(login)){
            System.out.println("Шаг 2 : введите пароль :");
        }else {
            System.out.println("Не коректрые данные !");
            throw new WrongLoginException(login);
        }
        String password2= scanner.nextLine();
        if (password2.matches(password)){
            System.out.println("Вход выполнен успешно !");
        }else {
            System.out.println("Не верные данные !");
            throw new WrongPasswordException();
        }
    }

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

}
