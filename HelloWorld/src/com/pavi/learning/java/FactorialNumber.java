package com.pavi.learning.java;

public class FactorialNumber {

    public static void main(String[] args) {

        int number=6;

        long result=factorial(number);

        System.out.println("Factorial of" +" "+ number + " is "+ result);
    }

    public static long factorial(int number){

        long fact=1;

        for (int i=1;i<=number;i++){
            fact*=i;
        }
        return fact;
    }
}
