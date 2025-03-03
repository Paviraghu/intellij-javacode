package com.pavi.learning.java;

public class PrimeNumbers {

    public static void main(String[] args) {

        int num = 45;

        System.out.println("Prime Numbers:" + num);

        for (int numb = 2; numb <= num; numb++) {
            if (isPrime(numb)) {
                System.out.println(numb + " ");
            }
        }
    }

    private static boolean isPrime(int numb) {

        if (numb == 1) {
            return false;
        }

        for (int i = 2; i < numb; i++) {

            if (numb % i == 0) {
                return false;
            }
        }
        return true;
    }
}
