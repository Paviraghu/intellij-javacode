package com.pavi.learning.java.queue;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args){

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        System.out.println("Priority Queue:" + pq);

        System.out.println("Peek:" + pq.peek());

        while(!pq.isEmpty()){
            System.out.println("Poll:" + pq.poll());
        }
    }
}
