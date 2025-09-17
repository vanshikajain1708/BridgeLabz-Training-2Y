import java.util.Scanner;

public class FactorsProgram {

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        // First pass: count factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Initialize array with count
        int[] factors = new int[count];

        // Second pass: store factors
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate sum of squares of factors
    public static double sumOfSquares(int[] factors) {
        double sumSquares = 0;
        for (int factor : factors) {
            sumSquares += Math.pow(factor, 2);
        }
        return sumSquares;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input number
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Get factors
            int[] factors = findFactors(number);

            // Display factors
            System.out.print("Factors of " + number + ": ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();

            // Calculate results
            int sum = sumOfFactors(factors);
            long product = productOfFactors(factors);
            double sumSquares = sumOfSquares(factors);

            // Display results
            System.out.println("Sum of factors = " + sum);
            System.out.println("Product of factors = " + product);
            System.out.println("Sum of squares of factors = " + sumSquares);
        }
    }
}
