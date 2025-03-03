package com.pavi.learning.java.practices;

abstract  class Bird {

    abstract void eat();

    void makesound() {
        System.out.println("Bird make sounds");
    }
}
    class Peacock extends Bird{

        @Override
        void eat() {
            System.out.println("Peacock Eat");
        }

        public void setcolour() {

        }
    }

    class Parrot extends Bird{

        @Override
        void eat() {
            System.out.println("Parrot Eat");
        }
    }

    public class AbstractionApp{

        public static void main(String[] args){

            Peacock peacock = new Peacock();
            peacock.eat();
            peacock.makesound();

            Parrot parrot = new Parrot();
            parrot.makesound();
            parrot.eat();
        }
    }
