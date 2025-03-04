package com.pavi.learning.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Tasks implements Runnable{

    private final int taskId;

    Tasks(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {
        System.out.println("Task" + taskId + "is running by" + Thread1.currentThread().getName());

        try{
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Task" + taskId + "interrupted");
        }
        System.out.println("Task" + taskId + "is completed by" + Thread.currentThread().getName());
    }
}

public class CachedThreadExample {

    public static void main(String[] args) {

        ExecutorService cachedThread = Executors.newCachedThreadPool();

        for (int i=1; i<=10 ;i++){
            cachedThread.submit(new Tasks(i));
        }

        cachedThread.shutdown();
    }
}
