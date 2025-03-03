package com.pavi.learning.java.oops.Encapsulation;

public class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double Balance) {
        this.accountNumber = accountNumber;
        this.balance = Balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited:" + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdraw:" + amount);
        } else {
            System.out.println("Invalid WithDrawl amount!");
        }
    }
}

