package com.pavi.learning.java.userinput;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {


    public static void main(String[] args) throws IOException {

        DataInputStream dataInput = new DataInputStream(System.in);

        System.out.println("Enter your name:");
        String name = dataInput.readLine();

        System.out.println("Hello," + name + "!");
    }
}