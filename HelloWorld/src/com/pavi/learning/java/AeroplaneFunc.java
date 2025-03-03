package com.pavi.learning.java;

public class AeroplaneFunc {

    public static void main(String[] args){

        Aeroplane aeroplane1 = new Aeroplane();
        aeroplane1.setType("Airbus");
        aeroplane1.setColor("white");
        aeroplane1.setSpeed(900);
        aeroplane1.setFuelCapacity(27200);
        aeroplane1.setLength(72.72);

        Aeroplane aeroplane2 = new Aeroplane();
        aeroplane2.setType("Boeing");
        aeroplane2.setColor("gray");
        aeroplane2.setSpeed(750);
        aeroplane2.setFuelCapacity(25940);
        aeroplane2.setLength(76.3);

        System.out.println("com.pavi.learning.java.Aeroplane 1:" + aeroplane1.getType() +"," +aeroplane1.getSpeed());

        System.out.println("com.pavi.learning.java.Aeroplane 2:" + aeroplane2);
    }
}
