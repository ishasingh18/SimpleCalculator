//This is where the test cases are getting created.
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;

public class TestGenerator {

    public static void main(String[] args) {
        // Using FileWriter to write test cases in a text file
        try (FileWriter writer = new FileWriter("CalculatorTestCases.txt")) {
            generateTestCases(writer);
        } catch (IOException e) { // Handling unexpected error
            e.printStackTrace();
        }
    }

    private static void generateTestCases(FileWriter writer) throws IOException {
        // Using Reflection to identify class methods
        Class<?> calculatorClass = Calculator.class;
        Method[] methods = calculatorClass.getDeclaredMethods();

        // Loop through each method and generate test cases
        for (Method method : methods) {
            // Check if the method has two parameters of type double
            if (method.getParameterCount() == 2 && method.getParameterTypes()[0] == double.class && method.getParameterTypes()[1] == double.class) {
                for (int i = 0; i < EdgeCases.DoubleEdgeCases.length; i++) {
                    for (int j = i + 1; j < EdgeCases.DoubleEdgeCases.length; j++) {
                        double a = EdgeCases.DoubleEdgeCases[i];
                        double b = EdgeCases.DoubleEdgeCases[j];

                        // Generate the test case for each method
                        String test = generateTestCase(method.getName(), a, b);
                        writer.write(test + "\n");
                    }
                }
            }
        }

        // Explicit tests for Overflow and Underflow cases
        writer.write(generateOverflowTestCase("testDoubleOverflow") + "\n");
        writer.write(generateUnderflowTestCase("testDoubleUnderflow") + "\n");
    }

    private static String generateTestCase(String operation, double a, double b) {
        // Using StringBuilder for easier manipulation
        StringBuilder testCase = new StringBuilder();
        // Creating test method
        testCase.append("@Test\n");
        testCase.append("void test").append(operation).append("() {\n");
        testCase.append("    double result = calculator.").append(operation).append("(").append(a).append(", ").append(b).append(");\n");
        testCase.append("    assertEquals(").append(expectedResult(operation, a, b)).append(", result);\n");
        testCase.append("}\n");
        return testCase.toString(); // Converting to String
    }
//Generates Overflow test case
    private static String generateOverflowTestCase(String testName) {
        return """
                @Test
                void %s() {
                    double maxDouble = Double.MAX_VALUE;
                    double overflowResult = calculator.add(maxDouble, maxDouble); 
                    assertTrue(Double.isInfinite(overflowResult));  
                }
                """.formatted(testName);//dynamically inserts testName
    }
//Generates Underflow test case
    private static String generateUnderflowTestCase(String testName) {
        return """
                @Test
                void %s() {
                    double minDouble = Double.MIN_VALUE;
                    double underflowResult = minDouble / Double.MAX_VALUE;
                    assertEquals(0.0, underflowResult, 0.0);
                }
                """.formatted(testName);
    }
//Writing expected results for each test case
    private static String expectedResult(String operation, double a, double b) {
        switch (operation) {
            case "add":
                return String.valueOf(a + b); //convert results to Strings
            case "subtract":
                return String.valueOf(a - b);
            case "multiply":
                return String.valueOf(a * b);
            case "divide":
                return (b == 0) ? "Double.NaN" : String.valueOf(a / b);
            //if undefined method is called
                default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }
}
