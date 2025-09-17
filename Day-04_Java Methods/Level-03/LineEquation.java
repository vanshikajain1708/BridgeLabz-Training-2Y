import java.util.Scanner;

public class LineEquation {

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate slope and intercept of the line
    public static double[] lineEquation(double x1, double y1, double x2, double y2) {
        double slope, intercept;

        if (x1 == x2) {
            // Vertical line special case (slope = infinity, no intercept in y=mx+b form)
            throw new IllegalArgumentException("Line is vertical, slope is undefined.");
        }

        slope = (y2 - y1) / (x2 - x1);      // m = (y2 - y1)/(x2 - x1)
        intercept = y1 - (slope * x1);      // b = y1 - m*x1

        return new double[]{slope, intercept};
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x1, y1: ");
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();

            System.out.print("Enter x2, y2: ");
            double x2 = sc.nextDouble();
            double y2 = sc.nextDouble();

            // Distance
            double distance = calculateDistance(x1, y1, x2, y2);
            System.out.printf("Euclidean Distance = %.2f%n", distance);

            // Line Equation
            try {
                double[] line = lineEquation(x1, y1, x2, y2);
                System.out.printf("Equation of line: y = %.2fx + %.2f%n", line[0], line[1]);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

