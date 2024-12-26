import java.util.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException { //handling error if class cannot be found
        Scanner sc = new Scanner(System.in);
        double x=0.0;
        double y=0.0;
        Calculator obj = new Calculator(); // Creating Calculator object
        Class<?> clazz = Class.forName("Calculator"); // dynamically loading class
        System.out.println("Choose an operation"); //menu-driven calculator
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Class Analysis");

        try {
            int n = sc.nextInt(); // reading user input

            if (n >= 1 && n <= 4) {
                System.out.println("Enter 2 numbers:");
                x = sc.nextDouble();
                y = sc.nextDouble();
            }

            switch (n) {
                case 1 -> System.out.println("Answer = " + obj.add(x, y));//method call
                case 2 -> System.out.println("Answer = " + obj.subtract(x, y));
                case 3 -> System.out.println("Answer = " + obj.multiply(x, y));
                case 4 -> {
                    if (y == 0) {//handling division by 0
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println("Answer = " + obj.divide(x, y));
                    }
                }
                case 5 -> {
                    System.out.println("Class Analysis:");
                    for (Method method : clazz.getDeclaredMethods()) {//getting all declared methods
                        System.out.println("Method: " + method.getName());


                        for (Parameter param : method.getParameters()) {//getting all declared parameters
                            System.out.println("  Parameter type: " + param.getType().getSimpleName());
                        }

                        //printing their return type
                        System.out.println("Return type: " + method.getReturnType().getSimpleName());
                    }
                }
                default -> System.out.println("Invalid input! Please try again.");
            }
        } catch (InputMismatchException e) {//handling error is user inputs invalid option
            System.out.println("Invalid input! Please enter valid choice.");
        }
    }
}
