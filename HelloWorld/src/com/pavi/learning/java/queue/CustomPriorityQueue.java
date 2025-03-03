package com.pavi.learning.java.queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomPriorityQueue {

    public static void main(String[] args){

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        while (!pq.isEmpty()){
            System.out.println("Poll:" + pq.poll());
        }
    }
}
