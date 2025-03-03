package com.pavi.learning.java.jdbc;

public class HealthCare {

    private String name;
    private int age;
    private String gender;
    private String bloodType;
    private String medicalCondition;
    private String dateOfAdmission;
    private String doctor;
    private String hospital;
    private String insuranceProvider;
    private float billingAmount;
    private int roomNumber;
    private String admissionType;
    private String dischargeDate;
    private String medication;
    private String testResults;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public float getBillingAmount() {
        return billingAmount;
    }

    public void setBillingAmount(float billingAmount) {
        this.billingAmount = billingAmount;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    public String getMedication() {
        return medication;
    }

    public void setMedication(String medication) {
        this.medication = medication;
    }

    public String getTestResults() {
        return testResults;
    }

    public void setTestResults(String testResults) {
        this.testResults = testResults;
    }

    @Override
    public String toString() {
        return "HealthCare{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", bloodType='" + bloodType + '\'' +
                ", medicalCondition='" + medicalCondition + '\'' +
                ", dateOfAdmission='" + dateOfAdmission + '\'' +
                ", doctor='" + doctor + '\'' +
                ", hospital='" + hospital + '\'' +
                ", insuranceProvider='" + insuranceProvider + '\'' +
                ", billingAmount=" + billingAmount +
                ", roomNumber=" + roomNumber +
                ", admissionType='" + admissionType + '\'' +
                ", dischargeDate='" + dischargeDate + '\'' +
                ", medication='" + medication + '\'' +
                ", testResults='" + testResults + '\'' +
                '}';
    }
}
