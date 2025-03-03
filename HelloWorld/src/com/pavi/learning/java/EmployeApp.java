package com.pavi.learning.java.testbankaccount;

import java.util.HashMap;
import java.util.Scanner;


public class EmployeApp {

    public static void main(String[] args) throws Exception {

        int initialBalance = 500000;

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, Employee> detail = new HashMap<>();

        detail.put(1, new Employee(11, "dhivya", "Manager", 24, 55000, 9876543210L));
        detail.put(2, new Employee(12, "ramya", "Manager", 26, 55000, 8765432109L));
        detail.put(3, new Employee(13, "priya", "Manager", 28, 50000, 9876543210L));
        detail.put(4, new Employee(14, "sowmi", "Manager", 30, 50000, 8765432109L));
        detail.put(5, new Employee(15, "pavi", "Manager", 22, 50000, 9876543210L));
        detail.put(6, new Employee(16, "bharu", "Manager", 20, 50000, 8765432109L));
        detail.put(7, new Employee(17, "swee", "Manager", 22, 45000, 9876543210L));
        detail.put(8, new Employee(18, "sri", "Manager", 24, 45000, 8765432109L));
        detail.put(9, new Employee(19, "jan", "Manager", 26, 45000, 9876543210L));
        detail.put(10, new Employee(20, "sandy", "Manager", 28, 45000, 8765432109L));
        detail.put(11, new Employee(21, "dharsh", "Manager", 27, 45000, 9876543210L));
        detail.put(12, new Employee(22, "kavin", "Manager", 23, 45000, 8765432109L));
        detail.put(13, new Employee(23, "Rithi", "Manager", 21, 25000, 9876543210L));
        detail.put(14, new Employee(24, "Rithu", "Manager", 20, 25000, 8765432109L));
        detail.put(15, new Employee(25, "kiru", "Manager", 27, 25000, 9876543210L));
        detail.put(16, new Employee(26, "narmath", "Manager", 28, 25000, 8765432109L));
        detail.put(17, new Employee(27, "vigi", "Manager", 29, 25000, 9876543210L));
        detail.put(18, new Employee(28, "Dhivi", "Manager", 24, 18000, 8765432109L));
        detail.put(19, new Employee(29, "malini", "Manager", 34, 18000, 9876543210L));
        detail.put(20, new Employee(30, "paru", "Manager", 35, 18000, 8765432109L));


        for (int empId : detail.keySet()) {

            Employee employee = detail.get(empId);

            if (initialBalance >= employee.getSalary()) {

                initialBalance = (int) (initialBalance - employee.getSalary());

                System.out.println(employee.getId() + "," + initialBalance +"," + employee.getName() + "," + employee.getSalary());

            } else {
                try {
                    throw new Exception("Insufficient Balance");
                } catch (Exception e) {
                    System.out.println("AmountNonSufficientException");

                    System.out.println("Insufficient amount add an amount ");
                    int amount = sc.nextInt();
                    initialBalance = amount + initialBalance;
                    System.out.println(initialBalance);
                }
            }
        }
        System.out.println("Remaining Balance Amount : " + initialBalance);
    }

}