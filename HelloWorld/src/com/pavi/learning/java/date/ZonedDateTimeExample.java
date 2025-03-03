package com.pavi.learning.java.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

    public static void main(String[] args) {

        ZonedDateTime currentZoneDateTime = ZonedDateTime.now();

        System.out.println("CurrentZoneDateTime:" + currentZoneDateTime);

        ZoneId zoneId = ZoneId.of("Indian/Reunion");
        
        ZonedDateTime indiaTime = ZonedDateTime.now(zoneId);

        System.out.println("DateTime in India Time Zone:" + indiaTime);

        System.out.println("Available Time Zones:" + ZoneId.getAvailableZoneIds());

        ZonedDateTime lt = ZonedDateTime.of(2020,12,3,12,20,59,9000,zoneId);

        System.out.println("ZonedDateTime:" + lt);

    }
}
