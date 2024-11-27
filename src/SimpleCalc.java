import java.util.*;
public class SimpleCalc {
    Scanner sc = new Scanner(System.in);//Initialising Scanner class
    public int getOperands() {
        System.out.println("Enter number of operands");
        int n = sc.nextInt();//reading number of operands from user
        return n;
    }

    public double[] getNumbers(int n) {
        double numbers[] = new double[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();//Storing numbers into an array
        }
        return numbers;
    }

    public double performOperations(int n, double numbers[]) {
        double answer = numbers[0];//Storing first number
        for (int i = 1; i < n; i++) {
            System.out.println("Choose an operation for number " + (i + 1) + " (+, -, *, /): ");
            String operator = sc.next();
            switch (operator) {
                case "+":
                    answer += numbers[i];  // Addition
                    break;
                case "-":
                    answer -= numbers[i];  // Subtraction
                    break;
                case "*":
                    answer *= numbers[i];  // Multiplication
                    break;
                case "/":
                    answer /= numbers[i];  // Division
                    break;
                default:
                    System.out.println("Invalid operator.");
                    sc.close();
            }

        }
        return answer;
    }
    public void printOutput(double answer){
        System.out.println("Answer = "+answer);//printing answer
    }
}