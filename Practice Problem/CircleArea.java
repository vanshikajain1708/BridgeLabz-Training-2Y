import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for radius
            System.out.print("Enter the radius of the circle: ");
            double radius = input.nextDouble();

            // Calculate area using formula Area = π * radius^2
            double area = Math.PI * radius * radius;

            // Output
            System.out.println("The area of the circle with radius " + radius + " is " + area);
        }
    }
}
