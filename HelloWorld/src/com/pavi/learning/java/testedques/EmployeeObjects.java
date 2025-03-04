package com.pavi.learning.java.testedques;

import java.util.ArrayList;

public class EmployeeObjects {

    String name;
    String department;

    public EmployeeObjects(String name,String department){

        this.name = name;
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "EmployeeObjects{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }

    public static int updateDepartment(ArrayList<EmployeeObjects> employee){

        int count=0;

        for (EmployeeObjects e : employee){

            if ("Sales".equals(e.getDepartment())){
                e.setDepartment("Marketing");
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        ArrayList<EmployeeObjects> employee = new ArrayList<>();

        employee.add(new EmployeeObjects("Kiru","Sales"));
        employee.add(new EmployeeObjects("Ravi","Accountant"));
        employee.add(new EmployeeObjects("Siva","Sales"));
        employee.add(new EmployeeObjects("Narmatha","Manager"));
        employee.add(new EmployeeObjects("Bharu","Sales"));
        employee.add(new EmployeeObjects("Sandy","Cashier"));

        int count = updateDepartment(employee);

        System.out.println("Total Number of Marketing Department:" + count);

        System.out.println("UpdateDepartment:");

        for (EmployeeObjects emp : employee){
            System.out.println(emp);
        }

    }
}
