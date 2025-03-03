package com.pavi.learning.java.exception;

public class NullPointerExceptionExample {


    public static void main(String[] args) {

        try {

            String str = null;
            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        }

    }

}
