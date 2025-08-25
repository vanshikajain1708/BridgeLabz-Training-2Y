import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for base
            System.out.print("Enter the base number: ");
            double base = input.nextDouble();

            // Take input for exponent
            System.out.print("Enter the exponent: ");
            double exponent = input.nextDouble();

            // Calculate power
            double result = Math.pow(base, exponent);

            // Output
            System.out.println(base + " raised to the power " + exponent + " is: " + result);
        }
    }
}
