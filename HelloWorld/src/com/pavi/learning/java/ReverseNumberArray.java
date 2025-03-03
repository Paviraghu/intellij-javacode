package com.pavi.learning.java;

public class ReverseNumberArray {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        int n=numbers.length;

        int start = 0, end = n - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;

        }
        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i] + " ");
        }
    }
}
