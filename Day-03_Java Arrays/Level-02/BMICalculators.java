public class BMICalculators {
    public static void main(String[] args) {
        System.out.print("Enter the number of persons: ");
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            int number = sc.nextInt();

            double[][] personData = new double[number][3]; // 0: weight, 1: height, 2: BMI
            String[] weightStatus = new String[number];

            // Input weight and height
            for (int i = 0; i < number; i++) {
                double weight;
                do {
                    System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
                    weight = sc.nextDouble();
                    if (weight <= 0) {
                        System.out.println("Weight must be positive. Try again.");
                    }
                } while (weight <= 0);

                double height;
                do {
                    System.out.print("Enter height (m) for person " + (i + 1) + ": ");
                    height = sc.nextDouble();
                    if (height <= 0) {
                        System.out.println("Height must be positive. Try again.");
                    }
                } while (height <= 0);

                personData[i][0] = weight;
                personData[i][1] = height;

                // Calculate BMI
                double bmi = weight / (height * height);
                personData[i][2] = bmi;

                // Determine weight status
                if (bmi < 18.5) {
                    weightStatus[i] = "Underweight";
                } else if (bmi < 25) {
                    weightStatus[i] = "Normal weight";
                } else if (bmi < 30) {
                    weightStatus[i] = "Overweight";
                } else {
                    weightStatus[i] = "Obese";
                }
            }

            // Display results
            System.out.println("\nPerson\tWeight(kg)\tHeight(m)\tBMI\t\tStatus");
            for (int i = 0; i < number; i++) {
                System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t%s\n",
                        i + 1,
                        personData[i][0],
                        personData[i][1],
                        personData[i][2],
                        weightStatus[i]);
            }
        }
    }
}