import java.util.Scanner;

public class SmallestNumberCheck {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for three numbers
            System.out.print("Enter the first number: ");
            int number1 = input.nextInt();

            System.out.print("Enter the second number: ");
            int number2 = input.nextInt();

            System.out.print("Enter the third number: ");
            int number3 = input.nextInt();

            // Check if the first number is the smallest
            boolean isSmallest = (number1 < number2) && (number1 < number3);

            // Output
            System.out.println("Is the first number the smallest? " + isSmallest);
        }
    }
}
