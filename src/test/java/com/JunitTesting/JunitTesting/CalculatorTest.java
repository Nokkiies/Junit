package com.JunitTesting.JunitTesting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator;

    CalculatorTest() {
        calculator = new Calculator();
    }


    @Test
    @DisplayName("testAdd")
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "บวก 2 + 3 ต้องได้ 5");
    }

    // ทำการทดสอบการลบ
    @Test
    @DisplayName("testSubtract")
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "ลบ 5 - 3 ต้องได้ 2");
    }

}