package com.pavi.learning.java.testelectricitybill;

import java.util.Scanner;

public class ElectricityBillCalculation {

    private String customerName;
    private int accountNumber;
    int units;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Customer Name(First and last name):");
        String customerName = scanner.nextLine();

        System.out.println("EB Account Number:");
        String accountNumber = scanner.nextLine();


        System.out.println("Customername :" + customerName.length());
        int units = (int) (customerName.length() / 2.7 * 100);

        System.out.println("Units consumed : " + units);


        double price;
        if (accountNumber.endsWith("77")) {
            System.out.println("Account Type : Residential");

            price = 0.0;
            if (units <= 100) {
                price = units * 0;

            } else if (101 <= 200) {
                price = units * 4;

            } else if (units > 200) {
                price = units * 4.5;
            }
            System.out.println("Total bill amount: " + price);

            price = 0;
        } else if (accountNumber.endsWith("88")) {
            System.out.println("Commercial");

            price = units * 10;
            System.out.println("Total bill amount: " + price);

        } else {
            System.out.println("Invalid");
        }
    }
}


