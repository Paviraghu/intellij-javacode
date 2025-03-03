package com.pavi.learning.java.exception;

public class ClassCastExceptionExample {

    public static void main(String[] args) {

        try {
            Object obj = new String("Hello");
            Integer num = (Integer) obj;
        } catch (ClassCastException e) {
            System.out.println("ClassCastException caught: " + e.getMessage());
        }

    }
}
