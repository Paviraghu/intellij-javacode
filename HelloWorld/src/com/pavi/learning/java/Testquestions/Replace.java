package com.pavi.learning.java.Testquestion;

public class Replace {

    public static void main(String[] args){


        String word = "apple banana orange apple grape banana apple orange";

        String result = word.replace("apple","strawberry");

        System.out.println("Original String:" + " " + word);

        System.out.println("Replacement String:" + " " + result);
    }
}
