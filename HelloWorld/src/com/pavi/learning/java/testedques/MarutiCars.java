package com.pavi.learning.java.testedques;

public class MarutiCars {

    String modelName;
    String colour;
    String mileage;
    int engineCapacity;
    int numberOfGears;
    int modelYear;

    public MarutiCars(String modelName, String colour, int engineCapacity, int numberOfGears, int modelYear){

        this.modelName = modelName;
        this.colour = colour;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.numberOfGears = numberOfGears;
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "MarutiCars{" +
                "modelName='" + modelName + '\'' +
                ", colour='" + colour + '\'' +
                ", mileage='" + mileage + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", numberOfGears=" + numberOfGears +
                ", modelYear=" + modelYear +
                '}';
    }
}
