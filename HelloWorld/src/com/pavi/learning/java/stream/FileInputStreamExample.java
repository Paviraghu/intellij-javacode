package com.pavi.learning.java.stream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

    public static void main(String[] args) {

        String filepath = "example.txt";

        try (FileInputStream fis = new FileInputStream(filepath)){

            System.out.println(fis.getChannel());

            System.out.println(fis.getFD());

            System.out.println("Number of Remaining Bytes:" + fis.available());

            fis.skip(4);

            int content;
            while ((content = fis.read()) != -1){
                System.out.println((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
