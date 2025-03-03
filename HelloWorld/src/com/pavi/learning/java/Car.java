package com.pavi.learning.java.constructor;

public class Car {

    String brand;
    int year;

    // Default constructor
    Car() {
        System.out.println("Default constructor called");
        brand = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String brand, int year) {
        System.out.println("Parameterized constructor called");
        this.brand = brand;
        this.year = year;
    }

    // Method to display car details
    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }

}

