package com.pavi.learning.java.outer;

public class MemInOuter {

    private String message = "Hello from outer";

    class Inner {
        void display() {
            System.out.println(message);
        }
    }
        public static void main(String[] args){
            MemInOuter outer = new MemInOuter();
            MemInOuter.Inner inner = outer.new Inner();
            inner.display();
        }
}
