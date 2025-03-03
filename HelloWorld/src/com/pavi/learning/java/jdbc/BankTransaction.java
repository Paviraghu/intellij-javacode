package com.pavi.learning.java.jdbc;

public class BankTransaction {

    private String transactionId;
    private String accountId;
    private double transactionAmount;
    private String transactionDateTime;
    private String transactionType;
    private String location;
    private String deviceId;
    private String ipAddress;
    private String merchantId;
    private String channel;
    private int customerAge;
    private String customerOccupation;
    private double transactionDuration;
    private int loginAttempts;
    private double accountBalance;
    private String previousTransactionDate;

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

    public String getTransactionDateTime() {
        return transactionDateTime;
    }

    public void setTransactionDateTime(String transactionDateTime) {
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

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
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

    public String getPreviousTransactionDate() {
        return previousTransactionDate;
    }

    public void setPreviousTransactionDate(String previousTransactionDate) {
        this.previousTransactionDate = previousTransactionDate;
    }

    @Override
    public String toString() {
        return "BankTransaction{" +
                "transactionId='" + transactionId + '\'' +
                ", accountId='" + accountId + '\'' +
                ", transactionAmount=" + transactionAmount +
                ", transactionDateTime=" + transactionDateTime +
                ", transactionType='" + transactionType + '\'' +
                ", location='" + location + '\'' +
                ", deviceId='" + deviceId + '\'' +
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
