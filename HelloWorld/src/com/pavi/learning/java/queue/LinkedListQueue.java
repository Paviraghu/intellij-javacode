package com.pavi.learning.java.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueue {

    public static void main(String[] args){

        Queue<String> queue = new LinkedList<>();

        queue.add("Alice");
        queue.add("John");
        queue.add("Charlie");

        System.out.println("Head of the peek:" +queue.peek());

        System.out.println("Removed:" + queue.poll());
        System.out.println("Removed:" + queue.poll());

        System.out.println("Remaining queue:" +queue);
    }
}
