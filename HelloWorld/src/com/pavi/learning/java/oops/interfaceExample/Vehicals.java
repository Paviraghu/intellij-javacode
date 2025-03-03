package com.pavi.learning.java.oops.interfacexample;


public interface Vehicals {

    void start();

    void chargeBattery();
}

interface ElectricVehicle extends Vehicals {
    void chargeBattery();
}

class Telsa implements Vehicals {

    @Override
    public void start() {
        System.out.println("Telsa is starting");
    }

    @Override
    public void chargeBattery(){
        System.out.println("Charging Telsa Battery");
    }
}


class Vehicle {

    public static void main(String[] args){
        Telsa telsa1 = new Telsa();
        telsa1.start();
        telsa1.chargeBattery();
    }
}