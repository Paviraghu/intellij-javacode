package com.pavi.learning.java.Operators;

public class BitewiseExample {

    public static void main(String[] args){

        int a = 5;
        int b = 3;

        int andResult = a & b;
        System.out.println("Bitewise AND:" + andResult);

        int orResult = a | b;
        System.out.println("Bitewise OR:" + orResult);

        int xorResult = a ^ b;
        System.out.println("Bitewsie XOR:" + xorResult);

        int complementResult = ~a;
        System.out.println("Bitewise complement:" +complementResult);

        int LeftshiftResult = a<<1;
        System.out.println("Bitewise leftshift:" +LeftshiftResult);

        int RightshiftResult = a>>1;
        System.out.println("Bitewise Rightshift:" +RightshiftResult);

    }
}
