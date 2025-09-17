import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI and update array
    public static void calculateBMI(double[][] data) {
        for (double[] person : data) {
            double weight = person[0];
            double heightInMeters = person[1] / 100.0; // convert cm to meters
            double bmi = weight / (heightInMeters * heightInMeters);
            person[2] = bmi; // store BMI in 3rd column
        }
    }

    // Method to determine BMI status
    public static String[] getBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        int index = 0;
        for (double[] person : data) {
            double bmi = person[2];
            if (bmi <= 18.4) {
                status[index] = "Underweight";
            } else if (bmi <= 24.9) {
                status[index] = "Normal";
            } else if (bmi <= 39.9) {
                status[index] = "Overweight";
            } else {
                status[index] = "Obese";
            }
            index++;
        }
        return status;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double[][] data = new double[10][3]; // 10 rows, 3 columns

            // Input weight and height
            for (int i = 0; i < data.length; i++) {
                System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
                data[i][0] = scanner.nextDouble();

                System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
                data[i][1] = scanner.nextDouble();
            }

            // Calculate BMI
            calculateBMI(data);

            // Get BMI status
            String[] status = getBMIStatus(data);

            // Display results using enhanced for loop
            System.out.println("\n--- BMI Report ---");
            System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight", "Height", "BMI", "Status");

            int index = 0;
            for (double[] person : data) {
                System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                        person[0], person[1], person[2], status[index]);
                index++;
            }
        }
    }
}
