package com.pavi.learning.java.filehandling;

import java.io.File;

public class DeleteFileExample {

    public static void main(String[] args) {

        File file = new File("example.txt");

        if (file.delete()){
            System.out.println("Delete the file:" + file.getName());
        }else {
            System.out.println("Failed to delete the file");
        }
    }
}
