import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            // Array to store heights of 11 players
            double[] heights = new double[11];
            double sum = 0.0;

            // Take input
            System.out.println("Enter the heights of 11 football players:");
            for (int i = 0; i < heights.length; i++) {
                System.out.print("Enter height of player " + (i + 1) + ": ");
                heights[i] = sc.nextDouble();
                sum += heights[i]; // accumulate sum directly
            }

            // Calculate mean
            double mean = sum / heights.length;

            // Print result
            System.out.println("\nThe mean height of the football team is: " + mean);
        }
    }
}
