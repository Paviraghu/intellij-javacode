package com.pavi.learning.java.datastructures;

public class Palindrome {

    public static void main(String[] args) {
        String str = "abcdcba";
        System.out.println("Palindrome ? " + isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {

        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
