/*This code was generated by the TestMe plugin. This will be used for comparison with
my TestCaseGenerator
* */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void testAdd() {
        double result = calculator.add(0d, 0d);
        assertEquals(0d, result);
    }
    @Test
    void testSubtract() {
        double result = calculator.subtract(0d, 0d);
        assertEquals(0d, result);
    }
    @Test
    void testMultiply() {
        double result = calculator.multiply(0d, 0d);
        assertEquals(0d, result);
    }

    @Test
    void testDivide() {
        double result = calculator.divide(0d, 0d);
        assertEquals(0d, result);
    }
}

