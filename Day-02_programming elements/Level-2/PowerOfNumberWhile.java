import java.util.Scanner;

public class PowerOfNumberWhile {
    public static void main(String[] args) {
        // try-with-resources ensures Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Input base number
            System.out.print("Enter a positive integer as the base: ");
            int number = sc.nextInt();

            // Input power
            System.out.print("Enter a positive integer as the power: ");
            int power = sc.nextInt();

            // Check for valid input
            if (number <= 0 || power < 0) {
                System.out.println("Please enter positive integers (power can be 0).");
            } else {
                int result = 1; // Initialize result
                int counter = 0; // Initialize counter

                // Loop until counter reaches power
                while (counter < power) {
                    result *= number;
                    counter++;
                }

                System.out.println(number + " raised to the power " + power + " is: " + result);
            }
        }
    }
}
