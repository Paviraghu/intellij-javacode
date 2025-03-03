package com.pavi.learning.java.practices;

public class Birds {

    String name;
    String colour;

    public Birds(String name,String colour){
        this.name = name;
        this.colour = colour;
    }

    public Birds() {


    }

    public void makesound(){
        System.out.println("Make sound");
    }

    public void setcolour(){
        System.out.println("Colour");
    }
}
