package com.pavi.learning.java.callbyexample;

public class ExampleFroCallByValue {

    public static void modifyValue(int a) {
        a = 10;
        System.out.println("A value in modifyValue method:" + a);
    }

    public static void main(String[] args) {
        int a = 5;
        modifyValue(a);
        System.out.println("A value in main method:" + a);
    }
}
