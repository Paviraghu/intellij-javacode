package com.pavi.learning.java;

public class FibonacciSeries {

    public static void main(String[] args) {

        int fibonacci = 20;

        System.out.println("Fibonacci series:" + fibonacci);

        int first = 0;
        int second = 1;

        for (int i = 0; i < fibonacci; i++) {

            System.out.println(first + " ");

            int next = first + second;

            first = second;
            second = next;

        }
    }
}
