package com.pavi.learning.java.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

    public static void main(String[] args){

        try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("example.txt"))){

            int byteData;
            while ((byteData = bis.read()) != -1){
                System.out.println((char) byteData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
