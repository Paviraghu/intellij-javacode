package com.pavi.learning.java.datastructures;

import java.util.Arrays;

public class MoeZeroesToFirst {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12, 0, 5};

        moveZeroesToFront(arr);

        System.out.println("Array after moving to front: " + Arrays.toString(arr));
    }

    public static void moveZeroesToFront(int[] arr) {

        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] != 0) {
                arr[index--] = arr[i];
            }
        }

        while (index >= 0) {
            arr[index--] = 0;
        }
    }
}

