package com.pavi.learning.java.oops.Encapsulation;

public class BankAccountApp {

    public static void main(String[] args){

        BankAccount account = new BankAccount("12345",1000.00);

        System.out.println("Account Number:" + account.getAccountNumber());
        System.out.println("Initial Balance:" + account.getBalance());

        account.deposit(500.00);
        System.out.println("Balance after deposite:" +account.getBalance());

        account.withdraw(300.00);
        System.out.println("Balance after withdraw:" + account.getBalance());
    }
}
