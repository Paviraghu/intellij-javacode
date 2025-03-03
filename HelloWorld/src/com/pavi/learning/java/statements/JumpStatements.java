package com.pavi.learning.java.Statements;

public class JumpStatements {

    public static void main(String[] args) {

        System.out.println("Skipping number 4:");

        for (int i = 1; i <= 20; i++) {
            if (i == 4) continue;
            System.out.println(i + "");
        }

        System.out.println("breaking at number 15:");

        for (int i = 1; i <= 20; i++) {
            if (i == 15) break;
            System.out.println(i + "");
        }

        System.out.println("Returning a number 2:");

        for (int i = 1; i <= 20; i++) {
            if(i == 2) return;
            System.out.println(i + "");
        }
    }
}

