package operatorsPrograms;

public class BankDetails {
    public static void main(String[] args) {
        
        String AccName="varunKumar";
        long AccNo=1234567890L;
        String bankName="Axis Bank";
        double AccBalance=10000.50;
        double depositAmount=5000.00;
        double withdrawAmount=2000.00;
        double minBalance=1000.00;
        boolean isAccountActive=true;
        int numOfTransactions=0;
        double currentBalance=AccBalance + depositAmount - withdrawAmount;
        boolean maintainedBalance = currentBalance >= minBalance;
        String AccStatus = isAccountActive ? "Active" : "Inactive";
        boolean depositAmountAndisAccountActive = depositAmount > 0 && isAccountActive;
        numOfTransactions++;
        System.out.println("Account Name: " + AccName);
        System.out.println("Account Number: " + AccNo);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Balance: " + currentBalance);
        System.out.println("Account Status: " + AccStatus);
        System.out.println("Number of Transactions: " + numOfTransactions);
        System.out.println(depositAmountAndisAccountActive);
    }
}

