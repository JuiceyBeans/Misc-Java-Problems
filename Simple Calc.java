import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        // Get user input for operator
        System.out.print("Enter an operator (+, -, , /): ");
        char operator = scanner.next().charAt(0);

        // Get user input for second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculation based on operator
        double result = calculate(num1, num2, operator);

        // Check for division by zero
        if (result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY) {
            System.out.println("Error: Division by zero");
        } else {
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }

        scanner.close();
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '':
                return num1 * num2;
            case '/':
                return num2 != 0 ? num1 / num2 : Double.NaN; // Handle division by zero
            default:
                return Double.NaN; // Invalid operator
        }
    }
}