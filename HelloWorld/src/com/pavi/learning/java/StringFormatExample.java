package com.pavi.learning.java.stringformat;

import javax.xml.transform.sax.SAXResult;
import java.text.MessageFormat;

public class StringFormatExample {

    public static void main(String[] args) {

        int age = 23;
        String name = "Pavi";

        String formattedString = String.format("My name is %s and I am %d years old:", name, age);
        System.out.println(formattedString);

        double salary = 1234.5678d;
        System.out.printf("Salary: %.2f%n", salary);

        System.out.printf("Name: %-10s Age: %-5d%n", name, age);

        String pattern = "Hello{0}, you have {1} new message.";
        String formattedMessage = MessageFormat.format(pattern, "Pavi", 5);
        System.out.println(formattedMessage);

        StringBuilder builder = new StringBuilder();
        builder.append("Name").append(":Pavi").append(",Age").append(23);
        System.out.println(builder.toString());

        System.out.println("This is a \"quoted\" string with a newline:\nNextLine");
        System.out.println("Tab \t Separated \t Line");

    }
}
