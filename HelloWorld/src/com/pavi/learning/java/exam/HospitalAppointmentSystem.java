package com.pavi.learning.java.exam;


import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HospitalAppointmentSystem {

    private PriorityQueue<Appointment> appointments;

    public HospitalAppointmentSystem() {

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
            System.out.println("Invalid checkupType.USe p1,p2 or p3");
            return;
        }
        appointments.add(new Appointment(userName, checkupType));
        System.out.println("Appointment added successfully.");
    }

    public void reviewAppointment() {

        if (appointments.isEmpty()) {
            System.out.println("No appointments to review.");
        } else {
            System.out.println("Appointments in priority order:");
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
                tempList.add(current);
            }
        }

        appointments.addAll(tempList);

        if (updated) {
            System.out.println("Appointment updated successfully");
        } else {
            System.out.println("No appointment found for user:" + userName);
        }
    }

    public static void main(String[] args) {

        HospitalAppointmentSystem system = new HospitalAppointmentSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Hospital Management System");
            System.out.println("1.Add Appointment");
            System.out.println("2.Review Appointment");
            System.out.println("3.Update Appointment");
            System.out.println("4.Exit");
            System.out.println("choose an option:");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1 -> {
                    System.out.println("Enter you UserName:");
                    String name = scanner.nextLine();
                    System.out.println("Enter CheckUpType(p1-Emergency,p2-Unwell,p3-General):");
                    String checkupType = scanner.nextLine();
                    system.addAppointment(name, checkupType);
                }

                case 2 -> system.reviewAppointment();

                case 3 -> {
                    System.out.println("Enter your name to updated:");
                    String name = scanner.nextLine();
                    System.out.println("Enter New CheckUpType(p1-Emergency,p2-Unwell,p3-General):");
                    String newType = scanner.nextLine();
                    system.updateAppointment(name, newType);
                }

                case 4 -> {
                    System.out.println("Exiting System.Goodbye!");
                    scanner.close();
                    return;
                }

                default -> System.out.println("Invalid choice.Please try again.");
            }
        }
    }
}

