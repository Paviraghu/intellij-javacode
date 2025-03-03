package com.pavi.learning.java;

public class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    static class Dog extends Animal {
        @Override
        public void animalSound() {
            System.out.println("The dog says: bow wow");
        }
    }

    static class Cat extends Animal {
        @Override
        public void animalSound() {
            System.out.println("The cat says: meow");
        }
    }

    static class Buffalo extends Animal {
        @Override
        public void animalSound() {
            System.out.println("The buffalo says: mmahhh");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myCat = new Animal.Cat();
        Animal myDog = new Animal.Dog();
        Animal myBuffalo = new Animal.Buffalo();

        myAnimal.animalSound();
        myCat.animalSound();
        myDog.animalSound();
        myBuffalo.animalSound();
    }
}
