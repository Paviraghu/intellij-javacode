package com.pavi.learning.java.oops.abstraction;

abstract class Animals {

    abstract void makesound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dogs extends Animals {

    @Override
    void makesound() {
        System.out.println("Make sound.");
    }
}

public class AbstractApp {

    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.makesound();
        dog.eat();

    }
}
