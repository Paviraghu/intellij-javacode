package com.pavi.learning.java.datastructures;

import java.util.Arrays;

public class ResizeAnArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        int newSize = 8;

        int[] newArr = new int[newSize];

        System.arraycopy(arr,0,newArr,0,arr.length);

        System.out.println("Resize:"+Arrays.toString(newArr));
    }
}
