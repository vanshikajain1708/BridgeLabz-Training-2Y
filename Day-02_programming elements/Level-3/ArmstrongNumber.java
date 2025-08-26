import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Step 1: Use try-with-resources so Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Step 2: Get integer input from user
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Step 3: Define sum variable and set it to 0
            int sum = 0;

            // Step 4: Store original number in another variable
            int originalNumber = number;

            // Step 5: Use while loop till originalNumber is not 0
            while (originalNumber != 0) {
                // Find last digit using modulus operation
                int digit = originalNumber % 10;

                // Cube the digit and add to sum
                sum += digit * digit * digit;

                // Remove the last digit using division
                originalNumber = originalNumber / 10;
            }

            // Step 6: Compare sum with the original number
            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }
}
