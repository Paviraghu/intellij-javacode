package com.pavi.learning.java.exam;

public class Appointment {

    String userName;
    String checkupType;


    public Appointment(String userName, String checkupType) {
        this.userName = userName;
        this.checkupType = checkupType;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "userName='" + userName + '\'' +
                ", checkupType='" + checkupType + '\'' +
                '}';
    }
}
