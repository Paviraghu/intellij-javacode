package com.pavi.learning.java.practices;

import java.util.ArrayList;

public class UserObjects {

    int id;
    String name;
    String phone;
    String address;

    public UserObjects(int id,String name,String phone,String address) {

        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserObjects{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static void main(String[] args){

        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();

        System.out.println("Total Memory:" + totalMemory);
        System.out.println("Free Memory:" + freeMemory);

        long halfMemory = totalMemory / 2;
        System.out.println("HalfMemory:" + halfMemory);

        if (freeMemory > halfMemory) {
            System.out.println("Creating objects:");

            ArrayList<UserObjects> user = new ArrayList<>();


            for (int i = 0; i <= 2000000; i++) {
                user.add(new UserObjects(i, "name" + i, "phone" + i, "address" + i));
            }
        }

        long memoryAfterCreation = Runtime.getRuntime().freeMemory();

        System.out.println(memoryAfterCreation);
    }
}
