package com.pavi.learning.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {

        try {
            File file = new File("example.txt");
            if (file.createNewFile()){
                System.out.println("File created:" + file.getName());
            }else{
                System.out.println("File is already exists.");
            }

            System.out.println("File exists:" + file.exists());
            System.out.println("File path:" + file.getAbsolutePath());
            System.out.println("is file writable:" + file.canWrite());
            System.out.println("is file readable:" + file.canRead());


        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
}
