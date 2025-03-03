package com.pavi.learning.java;

public class Enum {

    enum Day {
        MONDAY {
            @Override
            public String getmessage() {
                return "Start of the work week!";
            }
        },
        TUESDAY {
            @Override
            public String getmessage() {
                return "Second day of the work week.";
            }
        },
        WEDNESDAY {
            @Override
            public String getmessage() {
                return "Mid week hang in there!";
            }
        },
        THURSDAY {
            @Override
            public String getmessage() {
                return "Almost Friday!";
            }
        },
        FRIDAY {
            @Override
            public String getmessage() {
                return "End of the work week!";
            }
        },
        SATURDAY {
            @Override
            public String getmessage() {
                return "Weekend ,time to relax!";
            }
        },
        SUNDAY {
            @Override
            public String getmessage() {
                return "Rest and recharge for the new week!";
            }
        };

        public abstract String getmessage();
    }
        public static void main(String[] args){
            for(Day day:Day.values()){
                System.out.println(day +":"+day.getmessage());
            }
        }
    }

