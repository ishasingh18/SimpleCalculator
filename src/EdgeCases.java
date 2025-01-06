/*This is where all the edge cases are predefined. This could contain
edge cases for all primitive data types,arrays, objects etc.
* */
import java.util.Random;

public class EdgeCases {
    private static final Random random = new Random();

    // Predefined edge cases for different types of parameters
    public static final double[] DoubleEdgeCases = {
            random.nextDouble() * 1000,               // random double value
            -(random.nextDouble() * 1000),
            Double.MAX_VALUE,                         // Max double value
            Double.MIN_VALUE                          //Smallest double value
    };

    public static final int[] IntEdgeCases = {
            random.nextInt(1000) + 1,          // Random int value
            random.nextInt(1000) * -1,
            Integer.MAX_VALUE,                       //Max int value
            Integer.MIN_VALUE                        // Smallest int value
    };

    public static final String[] StringEdgeCases = {
            "",                                        // Empty string
            "@!#$%^&*",                                // Special characters
            null                                       // Null string
    };
}
