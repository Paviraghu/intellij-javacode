package com.pavi.learning.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current DateTime:" + currentDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2024,1,15,10,30);
        System.out.println("SpecificDateTime:" + specificDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy H:h:mm");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("FormattedDateTime:" + formattedDateTime);

        LocalDateTime futureDateTime = currentDateTime.plusDays(5).withMonth(5).plusHours(2);
        System.out.println("FutureDateTime:" + futureDateTime);

    }
}
