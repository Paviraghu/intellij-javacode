package com.pavi.learning.java.date;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {

    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2023,1,1);
        LocalDate endDate = LocalDate.of(2024,5,8);

        Period period = Period.between(startDate,endDate);

        System.out.println("Difference:" + period.getYears() + "Years" + period.getMonths() + "Month" + period.getDays() + "Days");
    }
}
