package com.pavi.learning.java.classobject;

import java.util.Objects;

class Person implements Cloneable {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public void getClassLocal() {
        String str = "Hello";
        System.out.println(str.getClass());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


public class ObjectClassExample {
    public static void main(String[] args) throws CloneNotSupportedException {

        Person person = new Person("Alice", 30);
        System.out.println("toString(): " + person);

        Person p1 = new Person("Alice", 30);
        Person p2 = new Person("Alice", 30);

        System.out.println("p1 == p2: " + (p1 == p2));
        System.out.println("p1.equals(p2): " + p1.equals(p2));

        System.out.println("p1.hashcode() == p2.hashcode(): " + (p1.hashCode() == p2.hashCode()));
        person.getClassLocal();

        System.out.println("person.clone().hashcode(): " + person.clone().hashCode());

    }
}
