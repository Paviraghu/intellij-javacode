package com.pavi.learning.java.thread;

class ThreadExample extends Thread{

    public void run(){

        for (int i = 0 ; i<5 ; i++){
            System.out.println("Thread class:" + i);

            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class RunnableExample implements Runnable{

    public void run() {

        for (int i=0; i<5; i++){
            System.out.println("Runnable Interface:" +i);

            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadRunnableExample {

    public static void main(String[] args) {

        ThreadExample thread1 = new ThreadExample();
        Thread thread2 = new Thread(new RunnableExample());

        thread1.start();
        thread2.start();

    }
}

