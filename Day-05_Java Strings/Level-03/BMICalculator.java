import java.util.Scanner;

public class BMICalculator {

    // a. Method to get user input (weight and height) using try-with-resources
    public static double[][] getInput(int numberOfPeople) {
        double[][] input = new double[numberOfPeople][2];

        try (Scanner scanner = new Scanner(System.in)) {
            for (int i = 0; i < numberOfPeople; i++) {
                System.out.println("Enter details for Person " + (i + 1) + ":");

                System.out.print("Weight (kg): ");
                input[i][0] = scanner.nextDouble();

                System.out.print("Height (cm): ");
                input[i][1] = scanner.nextDouble();
            }
        }

        return input;
    }

    // b. Method to compute BMI and determine status
    public static String[][] computeBMIAndStatus(double[][] input) {
        int n = input.length;
        String[][] result = new String[n][4]; // Columns: Height, Weight, BMI, Status

        for (int i = 0; i < n; i++) {
            double weight = input[i][0];
            double heightCm = input[i][1];
            double heightM = heightCm / 100.0;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100.0) / 100.0; // round to 2 decimal places

            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            // Store as strings
            result[i][0] = String.valueOf(heightCm);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }

        return result;
    }

    // d. Method to display results in a tabular format
    public static void displayResult(String[][] result) {
        System.out.printf("%-12s %-12s %-10s %-15s\n", "Height (cm)", "Weight (kg)", "BMI", "Status");
        System.out.println("-----------------------------------------------------------");

        for (String[] row : result) {
            System.out.printf("%-12s %-12s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    // e. Main method
    public static void main(String[] args) {
        int numberOfPeople = 10;

        double[][] input = getInput(numberOfPeople);
        String[][] result = computeBMIAndStatus(input);
        displayResult(result);
    }
}
