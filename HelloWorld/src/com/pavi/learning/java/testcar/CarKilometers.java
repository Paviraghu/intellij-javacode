package com.pavi.learning.java.testcar;

import static com.pavi.learning.java.testcar.CalculationKilometer.calculation;

public class CarKilometers {

    public static void main(String[] args) {

        double city = 30.0;
        double hills = 25.0;
        double highway = 45.0;

        double totalLiters = 35.0;
        double carCoverkm = 600.0;

        double cityDistance = calculation(city, carCoverkm);
        double hillsDistance = calculation(hills, carCoverkm);
        double highwayDistance = calculation(highway, carCoverkm);

        System.out.println("City:" + cityDistance);
        System.out.println("Hills:" + hillsDistance);
        System.out.println("Highway:" + highwayDistance);

    }

    public static double calculation(double percentage, double distance) {
        return (percentage / 100.0) * distance;
    }
}
