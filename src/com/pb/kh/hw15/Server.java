package com.pb.kh.hw15;

import java.io.Serializable;
import java.util.function.Consumer;

public class Server extends Network{
    private int port;
    public Server(int port,Consumer<Serializable> onReceive) {
        super(onReceive);
        this.port = port;
    }

    @Override
    protected boolean isServer() {
        return true;
    }

    @Override
    protected String getIp() {
        return null;
    }

    @Override
    protected int getPort() {
        return port;
    }
}
