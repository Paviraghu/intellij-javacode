package com.pavi.learning.java.Testquestion;

public class HighestValue {

    public static void main(String[] args){

        int[] array = {2,4,6,8,10};

        int maxValue = array[0];

        for(int i : array){
            if(i>maxValue){
                maxValue = i;
            }
        }
        System.out.println("MaxValue:" + maxValue);
    }
}
