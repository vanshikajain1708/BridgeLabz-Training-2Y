import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter a natural number: ");
            int n = input.nextInt();

            // Check if the number is a natural number
            if (n <= 0) {
                System.out.println("The number " + n + " is not a natural number.");
                return;
            }

            // Calculate sum using while loop
            int sumLoop = 0;
            int counter = 1;
            while (counter <= n) {
                sumLoop += counter;
                counter++;
            }

            // Calculate sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Output both results
            System.out.println("Sum of first " + n + " natural numbers using while loop: " + sumLoop);
            System.out.println("Sum of first " + n + " natural numbers using formula: " + sumFormula);

            // Compare the results
            if (sumLoop == sumFormula) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a discrepancy in the computations.");
            }
        }
    }
}
