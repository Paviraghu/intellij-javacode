package com.pavi.learning.java.date;

import java.time.Duration;
import java.time.LocalTime;

public class DurationExample {

    public static void main(String[] args) {

        LocalTime startTime = LocalTime.of(12,0);
        LocalTime endTime = LocalTime.of(16,30);

        Duration duration = Duration.between(startTime,endTime);

        System.out.println("Duration:" + duration.toHours() + "hours and" + duration.toMinutes() % 60 + "minutes");
    }
}
