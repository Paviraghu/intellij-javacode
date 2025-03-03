package com.pavi.learning.java.exception;

public class IllegalArgumentExceptionExample {

    public static void main(String[] args) {

        try {
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
    }
}
