package com.pavi.learning.java.stream;

import java.io.FileReader;
import java.io.IOException;

public class CharacterDataExample {

    public static void main(String[] args) {

        try (FileReader reader = new FileReader("example.txt")){

            int charData;

            while ((charData = reader.read()) != -1){
                System.out.println((char) charData);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
