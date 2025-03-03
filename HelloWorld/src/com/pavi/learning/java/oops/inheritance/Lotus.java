package com.pavi.learning.java.oops.Inheritance;

public class Lotus extends Flower {

    public Lotus(String name){
        super(name);
    }

    @Override
    public void setName() {
        System.out.println("It is Lotus");
    }

    public void setColour() {
        System.out.println("Pink Colour");
    }

}
