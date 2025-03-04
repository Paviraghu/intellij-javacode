package com.pavi.learning.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Process implements Runnable{

    private final int id;
    private final String name;

    Process(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Processing ID"+ " " + id +" "+ "for customer"+" "+ name +" "+"by"+Thread.currentThread().getName());

        try{
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted for id" + id);
        }
        System.out.println("Completed Processing File"+ " " + id + " " + "for customer"+" "+ name +" "+"by"+Thread.currentThread().getName());
    }
}

public class SingleThreadExecutor {

    public static void main(String[] args) {

        ExecutorService singleThread = Executors.newSingleThreadExecutor();

        Process[] orders = {new Process(101,"Kiru")
                ,new Process(102,"Maya")
                ,new Process(103,"sowmi")
                ,new Process(104,"Thiru")};

        for (Process order : orders){
            singleThread.submit(order);
        }

        singleThread.shutdown();
    }
}
