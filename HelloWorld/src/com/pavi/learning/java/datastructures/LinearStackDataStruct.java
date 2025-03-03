package com.pavi.learning.java.datastructures;

import java.util.Stack;

public class LinearStackDataStruct {

    public static void main(String[] args) {

        Stack<String> bookStack = new Stack<>();

        bookStack.push("Book 1");
        bookStack.push("Book 2");
        bookStack.push("Book 3");
        bookStack.push("Book 4");

        System.out.println("BookStack Size: " + bookStack.size());

        System.out.println("Top Book: " + bookStack.peek());

        String removedBook = bookStack.pop();

        System.out.println("Removed Book: " + removedBook);

        System.out.println("New Stack Size: " + bookStack.size());

        System.out.println("New Top Book: " + bookStack.peek());
    }
}
