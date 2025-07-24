package operatorsPrograms;
public class CarEmiCalculation {
    public static void main(String[] args) {
        // Calculate EMI of Mahindra Scorpio Car
        String carVariant = "S 11(Diesel) 21.91 lakhs*";
        int onRoadPrice = 2190887; 
        int downPayment = 380000; 
        float bankInterestRate = 9.50f; 
        int loanPeriodInMonths = 4;
        int totalLoanAmount = onRoadPrice - downPayment;
        int paybleAmount = 2183760; // 
        
        // Convert annual interest rate to monthly and calculate the number of months

        int totalMonths = loanPeriodInMonths * 12;
        float monthlyInterestRate = bankInterestRate / 100 / 12;
       

        // EMI calculation
        double emi =(totalLoanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalMonths)) /
                     (Math.pow(1 + monthlyInterestRate, totalMonths) - 1);

        System.out.println("Car Variant: " + carVariant);
        System.out.println("payble Amount is: " + paybleAmount);
        System.out.println("Monthly EMI for Mahindra Scorpio is: " + Math.round(emi));
    }
}
