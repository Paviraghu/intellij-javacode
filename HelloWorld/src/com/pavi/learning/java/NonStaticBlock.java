package com.pavi.learning.java;

public class NonStaticBlock {

    int i;

    public static void main(String[] args){

        NonStaticBlock variableInit = new NonStaticBlock();
        variableInit.runLocalInit();
    }

    private  void runLocalInit(){

        System.out.println("Printing value for i:" +i);
        int localValue = 2;
        System.out.println(localValue);
    }
}
