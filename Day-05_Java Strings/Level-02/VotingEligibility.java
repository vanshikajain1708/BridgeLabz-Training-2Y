import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {

    // Method to generate random ages for n students
    public static int[] generateRandomAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            // Generate 2-digit random age between 10 and 99
            ages[i] = 10 + rand.nextInt(90);
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2]; // 2D array for age and eligibility
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = Integer.toString(age);
            
            if (age < 0) {
                result[i][1] = "Cannot Vote"; // Negative age invalid
            } else if (age >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {
        System.out.printf("%-10s%-15s%n", "Age", "Voting Status");
        System.out.println("-------------------------");
        for (String[] row : data) {
            System.out.printf("%-10s%-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            // Generate random ages for students
            int[] ages = generateRandomAges(n);

            // Check voting eligibility
            String[][] result = checkVotingEligibility(ages);

            // Display results
            displayResult(result);
        }
    }
}

