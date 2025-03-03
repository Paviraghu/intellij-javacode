package com.pavi.learning.java.exception;

import java.io.FileReader;

public class FileNotFoundException {

    public static void main(String[] args) {

        try {

            FileReader file = new FileReader("missingfile.txt");

        } catch (java.io.FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }
}
