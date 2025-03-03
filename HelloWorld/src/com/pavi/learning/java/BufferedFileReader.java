package com.pavi.learning.java.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedFileReader {

    public static void main(String[] args) {

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("sample-text-file.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();

        } finally {
            if (reader != null) {
                try {
                    reader.close();
                    System.out.println("closed successfully.");
                } catch (IOException e) {
                    System.out.println("An error occurred");
                    e.printStackTrace();
                }
            }
        }
    }
}
