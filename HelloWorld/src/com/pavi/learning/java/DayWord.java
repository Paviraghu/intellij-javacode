package com.pavi.learning.java.Testquestion;

import java.util.Scanner;

public class DayWord {

    enum Day {
        MONADAY, TUESDAY, WEDNESDAY, THURSADAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  a number:");
        int number = scanner.nextInt();

        if(number >=1 && number <=7){
            Day day = Day.values()[number-1];
            System.out.println("The day is:" +day);
        }else {
            System.out.println("Invalid Input");
        }
    }
}