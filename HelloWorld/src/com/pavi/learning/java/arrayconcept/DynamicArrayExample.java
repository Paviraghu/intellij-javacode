package com.pavi.learning.java.arrayconcept;

import java.util.ArrayList;

public class DynamicArrayExample {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("sandy");
        list.add("pavi");

        System.out.println("First element:" + list.get(0));

        list.remove(0);

        System.out.println("\nremaining elements:");
        for (String name : list) {
            System.out.println(name);
        }
    }
}
