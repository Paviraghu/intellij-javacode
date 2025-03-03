package com.pavi.learning.java.exception;

public class ExceptionSyntaxExample {

    public static void main(String[] args) {

        try {
        } catch (Exception e) {
        } finally {
        }
    }

    public void sampleException() {

        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}
