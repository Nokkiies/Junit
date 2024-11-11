package com.JunitTesting.test;

public class Calculator {

    // เมธอดการบวก
    public int add(int a, int b) {
        return a + b;
    }

    // เมธอดการลบ
    public int subtract(int a, int b) {
        return a - b;
    }

    // เมธอดการหาร (อาจเกิดการหารด้วย 0)
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

}