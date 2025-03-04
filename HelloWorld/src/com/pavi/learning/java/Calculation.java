package com.pavi.learning.java.testoperationspecified;

public class Calculation {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {

        int retVal = 0;
        try {
            retVal = a / b;
        } catch (ArithmeticException ae) {
            ae.getMessage();
        }
        return retVal;
    }
}
