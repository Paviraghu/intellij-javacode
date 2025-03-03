package com.pavi.learning.java.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ByteDataExample {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("example.bin")){

            int byteData;
            while ((byteData = fis.read()) != -1){
                System.out.println(byteData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
