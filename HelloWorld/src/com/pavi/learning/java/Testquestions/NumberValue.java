package com.pavi.learning.java.Testquestion;

import java.util.Scanner;

public class NumberValue {

    int a,b;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = scanner.nextInt();
        System.out.println(a > 0 ? "It is positive value":"It is negative value");

        System.out.println("Enter a number:");
        int b = scanner.nextInt();
        System.out.println( b < 0 ? "It is negative value":"It is positive value");

        }
    }

