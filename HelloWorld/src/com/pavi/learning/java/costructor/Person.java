package com.pavi.learning.java.constructor;

public class Person {

    public String name;
    public int age;
    String gender;
    String color;
    int height;
    int weight;

    public Person(String name, int age, String gender, String color, int height, int weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.height = height;
        this.weight = weight;
    }


    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Color: " + color);
        System.out.println("Height: " + height);
        System.out.println("Weight: " + weight);

    }
}

