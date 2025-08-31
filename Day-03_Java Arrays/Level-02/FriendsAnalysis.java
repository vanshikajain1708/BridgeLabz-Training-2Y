import java.util.Scanner;

public class FriendsAnalysis {
    public static void main(String[] args) {
        
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        try (Scanner sc = new Scanner(System.in)) {

            // Take input for ages and heights
            for (int i = 0; i < friends.length; i++) {
                System.out.print("Enter age of " + friends[i] + ": ");
                ages[i] = sc.nextInt();
                System.out.print("Enter height of " + friends[i] + " (in cm): ");
                heights[i] = sc.nextDouble();
            }

            // Find youngest
            int minAgeIndex = 0;
            for (int i = 1; i < ages.length; i++) {
                if (ages[i] < ages[minAgeIndex]) {
                    minAgeIndex = i;
                }
            }

            // Find tallest
            int maxHeightIndex = 0;
            for (int i = 1; i < heights.length; i++) {
                if (heights[i] > heights[maxHeightIndex]) {
                    maxHeightIndex = i;
                }
            }

            // Display results
            System.out.println("\nThe youngest friend is: " + friends[minAgeIndex] + " with age " + ages[minAgeIndex]);
            System.out.println("The tallest friend is: " + friends[maxHeightIndex] + " with height " + heights[maxHeightIndex] + " cm");
        }
    }
}
