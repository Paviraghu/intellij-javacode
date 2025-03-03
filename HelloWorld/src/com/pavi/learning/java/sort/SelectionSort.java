package com.pavi.learning.java.sort;

public class SelectionSort {

    static int[] arr = {2, 4, 9, -1, 11, 7};

    static void selectionSort(int[] arr) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < n; j++) {

                System.out.println(" [i] :" + i + "  --- [j] :" + j + " minIndex : " + minIndex);
                System.out.println("Compare : arr[j] < arr[minIndex] : [ " +  arr[j] + " :  " + arr[minIndex] +"]");

                if (arr[j] < arr[minIndex]) {
                    System.out.println("arr[j] < arr[minIndex] : [ " +  arr[j] + " :  " + arr[minIndex] +"]");
                    minIndex = j;
                    System.out.println("minIndex : " + minIndex);
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            System.out.println(" Swapping value : arr[minIndex] : " + arr[minIndex]  + " arr[i] " + arr[i]);
            printArray(arr);
            System.out.println("\n");

        }
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {


        System.out.println("Original array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }

}
