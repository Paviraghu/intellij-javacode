package com.pavi.learning.java.relationship;

class Engine {
    void start() {
        System.out.println("com.pavi.learning.java.relationship.Engine starts.");
    }
}

class Car {
        private Engine engine;

        Car() {
            engine = new Engine();
        }

    void startCar() {
        engine.start();

        System.out.println("com.pavi.learning.java.relationship.Car starts.");
        }
    }

public class HasARelationship{
    public static void main(String[] args){
        Car car = new Car();
        car.startCar();
    }
}
