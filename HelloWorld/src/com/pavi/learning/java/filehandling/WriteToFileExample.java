package com.pavi.learning.java.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFileExample {

    public static void main(String[] args) {

        try{

            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello,this is a sample file.\n");
            writer.write("Java file handling is easy!");
            writer.close();

            System.out.println("Successfully wrote to the file");

        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
