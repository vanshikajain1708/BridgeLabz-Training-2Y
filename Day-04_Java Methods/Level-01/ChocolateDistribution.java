import java.util.Scanner;

public class ChocolateDistribution {

    // Method to calculate quotient (chocolates per child) and remainder (leftover chocolates)
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // chocolates each child gets
        int remainder = number % divisor; // leftover chocolates
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            System.out.print("Enter the number of chocolates: ");
            int numberOfChocolates = sc.nextInt();

            System.out.print("Enter the number of children: ");
            int numberOfChildren = sc.nextInt();

            // Check divisor not zero
            if (numberOfChildren == 0) {
                System.out.println("Number of children cannot be zero.");
                return;
            }

            // Call method
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Output
            System.out.println("Each child will get " + result[1] + " chocolates.");
            System.out.println("Remaining chocolates: " + result[0]);
        }
    }
}

