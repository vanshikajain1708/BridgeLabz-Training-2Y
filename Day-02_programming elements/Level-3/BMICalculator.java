import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Use try-with-resources to auto-close Scanner
        try (Scanner sc = new Scanner(System.in)) {

            // Step 1: Take user input
            System.out.print("Enter your weight in kg: ");
            double weight = sc.nextDouble();

            System.out.print("Enter your height in cm: ");
            double heightCm = sc.nextDouble();

            // Step 2: Convert height to meters
            double heightM = heightCm / 100;

            // Step 3: Calculate BMI
            double bmi = weight / (heightM * heightM);

            // Step 4: Determine status
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Step 5: Display results
            System.out.printf("Your BMI is: %.2f%n", bmi);
            System.out.println("Status: " + status);
        }
    }
}