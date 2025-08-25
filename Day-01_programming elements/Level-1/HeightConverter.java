import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        // Use try-with-resources for Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input from user in cm
            System.out.print("Enter your height in centimeters: ");
            double heightCm = input.nextDouble();

            // Convert cm to total inches
            double totalInches = heightCm / 2.54;

            // Calculate feet and remaining inches
            int feet = (int)(totalInches / 12);
            double inches = totalInches % 12;

            // Output
            System.out.println("Your Height in cm is " + heightCm +
                               " while in feet is " + feet + " and inches is " + inches);
        }
    }
}
