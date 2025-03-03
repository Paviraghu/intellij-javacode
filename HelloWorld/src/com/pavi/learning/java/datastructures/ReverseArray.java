package com.pavi.learning.java.datastructures;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int firsIdx = 0, lastIdx = arr.length - 1;

        while (firsIdx < lastIdx) {

            int temp = arr[firsIdx];
            arr[firsIdx] = arr[lastIdx];
            arr[lastIdx] = temp;

            firsIdx++;
            lastIdx--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }
}
