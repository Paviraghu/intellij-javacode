package com.pavi.learning.java.Testquestion;

public class FloatingNumber {

    public static void main(String[] args){

        float num1 = 87.236F;
        float num2 = 87.236F;
        float num3 = 37.453F;


        if(num1 == num3) {
            System.out.println("It is not same");
        }else if(num1 == num2){
            System.out.println("It is same");
        }else {
            System.out.println("Default");
        }
    }

}
