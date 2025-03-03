package com.pavi.learning.java.finalexample;

public class FinalReferenceExample {
    public static void main(String[] args){
        final StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);

        //sb = new StringBuilder("New Object");

    }
}
