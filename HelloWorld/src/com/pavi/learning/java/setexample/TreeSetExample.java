package com.pavi.learning.java.setexample;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args){

        TreeSet<String> names = new TreeSet<>();
        names.add("Pavi");
        names.add("Sri");
        names.add("Bharu");
        names.add("Dhivya");

        System.out.println("Names(sorted order:" +names);

        names.add("Swee");
        System.out.println("After adding:" + names);

        System.out.println("First element:" +names.first());
        System.out.println("Last element:" + names.last());

        System.out.println("Iterator over set:");
        Iterator<String> i = names.iterator();
        while (i.hasNext())
            System.out.println(i.next());

    }
}
