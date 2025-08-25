import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for three numbers
            System.out.print("Enter the first number: ");
            double num1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = input.nextDouble();

            System.out.print("Enter the third number: ");
            double num3 = input.nextDouble();

            // Calculate average
            double average = (num1 + num2 + num3) / 3;

            // Output
            System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is: " + average);
        }
    }
}