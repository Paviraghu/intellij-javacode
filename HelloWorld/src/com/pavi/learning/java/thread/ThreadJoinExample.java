package com.pavi.learning.java.thread;

class ThreadJoin extends Thread{

    public void run(){
        for (int j=0;j<2;j++){
            try{
                Thread.sleep(100);
                System.out.println("The current thread name is:" + ThreadJoin.currentThread().getName());
            } catch (Exception e) {
                System.out.println("The exception has been caught:" + e);
            }
            System.out.println(j);
        }
    }
}


public class ThreadJoinExample {

    public static void main(String[] args) {

        ThreadJoin thread1 = new ThreadJoin();
        ThreadJoin thread2 = new ThreadJoin();
        ThreadJoin thread3 = new ThreadJoin();

        thread1.start();

        try{
            System.out.println("The current thread name is:" + Thread.currentThread().getName());
            thread1.join();
        } catch (Exception e) {
            System.out.println("The exception has been caught:" + e);
        }

        thread2.start();

        try{
            System.out.println("The current thread name is:" +Thread.currentThread().getName());
            thread2.join();
        } catch (Exception e) {
            System.out.println("The exception has been caught:" + e);
        }

        thread3.start();
    }
}
