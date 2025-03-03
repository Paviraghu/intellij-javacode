package com.pavi.learning.java.exception;

public class CallStackExample {

    public static void main(String[] args){

        try{
            methodB();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static void methodA() {
        methodB();
    }

    static void methodB() {
        methodC();
    }

    static void methodC() {
        throw new RuntimeException("Error in methodC");
    }
}
