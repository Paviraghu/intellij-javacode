package com.pavi.learning.java.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {

    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();

        System.out.println("DateTime:" + now);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formattedDateTime = now.format(formatter);

        System.out.println("Formatted DateTime:" + formattedDateTime);

        String dateString = "15/01/2024 10:30:00";

        LocalDateTime parsedDateTime = LocalDateTime.parse(dateString,formatter);

        System.out.println("Parsed DateTime:" + parsedDateTime);

    }
}
