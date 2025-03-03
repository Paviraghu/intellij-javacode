package com.pavi.learning.java.relationship;

class Animal {
    void makesound() {
        System.out.println("Animal make sound.");
    }
}
    class Dog extends Animal {
        @Override
        void makesound() {
            System.out.println("Woof Woof");
        }
    }
        public class IsARelationship {
            public static void main(String[] args) {
                Dog dog = new Dog();
                dog.makesound();
            }
    }
