package com.pavi.learning.java.userinput;

import java.io.Console;

public class ConsoleExample {

    public static void main(String[] args) {

        Console console = System.console();

        if (console != null){

            String username = console.readLine("Enter your username:");
            char[] password = console.readPassword("Enter your password:");

            System.out.println("Username:" + username);
            System.out.println("Password:" + String.valueOf(password));

        }else{
            System.out.println("Console is not available");
        }
    }
}
