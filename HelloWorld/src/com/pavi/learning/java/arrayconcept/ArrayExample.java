package com.pavi.learning.java.arrayconcept;

import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {

        int[] myArray = {1, 2, 3, 4, 5};

        System.out.println("The first element is: " + myArray[1]);
        System.out.println("The fourth element is: " + myArray[4]);

        int[] Array = {20, 30, 40, 50, 60, 70};
        Array[3] = 10;

        System.out.println("Array modification:" + Arrays.toString(Array));
        System.out.println("The length of the array is: " + Array.length);

        int[] arr = {7, 5, 9, 3, 2, 8, 1, 6};
        int k = 6;
        java.util.Arrays.sort(arr);

        System.out.println(k + "th largest element: " + arr[arr.length - k]);
        System.out.println(k + "th smallest element: " + arr[k - 1]);
    }
}
