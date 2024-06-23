import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for principal, interest rate, and time period
        System.out.print("Enter principal amount (e.g., 10000): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (e.g., 5 for 5%): ");
        double interestRate = scanner.nextDouble();

        System.out.print("Enter time period in years (e.g., 3): ");
        int timePeriod = scanner.nextInt();

        // Convert interest rate to decimal (e.g., 5% becomes 0.05)
        double rate = interestRate / 100;

        // Calculate compound interest
        double amount = calculateCompoundInterest(principal, rate, timePeriod);

        // Calculate total interest earned
        double interestEarned = amount - principal;

        // Display results
        System.out.printf("Amount after %d years: %.2f\n", timePeriod, amount);
        System.out.printf("Total interest earned: %.2f\n", interestEarned);

        scanner.close();
    }

    public static double calculateCompoundInterest(double principal, double rate, int timePeriod) {
        return principal * Math.pow(1 + rate, timePeriod);
    }
}