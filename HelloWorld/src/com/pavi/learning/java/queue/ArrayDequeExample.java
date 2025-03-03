package com.pavi.learning.java.queue;

import java.util.ArrayDeque;

public class ArrayDequeExample {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("A");
        deque.addLast("B");
        deque.addFirst("C");

        System.out.println("First Element:" + deque.peekFirst());
        System.out.println("Last Element:" + deque.peekLast());

        deque.removeFirst();
        deque.removeLast();

        System.out.println("Deque:" + deque);

        deque.push("X");
        System.out.println("Popped Element:" + deque.pop());
    }
}
