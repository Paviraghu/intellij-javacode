package com.pavi.learning.java.practices;

import java.util.ArrayList;

public class BusTrans {

    int busId;
    String busNo;
    String routeNo;
    String driverName;
    boolean isOutForPick;

    public BusTrans(int busId, String busNo, String routeNo, String driverName, String isOutForPick) {
        this.busId = busId;
        this.busNo = busNo;
        this.routeNo = routeNo;
        this.driverName = driverName;
        this.isOutForPick = Boolean.parseBoolean(isOutForPick);
    }

    @Override
    public String toString() {
        return "BusTrans{" +
                "busId=" + busId +
                ", busNo='" + busNo + '\'' +
                ", routeNo='" + routeNo + '\'' +
                ", driverName='" + driverName + '\'' +
                ", isOutForPick=" + isOutForPick +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<BusTrans> detail = new ArrayList<>();
        detail.add(new BusTrans(101,"12","A15","Ram","True"));
        detail.add(new BusTrans(10,"14","A25","Sam","False"));
        detail.add(new BusTrans(11,"16","A35","Riya","True"));
        detail.add(new BusTrans(8,"18","A115","Siva","False"));
        detail.add(new BusTrans(5,"20","A85","Priya","True"));
        detail.add(new BusTrans(30,"22","A45","Surya","False"));
        detail.add(new BusTrans(22,"24","A5","Sandy","True"));
        detail.add(new BusTrans(24,"26","A65","Kavin","False"));
        detail.add(new BusTrans(35,"28","A52","Ravi","True"));
        detail.add(new BusTrans(34,"30","A54","Deena","False"));


        System.out.println("Buses to pick up students:");
        for(BusTrans bus : detail){
            if(bus.isOutForPick == true){
                System.out.println(bus);
            }
        }

        System.out.println("Buses in parking lot");
        for (BusTrans bus : detail){
            if (bus.isOutForPick == false){
                System.out.println(bus);
            }
        }
    }

}
