package com.pavi.learning.java.finalexample;

public class FinalParameterExample {

        void display(final int num) {
            System.out.println("Value of num: " + num);
            // Uncommenting the next line will cause a compilation error
            // num = num + 1;
        }

        public static void main(String[] args) {
            FinalParameterExample example = new FinalParameterExample();
            example.display(100);
        }
    }

