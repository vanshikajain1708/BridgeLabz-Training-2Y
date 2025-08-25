import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for first number
            System.out.print("Enter the first number: ");
            int num1 = input.nextInt();

            // Take input for second number
            System.out.print("Enter the second number: ");
            int num2 = input.nextInt();

            // Calculate sum
            int sum = num1 + num2;

            // Output
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        }
    }
}
