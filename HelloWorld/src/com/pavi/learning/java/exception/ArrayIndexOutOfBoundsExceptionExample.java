package com.pavi.learning.java.exception;

public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {

        try {

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
