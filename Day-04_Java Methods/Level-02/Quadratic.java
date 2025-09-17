import java.util.Scanner;

public class Quadratic {

    // Method to find roots of quadratic equation
    public static double[] findRoots(double a, double b, double c) {
        double delta = Math.pow(b, 2) - 4 * a * c;  // discriminant

        int caseType = (delta > 0) ? 1 : (delta == 0) ? 0 : -1;

        return switch (caseType) {
            case 1 -> {
                // Two distinct roots
                double root1 = (-b + Math.sqrt(delta)) / (2 * a);
                double root2 = (-b - Math.sqrt(delta)) / (2 * a);
                yield new double[]{root1, root2};
            }
            case 0 -> {
                // One root
                double root = -b / (2 * a);
                yield new double[]{root};
            }
            default -> new double[]{}; // No real roots
        };
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Input coefficients
            System.out.print("Enter value of a: ");
            double a = scanner.nextDouble();

            System.out.print("Enter value of b: ");
            double b = scanner.nextDouble();

            System.out.print("Enter value of c: ");
            double c = scanner.nextDouble();

            // Call method
            double[] roots = findRoots(a, b, c);

            // Display results
            switch (roots.length) {
                case 2 -> System.out.println("Two roots found: " + roots[0] + " and " + roots[1]);
                case 1 -> System.out.println("One root found: " + roots[0]);
                default -> System.out.println("No real roots exist.");
            }
        }
    }
}

