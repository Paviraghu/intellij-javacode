package com.pavi.learning.java.linkedlist;

class BinarySearch {

    public static int binarySearch(int[] arr, int target) {

        int left = 0, right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            System.out.println("Mid idx : " + mid + " arr[mid] : " + arr[mid]);

            if (arr[mid] == target) {
                return mid;
            }

            if (target < arr[mid]) {

                System.out.println(" target < arr[mid] : " + target + " < " + arr[mid]);
                System.out.println("First Half.. left idx : " + left  + " right idx : " + right);
                right = mid - 1;
                System.out.println("First Half.. left idx : " + left  + " right idx ( mid - 1 ): " + right);

            } else {
                System.out.println(" target < arr[mid] NO : " + target + " > " + arr[mid]);
                System.out.println("Second Half.. left idx : " + left + " right idx : " + right);
                left = mid + 1;
                System.out.println("Second Half.. left idx ( mid + 1 ) : " + left + " right idx : " + right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = { 4, 6, 8, 10, 15, 20, 25};

        System.out.println("Array size : " + arr.length);

        int target = 20;

        int result = binarySearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found");

    }
}
