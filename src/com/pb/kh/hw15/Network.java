package com.pb.kh.hw15;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.function.Consumer;

public abstract class Network {
    private ConnectionThread connectionThread = new ConnectionThread();
    private Consumer<Serializable> onReceive;

    public Network(Consumer<Serializable> onReceive) {
        this.onReceive = onReceive;
        connectionThread.setDaemon(true);
    }

    public void startConnection() throws Exception {
        connectionThread.start();
    }

    public void send(Serializable data) throws Exception {
        connectionThread.outputStream.writeObject(data);
    }

    public void closeConnection() throws Exception {
        connectionThread.socket.close();
    }

    protected abstract boolean isServer();

    protected abstract String getIp();

    protected abstract int getPort();

    private class ConnectionThread extends Thread {
        private Socket socket;
        private ObjectOutputStream outputStream;

        @Override
        public void run() {
            try (ServerSocket serverSocket = isServer() ? new ServerSocket(getPort()) : null;
                 Socket socket = isServer() ? serverSocket.accept() : new Socket(getIp(), getPort());
                 ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                 ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream())) {

                this.socket = socket;
                this.outputStream = outputStream;
                socket.setTcpNoDelay(true);
                while (true){
                    Serializable data = (Serializable) inputStream.readObject();
                    onReceive.accept(data);
                }

            } catch (Exception e) {
                onReceive.accept("Connection closed");
            }
        }
    }
}
