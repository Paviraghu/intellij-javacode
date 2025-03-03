package com.pavi.learning.java.queue;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

    public static void main(String[] args){

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();

        Thread producer = new Thread(() -> {
            for(int i = 1; i <=5; i++){
                queue.offer(i);
                System.out.println("Added:" + i);
            }
        });

        Thread consumer = new Thread(() -> {
            while (true) {
                Integer item = queue.poll();
                if(item != null){
                    System.out.println("Removed:" +item);
                }else{
                    break;
                }
            }
        });

        producer.start();

        try{
            producer.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        consumer.start();

    }
}
