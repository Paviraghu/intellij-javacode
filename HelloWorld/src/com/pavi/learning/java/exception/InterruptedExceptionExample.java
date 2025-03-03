package com.pavi.learning.java.exception;

public class InterruptedExceptionExample {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            try {
                System.out.println("Thread going to sleep for 5 sec");
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                System.out.println("InterruptedException caught: " + e.getMessage());
            }
        });

        thread.start();
        Thread.sleep(3000);
        thread.interrupt();
        System.out.println("Succesfully Interruped :)");

    }
}
