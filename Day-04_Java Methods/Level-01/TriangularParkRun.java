import java.util.Scanner;

public class TriangularParkRun {

    // Method to calculate number of rounds for 5 km
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return 5000 / perimeter;  // 5000 meters = 5 km
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input sides of the triangle
            System.out.print("Enter side 1 (in meters): ");
            double side1 = sc.nextDouble();

            System.out.print("Enter side 2 (in meters): ");
            double side2 = sc.nextDouble();

            System.out.print("Enter side 3 (in meters): ");
            double side3 = sc.nextDouble();

            // Calculate rounds
            double rounds = calculateRounds(side1, side2, side3);

            // Output result
            System.out.println("The athlete must complete " + rounds 
                               + " rounds to finish a 5 km run.");
        }
    }
}