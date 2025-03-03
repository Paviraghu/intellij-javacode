package com.pavi.learning.java.stringformat;

import java.util.Date;

public class StringFormattingExample {

    public static void main(String[] args) {

        String name = "Pavithra";
        int age = 23;

        System.out.println(String.format("My name is %s, and I am %d years old", name, age));

        double pi = 3.14159;
        System.out.println(String.format("Value of pi: %.2f", pi));

        System.out.println(String.format("|%10s|", "Right"));
        System.out.println(String.format("|%-10s|", "Left"));

        int number = 12345;
        System.out.println(String.format("Zero Padded: %05d%n", number));
        System.out.println(String.format("With Grouping: %,d%n", 123456789));

        System.out.printf("Name: %s, Age: %d, Pi: %.3f%n", name, age, pi);

        Date date = new Date();
        System.out.printf("Current Date: %tY-%<tm-%<td%n", date);

        char letter = 'A';
        System.out.printf("Character: %c%n", letter);

    }
}
