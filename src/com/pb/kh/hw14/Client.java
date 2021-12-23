package com.pb.kh.hw14;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {

        String adressServ = "localhost";
        String userDate, serverDate;
        int portServ = 3000;

        Socket socket = new Socket(adressServ, portServ);
        BufferedReader serv = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Запуск соеденения : IP " + adressServ + ", порт " + portServ);
        System.out.println("Введите сообщение : ");

        while ((userDate = console.readLine()) != null) {
            System.out.println("Введите сообщение : ");
            writer.println(userDate);
            serverDate = serv.readLine();
            System.out.println(serverDate);
            if (userDate.equalsIgnoreCase("exit")) {
                break;
            }
        }
        socket.close();
        serv.close();
        console.close();
        writer.close();
    }
}
