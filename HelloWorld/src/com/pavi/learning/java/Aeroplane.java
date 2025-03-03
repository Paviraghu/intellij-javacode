package com.pavi.learning.java;

public class Aeroplane {

    private String type;
    private String color;
    private int speed;
    private int fuelCapacity;
    private double length;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "com.pavi.learning.java.Aeroplane{" +
                "type='" + type + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                ", fuelCapacity=" + fuelCapacity +
                ", length=" + length +
                '}';
    }
}
