package com.pavi.learning.java;

import java.util.Hashtable;

public class HashExample {

        public static void main(String[] args) {

        Hashtable<Integer, String> hm = new Hashtable<>();
        hm.put(1, "jeeva");
        hm.put(2, "ranjith");

        hm.put(3, "manoj");
        hm.put(4, "nataraj");

        System.out.println(hm);
            System.out.println("forloop");
            for (int i = 0; i<= 5; i++) {
                if (hm.replace(1, "jeeva", "siva")) {
                    System.out.println(hm);
                }
            }
    }
}

