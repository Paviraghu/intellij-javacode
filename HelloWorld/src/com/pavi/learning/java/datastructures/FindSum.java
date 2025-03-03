package com.pavi.learning.java.datastructures;

public class FindSum {

    public static void main(String[] args) {

        FindSum findSum = new FindSum();

        long start = System.currentTimeMillis();
        System.out.println(findSum.findSumUsingMath(99999999));
        long end = System.currentTimeMillis();

        System.out.println("Time Taken for math function:" + (end - start));

        start = System.currentTimeMillis();
        System.out.println(findSum.findSumUsingForLoop(99999999));
        end = System.currentTimeMillis();

        System.out.println("Time taken for loop:" + (end - start));

    }


    public int findSumUsingMath(int n) {
        return n * (n + 1) / 2;
    }

    public int findSumUsingForLoop(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return sum;
    }
}
