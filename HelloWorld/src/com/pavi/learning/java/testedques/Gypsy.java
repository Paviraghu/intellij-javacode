package com.pavi.learning.java.testedques;

public class Gypsy extends Maruti {

    String modelName;
    String colour;
    int engineCapacity;
    int numberOfYears;
    int modelYear;

    public Gypsy(String modelName, String colour, int engineCapacity, int numberOfYears, int modelYear) {
        super(modelName, colour, engineCapacity, numberOfYears, modelYear);
        this.modelName = modelName;
        this.colour = colour;
        this.engineCapacity = engineCapacity;
        this.numberOfYears = numberOfYears;
        this.modelYear = modelYear;
    }

    @Override
    public void mileage() {
        System.out.println(modelName + "gives 15kmpl");
    }
}
