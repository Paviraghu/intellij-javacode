package com.pavi.learning.java.datastructures;

import java.util.LinkedList;

public class LinearLinkedListDataStruct {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Numbers: " + numbers);

        numbers.addFirst(4);
        numbers.addLast(40);

        System.out.println("UpdatedNumbers: " + numbers);

        numbers.removeFirst();

        System.out.println("Final Numbers: " + numbers);
    }
}
