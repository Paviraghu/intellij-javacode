package com.pavi.learning.java.datastructures;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 3, 12, 0, 5};
        moveZeroes(arr);
        System.out.println("Array after moving zeroes:" + Arrays.toString(arr));
    }

    public static void moveZeroes(int[] arr) {

        int index = 0;

        for (int num : arr) {

            if (num != 0) {
                arr[index++] = num;
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
