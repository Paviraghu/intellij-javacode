package com.pavi.learning.java.exception;

public class ErrorHandlingExample {

    public static void main(String[] args) {

        try {
            int[] arr = new int[Integer.MAX_VALUE];
        } catch (Error e) {
            System.out.println("Caught an Error: " + e);
        }

    }
}
