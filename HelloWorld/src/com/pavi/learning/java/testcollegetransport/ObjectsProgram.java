package com.pavi.learning.java.testcollegetransport;

import java.util.ArrayList;

public class ObjectsProgram {

    int id;
    String name;
    String phoneNumber;
    String address;

    public ObjectsProgram(int id, String name, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    @Override
    public String toString() {
        return "ObjectsProgram{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        System.out.println("Total Memory: " + totalMemory);
        System.out.println("FreeMemory:" + freeMemory);

        long halfMemory = totalMemory / 2;
        System.out.println("halfmemory : " + halfMemory);

        if(  freeMemory > halfMemory) {
            System.out.println("creating objects : ");

            ArrayList<ObjectsProgram> userObjects = new ArrayList<>();

            for (int i = 0; i <= 200000; i++) {
                userObjects.add(new ObjectsProgram(i, "Name" + i, "Phone" + i, "Address" + i));
            }
        }

        long memoryAfterobjectcreation = Runtime.getRuntime().freeMemory();

        System.out.println(memoryAfterobjectcreation);

    }
}