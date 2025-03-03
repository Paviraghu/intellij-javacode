package com.pavi.learning.java.oops.Inheritance;

public class Flower {

    String name;
    String colour;

    public Flower(String name) {
        this.name = name;
    }

    public void setName() {
        System.out.println("name:" + name);
    }

    public void setColour() {
        System.out.println("Colour:" + colour);
    }
}
