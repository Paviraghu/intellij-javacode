package com.pavi.learning.java.datastructures;

public class LinearArrayDataStruct {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        System.out.println("Third Number is:" + numbers[3]);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Numbers " + (i + 1) + " is:" + numbers[i]);
        }
    }
}
