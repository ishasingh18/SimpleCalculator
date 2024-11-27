import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleCalc obj = new SimpleCalc();
       int n = obj.getOperands();
       double numbers[] = obj.getNumbers(n);
       double answer = obj.performOperations(n,numbers);
       obj.printOutput(answer);

    }

}