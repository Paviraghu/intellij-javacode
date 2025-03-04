package com.pavi.learning.java.thread;

class MyThreadOne extends Thread{

    public void run(){
        System.out.println("Thread is running...");
    }
}

public class ThreadEThreadApp {

    public static void main(String[] args) {

        MyThreadOne thread1 = new MyThreadOne();
        thread1.start();

    }
}
