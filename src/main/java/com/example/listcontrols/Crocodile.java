package com.example.listcontrols;

public class Crocodile {
    String name;
    double length;

    public Crocodile(String name, double length) {
        this.name = name;
        this.length = length;
    }

    @Override
    public String toString() {
        return  name + " length=" + length ;
    }
}
