package com.pavi.learning.java.setexample;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args){

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);

        System.out.println("Numbers (in insertion order):" + numbers);


        numbers.add(40);
        System.out.println("After Adding 40:" + numbers);

        System.out.println("Iteration over set:");
        Iterator<Integer> i = numbers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
