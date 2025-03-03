package com.pavi.learning.java.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {

    public static void main(String[] args) {

        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try{
                for(int i=1; i <= 10; i++){
                    System.out.println("Producing:" + i);
                    queue.put(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });


        Thread consumer = new Thread(() -> {
            try{
                while (true){
                    Integer item = queue.take();
                    System.out.println("Consuming:" + item);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });


        producer.start();
        consumer.start();

    }
}
