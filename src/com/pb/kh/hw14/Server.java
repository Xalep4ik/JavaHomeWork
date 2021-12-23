package com.pb.kh.hw14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalDateTime;

public class Server {
    public static void main(String[] args) throws IOException {

        LocalDateTime msgTime = LocalDateTime.now();
        int portServ = 3000;

        BufferedReader up = null;
        PrintWriter down = null;
        ServerSocket socket = null;
        Socket client = null;

        try {
            socket = new ServerSocket(portServ);

        } catch (IOException i) {
            System.out.println("Не удалось соеденится с портом" + portServ);
            System.exit(-1);
        }
        try {
            client = socket.accept();
            System.out.println("Соедение установлено");
        } catch (IOException i) {
            System.out.println("Клиент не подключен");
            System.exit(-1);
        }
        up = new BufferedReader(new InputStreamReader(client.getInputStream()));
        down = new PrintWriter(client.getOutputStream(), true);
        String msg;
        System.out.println("Вывод сообщений : ");
        while ((msg = up.readLine()) != null) {
            if (msg.equalsIgnoreCase("exit")) {
                break;
            }
            down.println(msgTime + " Сервер " + msg);
            System.out.println(msgTime + " " + msg);
        }
        up.close();
        down.close();
        socket.close();
        client.close();
    }
}
