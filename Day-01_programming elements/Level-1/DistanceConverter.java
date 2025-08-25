import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take user input for distance in feet
            System.out.print("Enter the distance in feet: ");
            double distanceFeet = input.nextDouble();

            // Convert feet to yards (1 yard = 3 feet)
            double distanceYards = distanceFeet / 3;

            // Convert yards to miles (1 mile = 1760 yards)
            double distanceMiles = distanceYards / 1760;

            // Output
            System.out.println("The distance in yards is " + distanceYards +
                               " and in miles is " + distanceMiles);
        }
    }
}
