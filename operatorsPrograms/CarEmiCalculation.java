package operatorsPrograms;
import java.util.Scanner;
public class CarEmiCalculation {
    public static void main(String[] args) {
        // Calculate EMI of Mahindra Scorpio Car
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Car Variant: ");
        String carVariant = scanner.nextLine();

        System.out.print("Enter On-Road Price: ");
        int onRoadPrice = scanner.nextInt();

        System.out.print("Enter Down Payment: ");
        int downPayment = scanner.nextInt();

        System.out.print("Enter Bank Interest Rate (Annual): ");
        float bankInterestRate = scanner.nextFloat();

        System.out.print("Enter Loan Period (in Years): ");
        int loanPeriodInYears = scanner.nextInt();

        // Convert annual interest rate to monthly and calculate the number of months

        int totalMonths = loanPeriodInYears * 12;
        float monthlyInterestRate = bankInterestRate / 100 / 12;

        // EMI calculation
        Double EmiMonthly= (double) (onRoadPrice - downPayment) * monthlyInterestRate * Math.pow((1 + monthlyInterestRate), totalMonths) / (Math.pow((1 + monthlyInterestRate), totalMonths) - 1);
        int emi = EmiMonthly.intValue();

        System.out.println("Car Variant: " + carVariant);
        System.out.println("payble Amount is: " + (onRoadPrice - downPayment));
        System.out.println("Monthly EMI for Mahindra Scorpio is: " + emi);
    }

    // private static int getEmi(Double EmiMonthly) {
    //     int emi = EmiMonthly.intValue();
    //     return emi;
    // }
}
