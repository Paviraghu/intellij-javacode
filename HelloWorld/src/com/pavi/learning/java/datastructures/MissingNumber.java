package com.pavi.learning.java.datastructures;
public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
        int n = 6;
        System.out.println("Missing Number: " + findMissingNumber(arr, n));
    }

    public static int findMissingNumber(int[] arr, int n) {
        int total = n * (n + 1) / 2;
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }
        return total - sum;
    }
}


