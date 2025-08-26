import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            double total = 0.0;  // Initialize total sum
            double number;        // Variable to store user input

            System.out.println("Enter numbers to sum (enter 0 or negative number to stop):");

            // Infinite loop
            while (true) {
                System.out.print("Enter a number: ");
                number = input.nextDouble();

                // Break the loop if the number is 0 or negative
                if (number <= 0) {
                    break;
                }

                total += number;  // Add number to total
            }

            // Output the total sum
            System.out.println("The total sum of entered positive numbers is: " + total);
        }
    }
}