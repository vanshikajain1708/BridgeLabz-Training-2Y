import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for distance in kilometers
            System.out.print("Enter the distance in kilometers: ");
            double kilometers = input.nextDouble();

            // Convert to miles
            double miles = kilometers * 0.621371;

            // Output
            System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        }
    }
}
