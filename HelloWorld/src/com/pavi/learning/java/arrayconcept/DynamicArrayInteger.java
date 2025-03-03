package com.pavi.learning.java.arrayconcept;

import java.util.ArrayList;


public class DynamicArrayInteger {

    public static void main(String[] args) {

        ArrayList<Integer> dynamicArray = new ArrayList<>();

        dynamicArray.add(12);
        dynamicArray.add(22);
        dynamicArray.add(32);
        dynamicArray.add(42);

        System.out.println("Elements in the dynamic array: " + dynamicArray);

        dynamicArray.add(52);
        dynamicArray.add(62);

        System.out.println("Updated dynamic array: " + dynamicArray);

        int elementAtIndex2 = dynamicArray.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        dynamicArray.remove(1);
        System.out.println("Array after removal of element at index 1: " + dynamicArray);


        System.out.println("Size of the dynamic array: " + dynamicArray.size());
    }
}

    

