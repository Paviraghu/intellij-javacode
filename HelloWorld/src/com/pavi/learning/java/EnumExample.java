package com.pavi.learning.java;

public class EnumExample {

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }
    public static void main(String[] args){

        Day today = Day.FRIDAY;

        System.out.println("Today is:" + today);

        switch(today){
            case MONDAY:
                System.out.println("Start of the work week.");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SUNDAY:
                System.out.println("Rest day.");
                break;
            default:
                System.out.println("Midweek days.");
                break;
        }

        System.out.println("All days:");

        for(Day day: Day.values()){
            System.out.println(day+":"+ day.ordinal());
        }
    }
}
