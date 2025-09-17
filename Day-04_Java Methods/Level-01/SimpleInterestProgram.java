import java.util.Scanner;

public class SimpleInterestProgram {

    // Method to calculate simple interest
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        // try-with-resources ensures Scanner is closed automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Taking input from user
            System.out.print("Enter Principal: ");
            double principal = sc.nextDouble();

            System.out.print("Enter Rate of Interest: ");
            double rate = sc.nextDouble();

            System.out.print("Enter Time (in years): ");
            double time = sc.nextDouble();

            // Calculating Simple Interest
            double si = calculateSimpleInterest(principal, rate, time);

            // Output
            System.out.println("The Simple Interest is " + si +
                               " for Principal " + principal +
                               ", Rate of Interest " + rate +
                               " and Time " + time);
        }
    }
}