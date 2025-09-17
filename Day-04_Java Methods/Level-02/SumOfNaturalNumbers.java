import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Formula method to find sum of n natural numbers
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input from user
            System.out.print("Enter a natural number (n > 0): ");
            int n = sc.nextInt();

            // Check if natural number
            if (n <= 0) {
                System.out.println("Please enter a valid natural number (greater than 0).");
                return;
            }

            // Calculate using recursion
            int recursiveSum = sumRecursive(n);

            // Calculate using formula
            int formulaSum = sumFormula(n);

            // Display results
            System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveSum);
            System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaSum);

            // Compare results
            if (recursiveSum == formulaSum) {
                System.out.println("✅ Both methods give the same result.");
            } else {
                System.out.println("❌ Results are different. Please check the logic.");
            }
        }
    }
}

