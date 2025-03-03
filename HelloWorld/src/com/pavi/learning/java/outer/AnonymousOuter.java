package com.pavi.learning.java.outer;

public class AnonymousOuter {

    interface Greeting {
        void sayHello();
    }
        public static void main(String[] args) {
            Greeting greeting = new Greeting() {
                @Override
                public void sayHello() {
                    System.out.println("Hello from Anonymous inner class");
                }
            };

            greeting.sayHello();
        }
    }

