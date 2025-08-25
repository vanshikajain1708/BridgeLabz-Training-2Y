import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for base and height in inches
            System.out.print("Enter the base of the triangle in inches: ");
            double baseInches = input.nextDouble();

            System.out.print("Enter the height of the triangle in inches: ");
            double heightInches = input.nextDouble();

            // Calculate area in square inches
            double areaInches = 0.5 * baseInches * heightInches;

            // Convert area to square centimeters (1 inch = 2.54 cm)
            double areaCm = areaInches * Math.pow(2.54, 2);

            // Output
            System.out.println("The area of the triangle is " + areaInches + " square inches and " + areaCm + " square centimeters.");
        }
    }
}