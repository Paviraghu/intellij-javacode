package com.pavi.learning.java.roadtestfile;

public class RoadAccident {

    private String country;
    private int year;
    private String month;
    private String dayOfWeek;
    private String timeOfDay;
    private String urbanRural;
    private String roadType;
    private String weatherConditions;
    private double visibilityLevel;
    private int numberOfVehiclesInvolved;
    private int speedLimit;
    private String driverAgeGroup;
    private String driverGender;
    private double driverAlcoholLevel;
    private int driverFatigue;
    private String vehicleCondition;
    private int pedestriansInvolved;
    private int cyclistsInvolved;
    private String accidentSeverity;
    private int numberOfInjuries;
    private int numberOfFatalities;
    private double emergencyResponseTime;
    private double trafficVolume;
    private String roadCondition;
    private String accidentCause;
    private int insuranceClaims;
    private double medicalCost;
    private double economicLoss;
    private String region;
    private double populationDensity;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(String timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getUrbanRural() {
        return urbanRural;
    }

    public void setUrbanRural(String urbanRural) {
        this.urbanRural = urbanRural;
    }

    public String getRoadType() {
        return roadType;
    }

    public void setRoadType(String roadType) {
        this.roadType = roadType;
    }

    public String getWeatherConditions() {
        return weatherConditions;
    }

    public void setWeatherConditions(String weatherConditions) {
        this.weatherConditions = weatherConditions;
    }

    public double getVisibilityLevel() {
        return visibilityLevel;
    }

    public void setVisibilityLevel(double visibilityLevel) {
        this.visibilityLevel = visibilityLevel;
    }

    public int getNumberOfVehiclesInvolved() {
        return numberOfVehiclesInvolved;
    }

    public void setNumberOfVehiclesInvolved(int numberOfVehiclesInvolved) {
        this.numberOfVehiclesInvolved = numberOfVehiclesInvolved;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public String getDriverAgeGroup() {
        return driverAgeGroup;
    }

    public void setDriverAgeGroup(String driverAgeGroup) {
        this.driverAgeGroup = driverAgeGroup;
    }

    public String getDriverGender() {
        return driverGender;
    }

    public void setDriverGender(String driverGender) {
        this.driverGender = driverGender;
    }

    public double getDriverAlcoholLevel() {
        return driverAlcoholLevel;
    }

    public void setDriverAlcoholLevel(double driverAlcoholLevel) {
        this.driverAlcoholLevel = driverAlcoholLevel;
    }

    public int getDriverFatigue() {
        return driverFatigue;
    }

    public void setDriverFatigue(int driverFatigue) {
        this.driverFatigue = driverFatigue;
    }

    public String getVehicleCondition() {
        return vehicleCondition;
    }

    public void setVehicleCondition(String vehicleCondition) {
        this.vehicleCondition = vehicleCondition;
    }

    public int getPedestriansInvolved() {
        return pedestriansInvolved;
    }

    public void setPedestriansInvolved(int pedestriansInvolved) {
        this.pedestriansInvolved = pedestriansInvolved;
    }

    public int getCyclistsInvolved() {
        return cyclistsInvolved;
    }

    public void setCyclistsInvolved(int cyclistsInvolved) {
        this.cyclistsInvolved = cyclistsInvolved;
    }

    public String getAccidentSeverity() {
        return accidentSeverity;
    }

    public void setAccidentSeverity(String accidentSeverity) {
        this.accidentSeverity = accidentSeverity;
    }

    public int getNumberOfInjuries() {
        return numberOfInjuries;
    }

    public void setNumberOfInjuries(int numberOfInjuries) {
        this.numberOfInjuries = numberOfInjuries;
    }

    public int getNumberOfFatalities() {
        return numberOfFatalities;
    }

    public void setNumberOfFatalities(int numberOfFatalities) {
        this.numberOfFatalities = numberOfFatalities;
    }

    public double getEmergencyResponseTime() {
        return emergencyResponseTime;
    }

    public void setEmergencyResponseTime(double emergencyResponseTime) {
        this.emergencyResponseTime = emergencyResponseTime;
    }

    public double getTrafficVolume() {
        return trafficVolume;
    }

    public void setTrafficVolume(double trafficVolume) {
        this.trafficVolume = trafficVolume;
    }

    public String getRoadCondition() {
        return roadCondition;
    }

    public void setRoadCondition(String roadCondition) {
        this.roadCondition = roadCondition;
    }

    public String getAccidentCause() {
        return accidentCause;
    }

    public void setAccidentCause(String accidentCause) {
        this.accidentCause = accidentCause;
    }

    public int getInsuranceClaims() {
        return insuranceClaims;
    }

    public void setInsuranceClaims(int insuranceClaims) {
        this.insuranceClaims = insuranceClaims;
    }

    public double getMedicalCost() {
        return medicalCost;
    }

    public void setMedicalCost(double medicalCost) {
        this.medicalCost = medicalCost;
    }

    public double getEconomicLoss() {
        return economicLoss;
    }

    public void setEconomicLoss(double economicLoss) {
        this.economicLoss = economicLoss;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public double getPopulationDensity() {
        return populationDensity;
    }

    public void setPopulationDensity(double populationDensity) {
        this.populationDensity = populationDensity;
    }

    @Override
    public String toString() {
        return "RoadAccident{" +
                "country='" + country + '\'' +
                ", year=" + year +
                ", month='" + month + '\'' +
                ", dayOfWeek='" + dayOfWeek + '\'' +
                ", timeOfDay='" + timeOfDay + '\'' +
                ", urbanRural='" + urbanRural + '\'' +
                ", roadType='" + roadType + '\'' +
                ", weatherConditions='" + weatherConditions + '\'' +
                ", visibilityLevel=" + visibilityLevel +
                ", numberOfVehiclesInvolved=" + numberOfVehiclesInvolved +
                ", speedLimit=" + speedLimit +
                ", driverAgeGroup='" + driverAgeGroup + '\'' +
                ", driverGender='" + driverGender + '\'' +
                ", driverAlcoholLevel=" + driverAlcoholLevel +
                ", driverFatigue=" + driverFatigue +
                ", vehicleCondition='" + vehicleCondition + '\'' +
                ", pedestriansInvolved=" + pedestriansInvolved +
                ", cyclistsInvolved=" + cyclistsInvolved +
                ", accidentSeverity='" + accidentSeverity + '\'' +
                ", numberOfInjuries=" + numberOfInjuries +
                ", numberOfFatalities=" + numberOfFatalities +
                ", emergencyResponseTime=" + emergencyResponseTime +
                ", trafficVolume=" + trafficVolume +
                ", roadCondition='" + roadCondition + '\'' +
                ", accidentCause='" + accidentCause + '\'' +
                ", insuranceClaims=" + insuranceClaims +
                ", medicalCost=" + medicalCost +
                ", economicLoss=" + economicLoss +
                ", region='" + region + '\'' +
                ", populationDensity=" + populationDensity +
                '}';
    }
}
