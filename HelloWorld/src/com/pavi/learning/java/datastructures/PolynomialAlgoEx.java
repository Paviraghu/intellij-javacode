package com.pavi.learning.java.datastructures;

public class PolynomialAlgoEx {

    public static void main(String[] args) {

        PolynomialAlgoEx polynomialAlgoEx = new PolynomialAlgoEx();
        polynomialAlgoEx.doPrint(3);

    }

    public void doPrint(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.println("i = " + i + " j = " + j);
            }
            System.out.println("End of inner loop ");
        }
        System.out.println("End of Outer loop ");
    }

}
