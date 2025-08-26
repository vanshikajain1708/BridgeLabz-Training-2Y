import java.util.Scanner;

public class FactorialCalculatorForLoop {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int number = input.nextInt();

            // Check if the number is positive
            if (number < 0) {
                System.out.println("The number " + number + " is not a positive integer.");
                return;
            }

            long factorial = 1; // Initialize factorial

            // Calculate factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Output
            System.out.println("The factorial of " + number + " is: " + factorial);
        }
    }
}
