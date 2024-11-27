import java.util.Scanner;

public class SimpleCalc {
    Scanner sc = new Scanner(System.in);
    public int getOperands() {
        System.out.println("Enter number of operands");
        int n = sc.nextInt();
        return n;
    }

    public double[] getNumbers(int n) {
        double numbers[] = new double[n];
        System.out.println("Enter " + n + " numbers");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextDouble();
        }
        return numbers;
    }

    public double performOperations(int n, double numbers[]) {
        double answer = numbers[0];
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
    System.out.println("ANS = "+answer);
    }
}