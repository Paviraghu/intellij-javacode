package com.pavi.learning.java.exception;

class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

}

public class CustomExceptionExample {

    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomException e) {
            System.out.println("CustomException caught: " + e.getMessage());
        }
    }


    static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be at least 18");
        }
    }
}
