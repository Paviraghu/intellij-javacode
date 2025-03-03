package com.pavi.learning.java.filetest;

public class UsedCar {

    private int id;
    private String name;
    private String location;
    private int year;
    private int kilometerDriven;
    private String fuelType;
    private String transmission;
    private String ownerType;
    private String mileage;
    private String engine;
    private String power;
    private int seats;
    private String newPrice;
    private double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getKilometerDriven() {
        return kilometerDriven;
    }

    public void setKilometerDriven(int kilometerDriven) {
        this.kilometerDriven = kilometerDriven;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", year=" + year +
                ", kilometerDriven=" + kilometerDriven +
                ", fuelType='" + fuelType + '\'' +
                ", transmission='" + transmission + '\'' +
                ", ownerType='" + ownerType + '\'' +
                ", mileage='" + mileage + '\'' +
                ", engine='" + engine + '\'' +
                ", power='" + power + '\'' +
                ", seats=" + seats +
                ", newPrice='" + newPrice + '\'' +
                ", price=" + price +
                '}';
    }
}
