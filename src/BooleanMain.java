import java.util.Scanner;

public class BooleanMain {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        BooleanLoanApproval obj = new BooleanLoanApproval();
        System.out.print("Enter your salary: ");
        int salary = sc.nextInt();
        System.out.print("Enter recent deposit amount: ");
        int recDeposit = sc.nextInt();
        System.out.print("Enter the number of applications in the last 30 days: ");
        int numApplications = sc.nextInt();
        System.out.print("Enter your current debt: ");
        int currentDebt = sc.nextInt();
        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();
        obj.isLoanApproved(salary,recDeposit,numApplications,currentDebt,creditScore);
    }
}
