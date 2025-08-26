import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        // Use try-with-resources to close Scanner automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Step 1: Get integer input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Step 2: Initialize sum variable
            int sum = 0;

            // Step 3: Store original number for later check
            int originalNumber = number;

            // Step 4: While loop to extract each digit
            while (originalNumber != 0) {
                int digit = originalNumber % 10;  // get last digit
                sum += digit;                     // add digit to sum
                originalNumber = originalNumber / 10; // remove last digit
            }

            // Step 5: Check divisibility
            if (number % sum == 0) {
                System.out.println(number + " is a Harshad Number.");
            } else {
                System.out.println(number + " is Not a Harshad Number.");
            }
        }
    }
}
