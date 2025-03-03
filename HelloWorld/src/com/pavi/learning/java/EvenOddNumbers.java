package com.pavi.learning.java;

public class EvenOddNumbers {

    public static void main(String[] args) {

        int num = 100;

        System.out.println("Even Numbers:");

        for (int i = 1; i <= num; i++) {

            if (i % 2 == 0) {

                System.out.println(i + " ");
            }
        }

        System.out.println("Odd Number:");

        for (int i = 1; i <= num; i++) {

            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
