package com.pavi.learning.java.list;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args){

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits:" + fruits);

        fruits.add(1,"Orange");
        System.out.println("After Inserting:" + fruits);


        fruits.remove(2);
        System.out.println("After Removing:" + fruits);

        
    }
}
