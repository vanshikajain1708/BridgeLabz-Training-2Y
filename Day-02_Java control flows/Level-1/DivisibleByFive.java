import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for the number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            // Check divisibility by 5
            boolean isDivisible = (number % 5 == 0);

            // Output
            System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
        }
    }
}