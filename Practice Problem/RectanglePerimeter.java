import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for length
            System.out.print("Enter the length of the rectangle: ");
            double length = input.nextDouble();

            // Take input for width
            System.out.print("Enter the width of the rectangle: ");
            double width = input.nextDouble();

            // Calculate perimeter using formula: Perimeter = 2 * (length + width)
            double perimeter = 2 * (length + width);

            // Output
            System.out.println("The perimeter of the rectangle is: " + perimeter);
        }
    }
}

