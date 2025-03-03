package com.pavi.learning.java.string;

public class StringMemStore {

    public static void main(String[] args) {

        String s1 = "TAT";
        String s2 = "TAT";


        String s3 = new String("TAT");
        String s4 = new String("TAT");


        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);

        System.out.println(s3.equals(s4));

    }
}
