package com.pb.kh.hw15;

import java.io.Serializable;
import java.util.function.Consumer;

public class Client extends Network {
    private String ip;
    private int port;

    public Client(String ip, int port, Consumer<Serializable> onReceive) {
        super(onReceive);
        this.ip = ip;
        this.port = port;
    }

    @Override
    protected boolean isServer() {
        return false;
    }

    @Override
    protected String getIp() {
        return ip;
    }

    @Override
    protected int getPort() {
        return port;
    }
}
