package com.pavi.learning.java.thread;

class ThreadExamples extends Thread{

    public void run(){
        System.out.println("Thread"+ Thread.currentThread().getId() + "is running");
    }
}
public class ThreadApplication {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++){
            new ThreadExamples().start();
        }
    }
}
