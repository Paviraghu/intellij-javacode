package com.pavi.learning.java;

import java.util.Arrays;

public class ArrayElements {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        int[] array = new int[count];

        int index = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
                array[index] = arr[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
