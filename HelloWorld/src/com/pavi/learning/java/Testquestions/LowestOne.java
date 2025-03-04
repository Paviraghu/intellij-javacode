package com.pavi.learning.java.Testquestion;

public class LowestOne {

    public static void main(String[] args){

        int[] arr = {10,20,30,40};

        int minValue = arr[0];

        for(int i : arr){
            if(i < minValue){
                minValue = i;
            }
        }

        System.out.println("Lowest in Array : " + minValue) ;

    }
}
