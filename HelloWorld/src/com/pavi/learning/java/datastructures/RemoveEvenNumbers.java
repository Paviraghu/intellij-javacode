package com.pavi.learning.java.datastructures;

import java.util.Arrays;

public class RemoveEvenNumbers {

    public static void main(String[] args) {
        int[] arr = {10, 21, 32, 43, 54, 65, 76, 87};

        int count = 0;
        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int index = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                result[index++] = num;
            }
        }

        System.out.println("Array after removing even numbers: "
                + Arrays.toString(result));
    }
}
