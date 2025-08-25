import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user inputs
            System.out.print("Enter the first number: ");
            double number1 = input.nextDouble();

            System.out.print("Enter the second number: ");
            double number2 = input.nextDouble();

            // Perform arithmetic operations
            double addition = number1 + number2;
            double subtraction = number1 - number2;
            double multiplication = number1 * number2;
            double division = number1 / number2; // division by zero not handled here

            // Output results
            System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " 
                               + number1 + " and " + number2 + " is " 
                               + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        }
    }
}