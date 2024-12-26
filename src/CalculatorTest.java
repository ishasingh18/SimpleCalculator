import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        double result = calculator.add(0d, 0d);
        Assertions.assertEquals(0d, result);
    }

    @Test
    void testSubtract() {
        double result = calculator.subtract(0d, 0d);
        Assertions.assertEquals(0d, result);
    }

    @Test
    void testMultiply() {
        double result = calculator.multiply(0d, 0d);
        Assertions.assertEquals(0d, result);
    }

    @Test
    void testDivide() {
        double result = calculator.divide(0d, 0d);
        Assertions.assertEquals(0d, result);
    }
}
