package com.pavi.learning.java;

public class DogApp {

    public static void main(String[] args){

        Dog dog1 = new Dog();
        dog1.setBread("Puppy");
        dog1.setSize("small");
        dog1.setColor("white");
        dog1.setAge(2);

        Dog dog2 = new Dog();
        dog2.setBread("German shephered");
        dog2.setSize("large");
        dog2.setColor("white & orange");
        dog2.setAge(4);

        System.out.println("com.pavi.learning.java.Dog 1:" + dog1);

        System.out.println("com.pavi.learning.java.Dog 2:" + dog2);

    }
}
