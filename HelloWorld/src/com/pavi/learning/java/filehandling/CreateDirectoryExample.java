package com.pavi.learning.java.filehandling;


import java.io.File;

public class CreateDirectoryExample {

    public static void main(String[] args) {

        File directory = new File("exampleDir");

        if (directory.exists()){
            System.out.println("Directory is already exists");
        } else if (directory.mkdir()) {
            System.out.println("Directory created:" + directory.getName());
        }else{
            System.out.println("Failed to create directory");
        }

        if(directory.isDirectory()){

            String[] files = directory.list();
            System.out.println("Files in directory:");

            for (String file : files){
                System.out.println(file);
            }
        }
    }
}
