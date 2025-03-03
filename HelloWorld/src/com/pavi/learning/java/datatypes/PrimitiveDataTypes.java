package com.pavi.learning.java.DataTypes;

public class PrimitiveDataTypes {

    public static void main(String[] args) {

        //Boolean
        int age = 20;
        if (age > 18) {
            System.out.println("you are eligible to join the college");
        } else {
            System.out.println("you are not eligible to join the college");
        }

        //int
        int num1 = 8;
        int num2 = 25;

        int sum = num1 + num2;
        int product = num1 * num2;

        System.out.println("First number:" + num1);
        System.out.println("Second number:" + num2);

        System.out.println("Sum:" + sum);
        System.out.println("product:" + product);

        //float value
        float num3 = 1873.2f;
        float num4 = 1.8742f;

        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);

        //Byte range
        byte minvalue = Byte.MIN_VALUE;
        byte maxvalue = Byte.MAX_VALUE;

        System.out.println("The minimum value of byte:" + minvalue);
        System.out.println("The maximum value of byte:" + maxvalue);

        //Short range
        short minValue = Short.MIN_VALUE;
        short maxValue = Short.MAX_VALUE;

        System.out.println("The minimum value of short:" + minValue);
        System.out.println("The maximum value of short:" + maxValue);

        //Double values
        double number1 = 54.3d;
        double number2 = 3d;

        System.out.println("number1:" + number1);
        System.out.println("number2:" + number2);

        long min = -9223372036854775808L;
        long max = 9223372036854775807L;

        System.out.println("min:" + min);
        System.out.println("max:" + max);
    }
}
