package com.pavi.learning.java;

import java.util.ArrayList;

public class WrapperClassExample {

    public static void main(String[] args) {

        WrapperClassExample wrapperClass = new WrapperClassExample();
        wrapperClass.autoBoxing();
        wrapperClass.autoUnBoxing();
        wrapperClass.wrapperIncollection();
        wrapperClass.parsinString();
        wrapperClass.primitiveToString();
    }

    public void autoBoxing() {
        int num = 10;
        Integer obj = num;
        System.out.println("Wrapper object: " + obj);
    }

    public void autoUnBoxing() {
        Integer obj = 20;
        int num = obj;
        System.out.println("Primitive value:" + num);
    }

    public void wrapperIncollection() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);

        int num = list.get(0);

        System.out.println("Arraylist: " + list);
        System.out.println("first element: " + num);
    }

    public void parsinString() {
        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println("Parsed int: " + num);
    }

    public void primitiveToString() {
        int num = 123;
        String str = Integer.toString(num);
        System.out.println("Converted String: " + str);
    }
}