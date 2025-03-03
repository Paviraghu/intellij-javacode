package com.pavi.learning.java.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class HashMapScanner {


    public static void main(String[] args) {

        HashMap<String, ArrayList> manager = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a manager name:");

        String managers = scanner.next();

        switch (managers) {
            case "managerA": {

                ArrayList<Employee> managerA = new ArrayList<>();

                managerA.add(new Employee("A10", "Pavi", "Female", "Java Developer"));
                managerA.add(new Employee("A11", "Dhivya", "Female", "Java Developer"));
                managerA.add(new Employee("A12", "Raja", "MAle", "Java Developer"));
                managerA.add(new Employee("A13", "Ravi", "Male", "Java Developer"));

                manager.put("ManagerA", managerA);
                break;
            }

            case "managerB": {

                ArrayList<Employee> managerB = new ArrayList<>();

                managerB.add(new Employee("B20", "Priya", "Female", "Python Developer"));
                managerB.add(new Employee("B21", "Swee", "Female", "Python Developer"));
                managerB.add(new Employee("B22", "Narm", "Female", "Python Developer"));
                managerB.add(new Employee("B23", "Jan", "Female", "Python Developer"));

                manager.put("ManagerB", managerB);
                break;
            }

            case "managerC": {

                ArrayList<Employee> managerC = new ArrayList<>();

                managerC.add(new Employee("C30", "Surya", "Male", "Data Analytics"));
                managerC.add(new Employee("C31", "Sindhu", "female", "Data Analytics"));
                managerC.add(new Employee("C32", "Ram", "Male", "Data Analytics"));
                managerC.add(new Employee("C33", "Vaishu", "Female", "Data Analytics"));

                manager.put("ManagerC", managerC);
                break;
            }

            case "managerD": {

                ArrayList<Employee> managerD = new ArrayList<>();

                managerD.add(new Employee("D40", "Sandy", "Male", "Accounting"));
                managerD.add(new Employee("D41", "Kavin", "Male", "Accounting"));
                managerD.add(new Employee("D42", "Siva", "Male", "Accounting"));
                managerD.add(new Employee("D43", "Jeeva", "Male", "Accounting"));

                manager.put("ManagerD", managerD);
                break;
            }
            case "managerE": {

                ArrayList<Employee> managerE = new ArrayList<>();

                managerE.add(new Employee("E50", "Preetha", "Female", "Data Enginer"));
                managerE.add(new Employee("E51", "Geetha", "Female", "Data Enginer"));
                managerE.add(new Employee("E52", "Subhi", "Female", "Data Enginer"));
                managerE.add(new Employee("E53", "Kavi", "Male", "Data Enginer"));

                manager.put("ManagerE", managerE);
                break;
            }
        }
            ArrayList<Employee> list = manager.get("ManagerC");
            for (Employee set : list) {
                System.out.println(" Employee ID: " + set.getId() + " Employee Name: " + set.getName() + " Employee Gender: " + set.getGender() + " Employee Type: " + set.getType());

            }
        }
    }
