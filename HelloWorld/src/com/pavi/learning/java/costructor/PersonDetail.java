package com.pavi.learning.java.constructor;

public class PersonDetail {

    public static void main(String[] args) {

        Person person1 = new Person("sowmiya", 14, "female", "lightwhite", 150, 45);
        Person person2 = new Person("pavithra", 23, "female", "black", 180, 50);
        Person person3 = new Person("santhosh", 21, "male", "white", 170, 55);
        Person person4 = new Person("kavinesh", 14, "male", "white", 150, 50);

        person1.displayInfo();
        //person2.displayInfo();
        person3.displayInfo();
        //person4.displayInfo();

    }
}

