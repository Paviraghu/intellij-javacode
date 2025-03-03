package com.pavi.learning.java.arrayconcept;

public class ArrayIteration {

    public static void main(String[] args) {

        String[] names = {"pavi", "sowmi", "kavin"};

        System.out.println("Using for loop:");
        for (int i = 0; i < names.length; i++) {

            System.out.println(names[i]);
        }

        System.out.println("\nUsing enhance for loop:");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
