package com.pavi.learning.java.sort;

import java.util.Arrays;

public class QuickSort {

    static int[] arr = {8, 7, 6, 1, 0, 9, 2};

    static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            System.out.println("PivotIdx before partition:" + high);

            int pivotIdx = partition(arr, low, high);
            System.out.println("Pivotidx:" + pivotIdx);

            quickSort(arr, low, pivotIdx - 1);

            System.out.println("PivotIdx:" + pivotIdx);
            quickSort(arr, pivotIdx + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        System.out.println("Input Array in partitions:" + Arrays.toString(Arrays.copyOfRange(arr, low, high + 1)));

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        printArray(arr);
        return i + 1;
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}