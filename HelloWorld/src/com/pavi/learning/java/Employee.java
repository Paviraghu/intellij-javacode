package com.pavi.learning.java.hashmap;

public class Employee {

    private String id;
    private String name;
    private String gender;
    private String type;

    public Employee(String id,String name,String gender,String type){

        this.id = id;
        this.name = name;
        this.gender = gender;
        this.type = type;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
