import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for base and height in cm
            System.out.print("Enter the base of the triangle in cm: ");
            double baseCm = input.nextDouble();

            System.out.print("Enter the height of the triangle in cm: ");
            double heightCm = input.nextDouble();

            // Calculate area in square centimeters
            double areaCm = 0.5 * baseCm * heightCm;

            // Convert base and height to inches (1 inch = 2.54 cm)
            double baseInches = baseCm / 2.54;
            double heightInches = heightCm / 2.54;

            // Calculate area in square inches
            double areaInches = 0.5 * baseInches * heightInches;

            // Output
            System.out.println("The area of the triangle in sq in is " + areaInches +
                               " and in sq cm is " + areaCm);
        }
    }
}