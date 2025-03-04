package com.pavi.learning.java.testedques;

public class Car {

    String modelName;
    String colour;
    int engineCapacity;
    int numberOfYears;
    int modelYear;
    String mileage;

    public Car(String modelName,String colour,int engineCapacity,int numberOfYears,int modelYear){
        this.modelName = modelName;
        this.colour = colour;
        this.engineCapacity = engineCapacity;
        this.numberOfYears = numberOfYears;
        this.modelYear = modelYear;
    }

    public void mileage() {
        System.out.println(modelName + " gives 22 kmpl");
    }

    @Override
    public String toString() {
        return "Car{" +
                "modelName='" + modelName + '\'' +
                ", colour='" + colour + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", numberOfYears=" + numberOfYears +
                ", modelYear=" + modelYear +
                '}';
    }
}
