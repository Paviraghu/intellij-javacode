package com.pavi.learning.java.list;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args){

        Vector<Integer> numbers = new Vector();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers : " + numbers);

        numbers.add(1,15);
        System.out.println("After inserting:" + numbers);

        numbers.remove((Integer)20);
        System.out.println("After removal:" + numbers);


    }
}