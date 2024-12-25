import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Calculator obj = new Calculator();
        System.out.println("Choose an operation");
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        int n=sc.nextInt();
        System.out.println("Enter 2 numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        switch(n){
            case 1:{
                System.out.println("Answer = "+ obj.add(x,y));
                break;
            }
            case 2:{
                System.out.println("Answer = "+ obj.subtract(x,y));
                break;
            }
            case 3:{
                System.out.println("Answer = "+ obj.multiply(x,y));
                break;
            }
            case 4:{
                System.out.println("Answer = "+ obj.divide(x,y));
                break;
            }
        }
   }
}