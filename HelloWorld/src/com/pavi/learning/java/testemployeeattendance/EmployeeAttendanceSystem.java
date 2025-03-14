package com.pavi.learning.java.testemployeeattendance;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.Scanner;

public class EmployeeAttendanceSystem {

    static HashMap<Integer, ArrayList<LocalDateTime>> hashMap = new HashMap<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        buildEmpHashMap();

        while (true) {

            System.out.println("Welcome to the Employee Attendance System");

            System.out.println("1.View Attendance");
            System.out.println("2.Mark Attendance");
            System.out.println("3.Exit And Save Report");

            System.out.print("Enter your Choice : ");

            String choice = sc.next();

            switch (choice) {
                case "1": {
                    viewAttendance();
                    break;
                }
                case "2": {
                    markAttendance();
                    break;
                }
                case "3": {
                    exitAndSaveReport();
                    return;
                }
                default: {
                    System.out.println("Enter the correct choice");
                }
            }
        }
    }

    public static void buildEmpHashMap() {
        hashMap.put(101, new ArrayList<>());
        hashMap.put(102, new ArrayList<>());
        hashMap.put(103, new ArrayList<>());
        hashMap.put(104, new ArrayList<>());
        hashMap.put(105, new ArrayList<>());
        hashMap.put(106, new ArrayList<>());
        hashMap.put(107, new ArrayList<>());
    }

    public static void viewAttendance() {

        System.out.print("Enter Employee ID to view attendance :");
        int id = sc.nextInt();
        System.out.println("Attendance Report for Emp ID :" + id);
        int attendCnt = 1;

        if (hashMap.get(id).size() > 0) {
            for (LocalDateTime ldt : hashMap.get(id)) {
                System.out.println("Attd [" + attendCnt + "] " + ldt.toString());

            }
        } else {
            System.out.println("No attendance report found ");
        }

    }

    public static void markAttendance() {

        System.out.println("Enter the ID :");
        int id = sc.nextInt();
        hashMap.get(id).add(LocalDateTime.now());
        System.out.println("Attendance for Emp " + id + " has been marked successfully.");
    }

    public static void exitAndSaveReport() {

        System.out.println("you choice Exit And SaveReport");
        try {
            FileWriter writer = new FileWriter("attendance.txt");
            for (Integer key : hashMap.keySet()) {
                writer.write("\nEmp ID : " + key);
                for (LocalDateTime ldt : hashMap.get(key)) {
                    writer.write(" \n" + ldt);
                }
            }
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
