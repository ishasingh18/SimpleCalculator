import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=0;
        int y=0;
        Calculator obj = new Calculator(); //creating object of class
        System.out.println("Choose an operation"); //creating menu
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        int n=sc.nextInt(); //taking option from user
        if(n<1 || n>4){
            System.out.println("Invalid input!! Please try again");
            System.exit(0);
        }
        else{
            System.out.println("Enter 2 numbers");
             x=sc.nextInt();
             y=sc.nextInt();
        }

        switch(n){
            case 1:{
                System.out.println("Answer = "+ obj.add(x,y)); //method call
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
                if(y==0){
                    System.out.println("Can't divide by 0!");
                    System.exit(0);
                }
                else{
                    System.out.println("Answer = "+ obj.divide(x,y));
                }
                break;
            }
        }
   }
}