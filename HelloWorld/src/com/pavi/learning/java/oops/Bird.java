package com.pavi.learning.java.oops.interfacexample;

interface Flyable{
    void fly();
}

interface Swimmable{
    void swim();
}

class Duck implements Flyable,Swimmable{

    @Override
    public void fly() {
        System.out.println("Duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming");
    }
}

public class Bird{

    public static void main(String[] args){

        Duck duck = new Duck();
        duck.fly();
        duck.swim();

    }
}