public class BooleanLoanApproval {
    public boolean isFraud(int salary, int recDeposit, int numApplications, int currentDebt) {
        if (recDeposit > salary * 5)
            return true; // Large deposit flags as fraud
        if (numApplications > 3)
            return true; // Too many applications in 30 days flags as fraud
        if (currentDebt > salary * 0.5)
            return true; // Debt > 50% of salary flags as fraud
        return false;
    }

    public boolean classifyLoanRisk(int creditScore, int salary, int currentDebt) {
        double debtRatio = ((double) currentDebt / salary); // Debt ratio as a decimal
        System.out.println("Debt Ratio: " + debtRatio); // Debugging line
        if (creditScore < 650 || salary < 20000) {
            System.out.println("High Risk [5%] interest rate!");
            return true; // High Risk
        }
        if (creditScore >= 650 && debtRatio <= 0.3) {
            System.out.println("Low Risk [3%] interest rate!");
            return false; // Low Risk
        }
        System.out.println("High Risk [5%] interest rate!"); // Default to High Risk
        return true;
    }

    public boolean isLoanApproved(int salary, int recDeposit, int numApplications, int currentDebt, int creditScore) {
        if (isFraud(salary, recDeposit, numApplications, currentDebt)) {
            System.out.println("Fraud detected! Loan denied!");
            return false;
        }
        boolean isHighRisk = classifyLoanRisk(creditScore, salary, currentDebt);

        // Print only if loan is approved
        if (!isHighRisk) {
            System.out.println("Loan Approved!");
        }
        return !isHighRisk; // Return false for high risk, true for low risk
    }
}
