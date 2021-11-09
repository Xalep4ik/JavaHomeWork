package com.pb.kh.hw7;

import java.util.SortedMap;

public enum Size {

    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    Size(String description, int euroSize) {
        this.description = description;
        this.euroSize = euroSize;
    }

    private String description;

    private int euroSize;


    public String getDescription() {
        return description;
    }

    public int getEuroSize() {
        return euroSize;
    }

}
