package com.pavi.learning.java.testdatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeDateTime {

    public static void main(String[] args) {

        LocalDate dateOfBirth = DateOfBirth();

        DateTimeFormat ageCalculation = new DateTimeFormat();

        ageCalculation.setDob(dateOfBirth);

        Period age = ageCalculation.calculateAge();

        System.out.println("Your age is:" + age.getYears() + " years " + age.getMonths() + "months and" + age.getDays() + "days");
    }

    private static LocalDate DateOfBirth() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your date of birth:");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        return LocalDate.parse(scanner.nextLine(), formatter);
    }
}
