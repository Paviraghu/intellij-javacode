package com.pavi.learning.java.Testquestion;

import java.util.Arrays;

public class SingleDimension {


    public static void main(String[] args) {

        int[] array = {29, 45, 23, 98, 9, 12, 44, 78};
        System.out.println("Array:"+Arrays.toString(array));


        Arrays.sort(array);
        System.out.println("Array sort:"+ Arrays.toString(array));

        System.out.println("Highest value is:" +array[array.length-1]);
    }
}
