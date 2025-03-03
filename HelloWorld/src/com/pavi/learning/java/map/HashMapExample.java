package com.pavi.learning.java.map;

import java.lang.reflect.Array;
import java.rmi.StubNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {

    public static  void main(String[] args){

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101,"Ram");
        students.put(102,"sam");
        students.put(103,"sophia");
        students.put(104,null);
        students.put(null,"No ID");

        System.out.println("Student with ID 101:" +students.get(101));

        System.out.println("All students:");

        for (Integer id :students.keySet()){
            System.out.println("ID:" + id +", Name:" +students.get(id));
        }

        HashMap<String, ArrayList> classAndStudents = new HashMap<>();

        ArrayList<Student> classAStudentList = new ArrayList<Student>();

        classAStudentList.add(new Student(101,"Ramu"));
        classAStudentList.add(new Student(102,"Somu"));

        classAndStudents.put("ClassA",classAStudentList);

        ArrayList<Student> classBStudentList = new ArrayList<>();

        classBStudentList.add(new Student(101,"Sam"));
        classBStudentList.add(new Student(102,"Siva"));

        classAndStudents.put("ClassB",classBStudentList);

        ArrayList<Student> list = classAndStudents.get("ClassA");

        for(Student s : list){
            System.out.println("Student id:" +s.getId() +"Name:" +s.getName());
        }

    }
}
