package com.pavi.learning.java.database;

public class MotorInsuranceData {

    private int sex;
    private String insr_Begin;
    private String insr_End;
    private String effective_Yr;
    private int insr_Type;
    private double insured_Value;
    private double premium;
    private long object_Id;
    private int prod_Year;
    private int seats_Num;
    private double carrying_Capacity;
    private String type_Vehicle;
    private double ccm_Ton;
    private String make;
    private String useage;
    private String claim_Paid;

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public String getInsr_Begin() {
        return insr_Begin;
    }

    public void setInsr_Begin(String insr_Begin) {
        this.insr_Begin = insr_Begin;
    }

    public String getInsr_End() {
        return insr_End;
    }

    public void setInsr_End(String insr_End) {
        this.insr_End = insr_End;
    }

    public String getEffective_Yr() {
        return effective_Yr;
    }

    public void setEffective_Yr(String effective_Yr) {
        this.effective_Yr = effective_Yr;
    }

    public int getInsr_Type() {
        return insr_Type;
    }

    public void setInsr_Type(int insr_Type) {
        this.insr_Type = insr_Type;
    }

    public double getInsured_Value() {
        return insured_Value;
    }

    public void setInsured_Value(double insured_Value) {
        this.insured_Value = insured_Value;
    }

    public double getPremium() {
        return premium;
    }

    public void setPremium(double premium) {
        this.premium = premium;
    }

    public long getObject_Id() {
        return object_Id;
    }

    public void setObject_Id(long object_Id) {
        this.object_Id = object_Id;
    }

    public int getProd_Year() {
        return prod_Year;
    }

    public void setProd_Year(int prod_Year) {
        this.prod_Year = prod_Year;
    }

    public int getSeats_Num() {
        return seats_Num;
    }

    public void setSeats_Num(int seats_Num) {
        this.seats_Num = seats_Num;
    }

    public double getCarrying_Capacity() {
        return carrying_Capacity;
    }

    public void setCarrying_Capacity(double carrying_Capacity) {
        this.carrying_Capacity = carrying_Capacity;
    }

    public String getType_Vehicle() {
        return type_Vehicle;
    }

    public void setType_Vehicle(String type_Vehicle) {
        this.type_Vehicle = type_Vehicle;
    }

    public double getCcm_Ton() {
        return ccm_Ton;
    }

    public void setCcm_Ton(double ccm_Ton) {
        this.ccm_Ton = ccm_Ton;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getUsage() {
        return useage;
    }

    public void setUsage(String usage) {
        this.useage = usage;
    }

    public String getClaim_Paid() {
        return claim_Paid;
    }

    public void setClaim_Paid(String claim_Paid) {
        this.claim_Paid = claim_Paid;
    }

    @Override
    public String toString() {
        return "MotorInsuranceData{" +
                "sex=" + sex +
                ", insr_Begin='" + insr_Begin + '\'' +
                ", insr_End='" + insr_End + '\'' +
                ", effective_Yr='" + effective_Yr + '\'' +
                ", insr_Type=" + insr_Type +
                ", insured_Value=" + insured_Value +
                ", premium=" + premium +
                ", object_Id=" + object_Id +
                ", prod_Year=" + prod_Year +
                ", seats_Num=" + seats_Num +
                ", carrying_Capacity=" + carrying_Capacity +
                ", type_Vehicle='" + type_Vehicle + '\'' +
                ", ccm_Ton=" + ccm_Ton +
                ", make='" + make + '\'' +
                ", usage='" + useage + '\'' +
                ", claim_Paid='" + claim_Paid + '\'' +
                '}';
    }
}