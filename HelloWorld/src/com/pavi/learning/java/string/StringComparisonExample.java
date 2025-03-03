package com.pavi.learning.java.string;

public class StringComparisonExample {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "heyy";
        String str3 = "Hello";

        System.out.println("str1 equals str2 (case-sensitive): " + str1.equals(str2));
        System.out.println("str1 equals str3 (case-sensitive): " + str1.equals(str3));

        System.out.println("str1 equals str3 (case-insensitive):" + str1.equalsIgnoreCase(str3));

        System.out.println("str2 contains 'eyy': " + str2.contains("eyy"));

        //Lexicographical Comparison
        System.out.println("str1 compared to str3: " + str1.compareTo(str3)); // 0 (equal)
        System.out.println("str1 compared to str2: " + str1.compareTo(str2)); // Returns a positive value (H > h)

        System.out.println("str1 starts with 'He': " + str1.startsWith("He"));

    }
}