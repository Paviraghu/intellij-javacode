package com.pavi.learning.java.list;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args){

        LinkedList<String> names = new LinkedList<>();

        names.add("sowmi");
        names.add("kavi");
        names.add("ravi");

        System.out.println("names : " + names);
        
        names.addFirst("Alice");
        System.out.println("After adding first : " + names);

        names.removeLast();
        System.out.println("After removing last : " + names);
    }
}
