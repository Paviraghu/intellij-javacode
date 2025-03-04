package com.pavi.learning.java.testoperationspecified;

public class FileInput {

    private long inputA;
    private long inputB;
    private String action;
    private long result;

    public long getInputA() {
        return inputA;
    }

    public void setInputA(long inputA) {
        this.inputA = inputA;
    }

    public long getInputB() {
        return inputB;
    }

    public void setInputB(long inputB) {
        this.inputB = inputB;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public long getResult() {
        return result;
    }

    public void setResult(long result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "FileInput{" +
                "inputA=" + inputA +
                ", inputB=" + inputB +
                ", action='" + action + '\'' +
                ", result=" + result +
                '}';
    }
}
