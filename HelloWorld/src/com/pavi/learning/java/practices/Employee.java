package com.pavi.learning.java.practices;

public class Employee {

    int id;
    String name;
    String department;
    int age;
    double salary;
    long phoneNumber;

    public Employee(int id,String name,String department,int age,double salary,long phoneNumber){

        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.salary = salary;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
