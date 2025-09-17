import java.util.Scanner;

public class FriendsChecker {

    // Method to find index of youngest friend
    public static int findYoungest(int[] ages) {
        int minIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    // Method to find index of tallest friend
    public static int findTallest(int[] heights) {
        int maxIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        // ✅ try-with-resources ensures scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {

            // Friend names
            String[] names = {"Amar", "Akbar", "Anthony"};

            // Arrays to store ages and heights
            int[] ages = new int[3];
            int[] heights = new int[3];

            // Taking input from user
            for (int i = 0; i < 3; i++) {
                System.out.print("Enter age of " + names[i] + ": ");
                ages[i] = scanner.nextInt();
                System.out.print("Enter height of " + names[i] + " (in cm): ");
                heights[i] = scanner.nextInt();
            }

            // Find youngest and tallest
            int youngestIndex = findYoungest(ages);
            int tallestIndex = findTallest(heights);

            // Display results
            System.out.println("\nThe youngest friend is " + names[youngestIndex] +
                               " with age " + ages[youngestIndex]);
            System.out.println("The tallest friend is " + names[tallestIndex] +
                               " with height " + heights[tallestIndex] + " cm");
        }
    }
}
