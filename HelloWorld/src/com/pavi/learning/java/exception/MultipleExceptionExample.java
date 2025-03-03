package com.pavi.learning.java.exception;

public class MultipleExceptionExample {

    public static void main(String[] args) {

        try {
            int[] arr = new int[5];
            arr[8] = 50;  // ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds");
        } catch (Exception e) {
            System.out.println("General exception");
        }

    }
}
