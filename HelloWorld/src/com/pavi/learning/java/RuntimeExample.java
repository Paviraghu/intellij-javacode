package com.pavi.learning.java;

import java.io.IOException;

public class RuntimeExample {

    public static void main(String[] args) throws IOException {

        Runtime runtime = Runtime.getRuntime();

        System.out.println("Available proceesors:" + runtime.availableProcessors());

        System.out.println("Free memory:" + runtime.freeMemory() + "bytes");

        System.out.println("Total memory:" + runtime.totalMemory() + "bytes");

        System.out.println("Max memory:" + runtime.maxMemory() + "bytes");

        runtime.exec("notepad");

        System.out.println("Free memory befor GC: " + runtime.freeMemory());
        runtime.gc();
        System.out.println("Free memory after GC: " + runtime.freeMemory()
        );
    }
}