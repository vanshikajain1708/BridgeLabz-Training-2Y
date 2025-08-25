import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for a, b, and c as doubles
            System.out.print("Enter value for a: ");
            double a = input.nextDouble();

            System.out.print("Enter value for b: ");
            double b = input.nextDouble();

            System.out.print("Enter value for c: ");
            double c = input.nextDouble();

            // Perform operations
            double op1 = a + b * c;   // Multiplication before addition
            double op2 = a * b + c;   // Multiplication before addition
            double op3 = c + a / b;   // Division before addition
            double op4 = a % b + c;   // Modulus before addition

            // Output results
            System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + ", and " + op4);
        }
    }
}