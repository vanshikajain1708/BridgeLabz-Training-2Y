import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for Principal
            System.out.print("Enter the principal amount: ");
            double principal = input.nextDouble();

            // Take input for Rate of interest
            System.out.print("Enter the rate of interest (in %): ");
            double rate = input.nextDouble();

            // Take input for Time (in years)
            System.out.print("Enter the time period (in years): ");
            double time = input.nextDouble();

            // Calculate Simple Interest
            double simpleInterest = (principal * rate * time) / 100;

            // Output
            System.out.println("The Simple Interest is: " + simpleInterest);
        }
    }
}
