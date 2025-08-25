import java.util.Scanner;

public class KmToMilesConversion {
    public static void main(String[] args) {
        // Try-with-resources automatically closes the Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Declare variable for kilometers
            double km;

            // Take input from user
            System.out.print("Enter distance in kilometers: ");
            km = input.nextDouble();

            // Convert km to miles (1 mile = 1.6 km)
            double miles = km / 1.6;

            // Output
            System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        }
    }
}
