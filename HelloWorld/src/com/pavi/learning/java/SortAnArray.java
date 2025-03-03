package com.pavi.learning.java;

public class SortAnArray {

    public static void main(String[] args) {

        int[] array = {2, 3, 4, 5, 3, 4, 2, 34, 2, 56, 98, 32, 54};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                    System.out.println("i : ["+i+ "]  j :  [" + j + "]   ----  temp : " + temp + " array[i] : "+ array[i] + " array[j] " + array[j]);
                }
            }
        }

        for(int i : array) {
            System.out.print(i + " ");
        }
    }
}
