import java.util.Scanner;

public class CollinearPoints {

    // Method to check collinearity using slope
    public static boolean checkBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Avoid division by zero by using cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    // Method to check collinearity using area of triangle
    public static boolean checkByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x1, y1: ");
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            System.out.print("Enter x2, y2: ");
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            System.out.print("Enter x3, y3: ");
            int x3 = sc.nextInt();
            int y3 = sc.nextInt();

            // Check by slope
            boolean slopeCheck = checkBySlope(x1, y1, x2, y2, x3, y3);
            // Check by area
            boolean areaCheck = checkByArea(x1, y1, x2, y2, x3, y3);

            if (slopeCheck && areaCheck) {
                System.out.println("The three points are Collinear.");
            } else {
                System.out.println("The three points are NOT Collinear.");
            }
        }
    }
}

