package com.pavi.learning.java.thread;

public class MultiThreadMethods {

    public static void main(String[] args) {

        //create a new thread with a task
        Thread workerThread = new Thread(() -> {
            System.out.println("worker Thread Started");

            try{
                for (int i=1;i<=5;i++){
                    System.out.println("worker Thread executing step:" + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
            System.out.println("Thread Finished.");
        });

        //set thread properties
        workerThread.setName("Worker Thread");
        workerThread.setPriority(Thread.MAX_PRIORITY);

        //display thread properties before starting
        System.out.println("Thread Name:" + workerThread.getName());
        System.out.println("Thread Priority:" + workerThread.getPriority());

        //start the worker thread
        workerThread.start();

        //main thread actions
        Thread mainThread = Thread.currentThread();
        System.out.println("Main Thread is running");

        try{
            System.out.println("Sleeping for 2seconds..");
            Thread.sleep(2000);

            //Interrupted the work thread while sleeping
            System.out.println("Interrupting work thread");
            workerThread.interrupt();

            //wait for the worker thread to finish
            workerThread.join();
            System.out.println("worker thread has terminated.");

        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        //Display thread states
        System.out.println("Work thread state:" + workerThread.getState());
        System.out.println("main thread state:" + mainThread.getState());
    }
}
