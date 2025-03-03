package com.pavi.learning.java.sort;

public class InsertionSort {

    static int[] arr = {9, 5, 1, 4, 3};

    static void insertionSort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {

            int key = arr[i];

            int j = i - 1;

            System.out.println("key :[i]" + i + "-->" + "[j]" + j + "-->" + arr[j]);

            while (j >= 0 && arr[j] > key) {
                System.out.println("arr[j>key:" + arr[j] + ">" + key);
                arr[j + 1] = arr[j];
                printArray(arr);
                j--;
                System.out.println("[j-->" + j);
            }
            System.out.println("j-->:" + j + "[j+1]-->:" + (j + 1));
            arr[j + 1] = key;
            printArray(arr);
            System.out.println("\n");
        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.printf(num + " ");
        }
    }

    public static void main(String[] args) {

        System.out.println("Original Array:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

    }
}