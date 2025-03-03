package com.pavi.learning.java.Statements;

public class ControlStatementsExample {

    public static void main(String[] args) {

        //if else
        int number=10;
        if(number>0){
            System.out.println(number+"is positive");
        }
        else{
            System.out.println(number+"is not positive");
        }

        //switch case
        char grade='B';
        switch (grade){
            case 'A':
                System.out.println("Excellent!");
            case 'B':
                System.out.println("Well Done!");
            case 'c':
                System.out.println("Keep Trying!");
        }

        //for loop
        for(int i=1;i<=5;i++){
            System.out.println(i+"");
        }
        System.out.println();

        //while
        System.out.println("countdown from 5:");
        int count = 5;
        while(count>0);
        System.out.println(count);

    }
}
