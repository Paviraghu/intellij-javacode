package com.pavi.learning.java.userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = reader.readLine();

        System.out.println("Enter your age:");

        int age = Integer.parseInt(reader.readLine());

        System.out.println("Enter your height in meters:");
        double height = Double.parseDouble(reader.readLine());

        System.out.println("Hello," + name + "!");
        System.out.println("your age is" + age + "years");
        System.out.println("Your height is" + height + "meters");

    }
}
