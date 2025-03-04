package com.pavi.learning.java.Testquestion;

import java.util.Scanner;

public class DefaultNumber {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Between 256 to 512");
        int a = scanner.nextInt();

        if(a > 450){
            System.out.println("close to half GB it is more than 450");
        }
        else if(a < 320) {
            System.out.println("Just above quarter GB if it is less tha 320");
        }
        else{
            System.out.println("Default Value");
        }
    }
}

