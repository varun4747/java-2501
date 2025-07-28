import java.util.Scanner;

public class CustomerSalesTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Customer Sales Tracker!");
        System.out.println("Please enter the customer details below:");

        System.out.println("Enter Customer ID: ");
        String customerId = sc.nextLine();

        System.out.println("Enter Customer Name: ");
        String customerName = sc.nextLine();

        double totalPurchases = 0;
        int interactionCount = 0;
        char choice = 'y';

        while (choice == 'y') {
            System.out.println("Enter Sale Amount:");
            double saleAmount = sc.nextDouble();
            totalPurchases += saleAmount;
            interactionCount++;

            System.out.print("Do you want to enter another sale? (yes/no): ");
            choice = sc.next().charAt(0);

        }
        double AvgsaleAmount = totalPurchases / interactionCount;
        // System.out.println("Average Sale Amount: " + AvgsaleAmount);

        String customerStatus = "";
        if (totalPurchases >= 50000) {
            customerStatus = "Platinum";
        } else if (totalPurchases >= 25000) {
            customerStatus = "Gold";

        } else if (totalPurchases >= 10000) {
            customerStatus = "Silver";
        } else if (totalPurchases < 10000) {
            customerStatus = "Bronze";

        }

        String activityStatus = interactionCount < 5 ? "Interaction count is Bad! Maintain Above 5 Purchaceses"
                : "Interaction count is Good.";

        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Total Purchases: " + totalPurchases);
        System.out.println("Average Sale Amount: " + AvgsaleAmount);
        System.out.println("Customer Status: " + customerStatus);
        System.out.println(customerName + " your " + activityStatus);

        sc.close();

    }
}
