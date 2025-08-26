import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            // Check if the number is a natural number
            if (number > 0) {
                // Calculate sum of first n natural numbers
                int sum = number * (number + 1) / 2;
                System.out.println("The sum of " + number + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + number + " is not a natural number");
            }
        }
    }
}
