package com.pavi.learning.java.list;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args){

        Stack<String> books = new Stack<>();

        books.push("Java programming");
        books.push("Data Structures");
        books.push("Operating systems");

        System.out.println("Books : " + books);

        System.out.println("Top Book : " + books.peek());
        books.pop();
        System.out.println("After pop : " + books);

    }
}
