import java.util.Scanner;

public class TrigonometricFunction {

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trig values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input angle in degrees
            System.out.print("Enter angle in degrees: ");
            double angle = sc.nextDouble();

            // Call method
            double[] results = calculateTrigonometricFunctions(angle);

            // Output results
            System.out.printf("Sine(%.2f°)   = %.4f%n", angle, results[0]);
            System.out.printf("Cosine(%.2f°) = %.4f%n", angle, results[1]);
            System.out.printf("Tangent(%.2f°)= %.4f%n", angle, results[2]);
        }
    }
}

