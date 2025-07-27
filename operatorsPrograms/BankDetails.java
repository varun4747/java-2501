package operatorsPrograms;
import java.util.Scanner;

public class BankDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Name: ");
        String customerName = sc.nextLine();

        System.out.println("Enter Account Number: ");
        long accNo = sc.nextLong();

        sc.nextLine();

        System.out.println("Enter Bank Name: ");
        String bankName = sc.nextLine();

        System.out.println("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();

        float minBalance = 1000.00f;

        System.out.println("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();

        boolean isAccountActive = true;
        int numOfTransactions = 0;

        // Withdrawal Logic
        if (withdrawAmount <= 0) {
            System.out.println(" Invalid withdrawal amount.");
        } else if (withdrawAmount > depositAmount) {
            System.out.println(" Insufficient balance.");
        } else {
            depositAmount -= withdrawAmount;
            System.out.println(" Withdrawal successful.");
            System.out.println("Remaining Balance: ₹" + depositAmount);
            numOfTransactions++;
        }

        // Final Calculations
        double currentBalance = depositAmount; 
        boolean depositAmountAndisAccountActive = (depositAmount > minBalance) && isAccountActive;
        String accStatus = isAccountActive ? "Active" : "Inactive";

        
        System.out.println("Number of Transactions: " + numOfTransactions);
        System.out.println("Minimum Balance Maintained & Active Account: " + depositAmountAndisAccountActive);


        

        sc.close();
    }
}
