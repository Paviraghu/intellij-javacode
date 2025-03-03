package com.pavi.learning.java.outer;

public class StaticOuter {

    static String staticMessage = "Hello from Static Nested Class";

    static class Nested {
        void display() {
            System.out.println(staticMessage);
        }
    }

    public static void main(String[] args) {
        StaticOuter.Nested nested = new StaticOuter.Nested();
        nested.display();
    }
}
