import java.util.Scanner;

public class QuotientRemainder {

    // Method to find remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // Division
        int remainder = number % divisor; // Modulus
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number: ");
            int number = sc.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = sc.nextInt();

            // Check divisor not zero
            if (divisor == 0) {
                System.out.println("Divisor cannot be zero.");
                return;
            }

            // Call method
            int[] result = findRemainderAndQuotient(number, divisor);

            // Output
            System.out.println("Remainder: " + result[0]);
            System.out.println("Quotient: " + result[1]);
        }
    }
}
