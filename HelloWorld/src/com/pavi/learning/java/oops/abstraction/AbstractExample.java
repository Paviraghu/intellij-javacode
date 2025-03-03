package com.pavi.learning.java.oops.abstraction;

abstract class Vehicle {

    abstract void start();

    abstract void openDoor();
}

abstract class Car extends Vehicle{

    abstract void openDoor();
}

class Maruthi extends Vehicle{


    @Override
    void start() {
        System.out.println("Maruthi is starting");
    }

    @Override
    void openDoor(){
        System.out.println("sedan door opened");
    }
}

class Suzhuki extends Vehicle{


    @Override
    void start() {
        System.out.println("suzukhi is starting");
    }

    @Override
    void openDoor(){
        System.out.println("sedan door opened");
    }
}


public class AbstractExample {
    public static void main(String[] args) {
        Maruthi maruthi = new Maruthi();
        maruthi.openDoor();
        maruthi.start();


        Suzhuki suzhuki = new Suzhuki();
        suzhuki.openDoor();
        suzhuki.start();
    }
}