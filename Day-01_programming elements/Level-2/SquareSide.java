import java.util.Scanner;

public class SquareSide {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for perimeter
            System.out.print("Enter the perimeter of the square: ");
            double perimeter = input.nextDouble();

            // Calculate side length
            double side = perimeter / 4;

            // Output
            System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        }
    }
}
