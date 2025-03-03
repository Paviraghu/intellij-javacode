package com.pavi.learning.java.outer;

public class LocalOuter {

    void outerMethod(){

        int number = 42;

        class LocalInner{
            void display(){
                System.out.println("local inner class:" + number);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.display();
    }

    public static void main(String[] args){

        LocalOuter outer = new LocalOuter();
        outer.outerMethod();
    }

}
