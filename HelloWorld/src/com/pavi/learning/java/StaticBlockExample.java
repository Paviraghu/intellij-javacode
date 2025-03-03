package com.pavi.learning.java;

public class StaticBlockExample {

    static int count;

    static{
        System.out.println("Static block executed");
        count = 10;
    }

    public static void main(String[] args){

        System.out.println("com.pavi.learning.java.Main method executed");
        System.out.println("Static count:" + count);
    }
}
