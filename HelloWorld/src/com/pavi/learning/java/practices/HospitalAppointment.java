package com.pavi.learning.java.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

class Appointment {

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

public class HospitalAppointment {

    private PriorityQueue<Appointment> appointments;

    public HospitalAppointment() {

        appointments = new PriorityQueue<>((a1, a2) -> {

            int priority1 = getPriority(a1.checkupType);
            int priority2 = getPriority(a2.checkupType);
            return Integer.compare(priority1, priority2);
        });
    }

    private int getPriority(String checkupType) {

        return switch (checkupType) {

            case "p1" -> 1;
            case "p2" -> 2;
            case "p3" -> 3;
            default -> 4;
        };
    }

    public void addAppointment(String userName, String checkupType) {

        if (!checkupType.matches("p[123]")) {
            System.out.println("Invalid checkup.use p1,p2 or p3");
            return;
        }

        appointments.add(new Appointment(userName, checkupType));
        System.out.println("Appointment added successfully.");
    }


    public void viewAppointment() {

        if (appointments.isEmpty()) {
            System.out.println("No appointment review");
        } else {
            System.out.println("Appointment priority order.");
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }

    public void updateAppointment(String userName, String checkupType) {

        List<Appointment> tempList = new ArrayList<>();
        boolean updated = false;

        while (!appointments.isEmpty()) {
            Appointment current = appointments.poll();
            if (current.userName.equals(userName)) {
                updated = true;
                tempList.add(new Appointment(userName, checkupType));
            } else {
                appointments.add(current);
            }
        }

        appointments.addAll(tempList);

        if (updated) {
            System.out.println("Appointment added successfully.");
        } else {
            System.out.println("No appointment found for user:" + userName);
        }
    }

    public static void main(String[] args) {

        HospitalAppointment system = new HospitalAppointment();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Hospital Management System");
            System.out.println("1.Add Appointment");
            System.out.println("2.View Appointment");
            System.out.println("3.Update Appointment");
            System.out.println("4.Exit");
            System.out.println("Enter a choice:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.println("Enter a userName");
                    String name = scanner.nextLine();
                    System.out.println("Enter a checkupType(p1-Emergency,p2-UnWell,p3-General):");
                    String checkup = scanner.nextLine();
                    system.addAppointment(name, checkup);
                }

                case 2 -> system.viewAppointment();

                case 3 -> {
                    System.out.println("Enter a name to update.");
                    String name = scanner.nextLine();
                    System.out.println("Enter a checkupType(p1-Emergency,p2-UnWell,p3-General):");
                    String checkup = scanner.nextLine();
                    system.updateAppointment(name, checkup);
                }

                case 4 -> {
                    System.out.println("Exiting system.Goodbye!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice.please try again.");
            }
        }
    }
}

