package com.pavi.learning.java.oops.Poly;

public class CalculatorApp {

    public static void main(String[] args){

        Calculator calc = new Calculator();

        System.out.println("sum of two integers:" + calc.add(5,10));
        System.out.println("sum of three integers:" + calc.add(4,6,8));
        System.out.println("sum of tow doubles:" + calc.add(5.5,10.5));
    }
}
