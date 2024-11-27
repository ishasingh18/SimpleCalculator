import java.util.*;
public class Main {
    public static void main(String[] args) {
        SimpleCalc obj = new SimpleCalc();//Creating object for class
        //Calling all methods
       int n = obj.getOperands();
       double numbers[] = obj.getNumbers(n);
       double answer = obj.performOperations(n,numbers);
       obj.printOutput(answer);

    }
}