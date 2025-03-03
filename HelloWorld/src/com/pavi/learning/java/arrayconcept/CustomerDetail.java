package com.pavi.learning.java.arrayconcept;

import java.util.ArrayList;

public class CustomerDetail {

    String name;
    Long phoneNumber;
    int age;
    String village;
    String city;
    String district;

    public CustomerDetail(String name, Long phoneNumber, int age, String village, String city, String district) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.village = village;
        this.city = city;
        this.district = district;
    }

    @Override
    public String toString() {
        return "CustomerDetail{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                ", village='" + village + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<CustomerDetail> detail = new ArrayList<>();

        detail.add(new CustomerDetail("Pavithra", 7397411095L, 23, "Pettai", "Rasipuram", "Namakal"));
        detail.add(new CustomerDetail("Sangeetha", 6362639172L, 45, "Pettai", "Rasipuram", "Namakal"));
        detail.add(new CustomerDetail("Sowmi", 9345897215L, 15, "Pettai", "Rasipuram", "Namakal"));
        detail.add(new CustomerDetail("Raghunathan", 9148069656L, 50, "Pettai", "Rasipuram", "Namakal"));
        detail.add(new CustomerDetail("Narmadhadevi", 7379141059L, 21, "Rasipuram", "Rasipuram", "Namakal"));
        detail.add(new CustomerDetail("Kiruba", 7392468045L, 21, "Rasipuram", "Rasipuram", "Namakal"));
        detail.add(new CustomerDetail("Raja", 8064213579L, 40, "Pettai", "Rasipuram", "Namakal"));
        detail.add(new CustomerDetail("Bharathi", 8502436798L, 23, "Kattuputtur", "Namakkal", "Trichy"));
        detail.add(new CustomerDetail("Dhivya", 9753108642L, 23, "Kattuputtur", "Namakkal", "Trichy"));
        detail.add(new CustomerDetail("sajitha", 7710890465L, 38, "Pettai", "Rasipuram", "Namakal"));

        System.out.println("Age Between 35 to 45");
        for (CustomerDetail Customer : detail) {
            if (Customer.age >= 35 && Customer.age <= 45) {
                System.out.println(Customer);
            }
        }
        System.out.println("Phone numbers ending with 5");
        for (CustomerDetail Customer : detail) {
            if (Customer.phoneNumber % 10 == 5) {
                System.out.println(Customer);
            }
        }
        System.out.println("\nNames with length more than 10");
        for (CustomerDetail Customer : detail) {
            if (Customer.name.length() > 10) {
                System.out.println(Customer);
            }
        }
    }
}

