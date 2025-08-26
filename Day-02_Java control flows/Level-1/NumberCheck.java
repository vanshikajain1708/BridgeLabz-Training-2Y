import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for the number
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number " + number + " is positive.");
            } else if (number < 0) {
                System.out.println("The number " + number + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }
    }
}
