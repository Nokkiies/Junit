import com.JunitTesting.test.Calculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    // ใช้ @BeforeEach เพื่อสร้าง object ใหม่ก่อนทดสอบทุกครั้ง
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    // ใช้ @AfterEach เพื่อทำความสะอาดข้อมูลหลังจากทดสอบทุกครั้ง
    @AfterEach
    void tearDown() {
        // อาจจะใช้ในกรณีที่ต้องทำความสะอาด resource เช่น close database connection
    }

    // ใช้ @BeforeAll เพื่อเตรียมข้อมูลก่อนเริ่มการทดสอบทั้งหมด (static method)
    @BeforeAll
    static void initAll() {
        System.out.println("Starting tests...");
    }

    // ใช้ @AfterAll เพื่อทำความสะอาด resource หลังการทดสอบทั้งหมด (static method)
    @AfterAll
    static void tearDownAll() {
        System.out.println("Tests completed.");
    }

    // ทดสอบการบวก
    @Test
    void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result, "Addition should return correct result");
    }

    // ทดสอบการลบ
    @Test
    void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "Subtraction should return correct result");
    }

    // ทดสอบการหารที่ไม่มีข้อผิดพลาด
    @Test
    void testDivide() {
        int result = calculator.divide(6, 3);
        assertEquals(2, result, "Division should return correct result");
    }

    // ทดสอบหารด้วย 0 ซึ่งจะต้องเกิด exception
    @Test
    void testDivideByZero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(6, 0);
        });
        assertEquals("Cannot divide by zero", exception.getMessage(), "Exception message should match");
    }

    // ทดสอบการใช้ assertTrue
    @Test
    void testIsPositive() {
        int result = calculator.add(5, 5);
        assertTrue(result > 0, "Result should be positive");
    }

    // ทดสอบการใช้ assertFalse
    @Test
    void testIsNegative() {
        int result = calculator.subtract(5, 10);
        assertFalse(result > 0, "Result should be negative");
    }

    // ทดสอบการใช้ assertNull และ assertNotNull
    @Test
    void testNullCheck() {
        String str = null;
        assertNull(str, "String should be null");

        str = "JUnit";
        assertNotNull(str, "String should not be null");
    }

}