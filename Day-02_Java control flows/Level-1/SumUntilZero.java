import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            double total = 0.0;  // Initialize total sum
            double number;        // Variable to store user input

            System.out.println("Enter numbers to sum (enter 0 to stop):");

            // Loop until the user enters 0
            while (true) {
                System.out.print("Enter a number: ");
                number = input.nextDouble();

                if (number == 0) {
                    break;  // Exit the loop when 0 is entered
                }

                total += number;  // Add number to total
            }

            // Output the total sum
            System.out.println("The total sum of entered numbers is: " + total);
        }
    }
}
