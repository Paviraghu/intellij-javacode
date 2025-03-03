package com.pavi.learning.java.constructor;

public class CarApp {

    public static void main(String[] args) {

        // Using the default constructor
        Car car1 = new Car();
        car1.display();

        // Using the parameterized constructor
        Car car2 = new Car("Toyota", 2022);
        car2.display();

    }
}
