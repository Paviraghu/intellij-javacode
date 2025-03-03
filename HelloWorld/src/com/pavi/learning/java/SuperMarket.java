package com.pavi.learning.java;

import java.util.Scanner;

public class SuperMarket {

    public static void main(String[] args){

        int A,B,C,D,E,Price;

        int Soap;
        int Paste;
        int Shampoo;
        int Brush;
        int Rosewater;

        Scanner scanner=new Scanner(System.in);

        System.out.println("Soap:");
        A=scanner.nextInt();

        System.out.println("Paste:");
        B=scanner.nextInt();

        System.out.println("Shampoo:");
        C=scanner.nextInt();

        System.out.println("Brush");
        D= scanner.nextInt();

        System.out.println("Rosewater");
        E= scanner.nextInt();

        Price=A+B+C+D+E;
        System.out.println("Price:" +Price);

    }
}
