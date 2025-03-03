package com.pavi.learning.java.datastructures;

import java.util.Arrays;

public class MinValueArray {

    public static void main(String[] args) {

        int[] arr = {23, 12, 45, 7, 56, 3, 89};

        MinValueArray minValueArray = new MinValueArray();
        System.out.println("findMinValue : " + minValueArray.findMinValue(arr));
        System.out.println("findMinValueUsingStream : " + minValueArray.findMinValueUsingStream(arr));

    }


    public int findMinValue(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int findMinValueUsingStream(int[] arr) {
        int min = Arrays.stream(arr).min().getAsInt();
        return min;
    }
}
