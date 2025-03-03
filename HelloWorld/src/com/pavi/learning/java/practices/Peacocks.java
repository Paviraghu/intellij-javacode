package com.pavi.learning.java.practices;

public class Peacocks extends Birds{


    public Peacocks(String name, String colour) {
        super(name, colour);
    }

    public Peacocks() {

    }

    @Override
     public void makesound() {
         System.out.println("Ceaw Ceaw");
     }

    @Override
    public void setcolour() {
        System.out.println("Blue with Green");
    }

}
