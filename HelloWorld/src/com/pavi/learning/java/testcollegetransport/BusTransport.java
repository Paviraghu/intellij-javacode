package com.pavi.learning.java.testcollegetransport;

import java.util.ArrayList;

public class BusTransport {

    int busId;
    String busNo;
    String routeNo;
    String driverName;
    boolean isOutForPick;

    public BusTransport(int busId, String busNo, String routeNo, String driverName, String isOutForPick ){

        this.busId = busId;
        this.busNo = busNo;
        this.routeNo = routeNo;
        this.driverName = driverName;
        this.isOutForPick = Boolean.parseBoolean(isOutForPick);
    }

    @Override
    public String toString() {
        return "BusTransport{" +
                "busId=" + busId +
                ", busNo='" + busNo + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", driverName='" + driverName + '\'' +
                ", isOutForPick=" + isOutForPick +
                '}';
    }

    public static void main(String[] args){
        ArrayList<BusTransport> Transport = new ArrayList<>();
        Transport.add(new BusTransport(1,"20","R15","sam","True"));
        Transport.add(new BusTransport(2,"24","R17","preetha","False"));
        Transport.add(new BusTransport(3,"30","R05","ram","True"));
        Transport.add(new BusTransport(4,"12","R5","jeeva","True"));
        Transport.add(new BusTransport(5,"40","R25","sowmi","True"));
        Transport.add(new BusTransport(6,"04","R35","sandy","False"));
        Transport.add(new BusTransport(7,"02","R101","kiru","True"));
        Transport.add(new BusTransport(8,"14","R11","manasi","False"));
        Transport.add(new BusTransport(9,"10","R13","surya","True"));
        Transport.add(new BusTransport(10,"18","R18","Deena","False"));

        System.out.println("Buses to pickup students : ");
        for(BusTransport bus : Transport) {
            if (bus.isOutForPick == true) {
                System.out.println(bus);
            }

        }

        System.out.println("Available in the parking lot:");

        for (BusTransport bus : Transport) {
            if (bus.isOutForPick==false) {
                System.out.println(bus);
            }
        }
    }

}
