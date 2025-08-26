import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        // Use try-with-resources so Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {
            
            // Step 1: Get input from user
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Step 2: Initialize sum variable
            int sum = 0;

            // Step 3: Run loop to find divisors
            for (int i = 1; i < number; i++) {
                if (number % i == 0) {
                    sum += i; // Add divisor to sum
                }
            }

            // Step 4: Check condition for Abundant Number
            if (sum > number) {
                System.out.println(number + " is an Abundant Number.");
            } else {
                System.out.println(number + " is Not an Abundant Number.");
            }
        }
    }
}
