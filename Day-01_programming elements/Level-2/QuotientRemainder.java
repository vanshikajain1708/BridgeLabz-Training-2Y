import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for two numbers
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();

            // Calculate quotient and remainder
            int quotient = number1 / number2;
            int remainder = number1 % number2;

            // Output
            System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder +
                               " of two numbers " + number1 + " and " + number2);
        }
    }
}
