package com.pavi.learning.java.oops.Inheritance;

public class Rose extends Flower {

    public Rose(String name){
        super(name);
    }

    @Override
    public void setName(){
        System.out.println("It is Rose" );
    }

    public void setColour(){
        System.out.println("Red colour");
    }
}