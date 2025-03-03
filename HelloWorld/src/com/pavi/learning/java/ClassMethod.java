package com.pavi.learning.java;

public class ClassMethod {

    public static void main(String[] args){

        ClassMethod cm = new ClassMethod();
        int resultAdd = cm.addNumber(45,25);
        int resultSub = cm.subNumber(45,25);

        System.out.println("Addition:" +resultAdd);
        System.out.println("Subtraction:" +resultSub);

        System.out.println(cm.addNumber(23.5,22.4));
    }

    private int addNumber(int x, int y){
        return x+y;
    }
    private double addNumber(double x, double y){
        return x+y;
    }
    private int subNumber(int x, int y){
        return x-y;
    }
}
