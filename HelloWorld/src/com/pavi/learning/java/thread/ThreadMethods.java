package com.pavi.learning.java.thread;

public class ThreadMethods {

    public static void main(String[] args) {


        Thread1 th1 = new Thread1();
        th1.setName("Thread-1");
        th1.setPriority(Thread.MAX_PRIORITY);

        Thread2 th2 = new Thread2();
        th2.setName("Thread-2");
        th2.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Starting Threads..");

        th1.start();
        th2.start();

        try {

            System.out.println("Main thread working for workers to finish.");

            th1.join();
            th2.join();

        } catch (InterruptedException e) {
            System.out.println("Main Thread interrupted.");
        }
        System.out.println("All thread completed.Main thread terminating.");
    }
}
    class Thread1 extends Thread {

        public void run() {

            try {

                System.out.println(getName() + "Starting..");

                for (int i = 0; i < 5; i++) {

                    System.out.println(getName() + "Working Step" + i);
                    Thread.sleep(1000);
                }
                System.out.println(getName() + "Completed");

            } catch (InterruptedException e) {
                System.out.println(getName() + "interrupted");
            }
        }
    }

    class Thread2 extends Thread {

        public void run() {

            System.out.println(getName() + "Starting");

            for (int i = 0; i < 5; i++) {

                System.out.println(getName() + "Processing Step" + i);
            }

            System.out.println(getName() + "Completed");
        }
    }
