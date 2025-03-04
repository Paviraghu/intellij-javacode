package com.pavi.learning.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{

    private final int taskId;

    public Task(int taskId) {
        this.taskId = taskId;
    }

    @Override
    public void run() {

        System.out.println("Task" + taskId + " is running on thread" + Thread.currentThread().getName());

        try{
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task" + taskId + "is completed on thread" + Thread.currentThread().getName());
    }
}

public class ThreadPoolExecutorExample {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i=1; i<=4; i++){
            executor.submit(new Task(i));
        }

        executor.shutdown();

        System.out.println("All tasks are submitted");
    }
}
