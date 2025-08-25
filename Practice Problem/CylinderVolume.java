import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for radius
            System.out.print("Enter the radius of the cylinder: ");
            double radius = input.nextDouble();

            // Take input for height
            System.out.print("Enter the height of the cylinder: ");
            double height = input.nextDouble();

            // Calculate volume using formula Volume = π * radius^2 * height
            double volume = Math.PI * radius * radius * height;

            // Output
            System.out.println("The volume of the cylinder with radius " + radius + " and height " + height + " is " + volume);
        }
    }
}
