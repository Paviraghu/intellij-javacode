package com.pavi.learning.java.practices;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BankTransact {

    private String transactionId;
    private String accountId;
    private double transactionAmount;
    private LocalDateTime transactionDateTime;
    private String transactionType;
    private String location;
    private String deviceID;
    private String ipAddress;
    private String merchantId;
    private String channel;
    private int customerAge;
    private String customerOccupation;
    private double transactionDuration;
    private int loginAttempts;
    private double accountBalance;
    private LocalDateTime previousTransactionDate;

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public LocalDateTime getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(LocalDateTime transactionDateTime) {
        this.transactionDateTime = transactionDateTime;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDeviceID() {
        return deviceID;
    }

    public void setDeviceID(String deviceID) {
        this.deviceID = deviceID;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(String merchantId) {
        this.merchantId = merchantId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int customerAge) {
        this.customerAge = customerAge;
    }

    public String getCustomerOccupation() {
        return customerOccupation;
    }

    public void setCustomerOccupation(String customerOccupation) {
        this.customerOccupation = customerOccupation;
    }

    public double getTransactionDuration() {
        return transactionDuration;
    }

    public void setTransactionDuration(double transactionDuration) {
        this.transactionDuration = transactionDuration;
    }

    public int getLoginAttempts() {
        return loginAttempts;
    }

    public void setLoginAttempts(int loginAttempts) {
        this.loginAttempts = loginAttempts;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public LocalDateTime getPreviousTransactionDate() {
        return previousTransactionDate;
    }

    public void setPreviousTransactionDate(LocalDateTime previousTransactionDate) {
        this.previousTransactionDate = previousTransactionDate;
    }

    @Override
    public String toString() {
        return "BankTransact{" +
                "transactionId='" + transactionId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", transactionDateTime=" + transactionDateTime +
                ", transactionType='" + transactionType + '\'' +
                ", location='" + location + '\'' +
                ", deviceID='" + deviceID + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", merchantId='" + merchantId + '\'' +
                ", channel='" + channel + '\'' +
                ", customerAge=" + customerAge +
                ", customerOccupation='" + customerOccupation + '\'' +
                ", transactionDuration=" + transactionDuration +
                ", loginAttempts=" + loginAttempts +
                ", accountBalance=" + accountBalance +
                ", previousTransactionDate=" + previousTransactionDate +
                '}';
    }
}
