package com.pavi.learning.java.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDateExample {

    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date:" + currentDate);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date Time:" + currentDateTime);

        DayOfWeek dayOfWeek = DayOfWeek.of(2);
        System.out.println("DayOfWeek:" + dayOfWeek);

        LocalDateTime currentDatetime = LocalDateTime.of(2024,12,4,12,35,5);
        System.out.println("CurrentDateTime:" + currentDatetime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted Date:" + formattedDate);

        String dateString = "15-01-2024";
        LocalDate parsedDate = LocalDate.parse(dateString, formatter);
        System.out.println("Parsed Date:" + parsedDate);

        LocalDate futureDate = currentDate.plusDays(10);
        System.out.println("FutureDate:" + futureDate);

        LocalDate pastDate = currentDate.minusDays(5);
        System.out.println("PastDate:" + pastDate);

    }
}