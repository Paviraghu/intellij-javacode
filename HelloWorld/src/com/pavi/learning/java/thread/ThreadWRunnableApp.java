package com.pavi.learning.java.thread;

class MyRunnable implements Runnable{

    public void run() {
        System.out.println("Thread is running.....");
    }
}
public class ThreadWRunnableApp {

    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());
        thread.start();

    }
}
