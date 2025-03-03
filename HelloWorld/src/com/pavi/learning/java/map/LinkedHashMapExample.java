package com.pavi.learning.java.map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args){

        LinkedHashMap<Integer, String> students = new LinkedHashMap<>();

        students.put(101,"Ram");
        students.put(102,"janu");
        students.put(103,"sowmi");

        System.out.println("Students in insertion order:");

        for (Integer id : students.keySet()){
            System.out.println("ID:" + id +",Name:" + students.get(id));
        }
    }
}
