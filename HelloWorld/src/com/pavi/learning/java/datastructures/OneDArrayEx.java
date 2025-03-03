package com.pavi.learning.java.datastructures;

import java.util.Arrays;

public class OneDArrayEx {

    public static void main(String[] args) {

        OneDArrayEx oneDArrayEx = new OneDArrayEx();

        oneDArrayEx.printArray(oneDArrayEx.arrayTest());

    }

    public int[] arrayTest() {

        int[] myArray = new int[5];

        myArray[0] = 5;
        myArray[1] = 8;
        myArray[2] = 9;
        myArray[3] = 1;
        myArray[4] = 4;

        myArray[1] = 7;
        myArray[3] = 2;

        return myArray;

    }

    public void printArray(int[] arr) {

        int arrLen = arr.length;

        for (int i = 0; i < arrLen; i++) {
            System.out.println(arr[i] + " ");
        }

        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));

    }
}
