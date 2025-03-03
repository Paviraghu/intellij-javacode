package com.pavi.learning.java.oops.Poly;

public class RunTimePoly {

        public static void main(String[] args) {

            Animals myAnimal = new Animals();
            myAnimal.sound();

            Animals myDog = new Dogs();
            Animals myCat = new Cats();

            myDog.sound();
            myCat.sound();

        }

    }

