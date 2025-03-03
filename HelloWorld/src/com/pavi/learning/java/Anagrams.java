package com.pavi.learning.java;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        String a = "god";
        String b = "xoz";

        int[]count = new int[256];

        for (char x:a.toCharArray()){
            System.out.println(x + " -- " + (int) x);
            count[x]++;
            System.out.println(Arrays.toString(count));

        }

        for (char x:b.toCharArray()){

            count[x]--;
            System.out.println(x + " -- " + (int) x);
            System.out.println(Arrays.toString(count));
            if (count[x] < 0){
                System.out.println("not an anagram");
                return;

            }
        }
        System.out.println("anagram");
    }
}