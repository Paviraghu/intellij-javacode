package com.pavi.learning.java.testedques;

public class CarApp {

    public static void main(String[] args) {

        Car alto = new Car("Alto","Black",990,5,2004);
        Car swift = new Car("Swift","White",1197,5,2002);
        Car baleno = new Car("Baleno","Red",1197,5,2009);
        Car gypsy = new Car("Gypsy","Black",990,5,2006);

        alto.mileage();
        gypsy.mileage();

    }
}
