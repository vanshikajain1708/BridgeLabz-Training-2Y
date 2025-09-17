import java.util.Scanner;

public class StudentScorecard {

    // Method to generate random marks for all students
    public static int[][] generateMarks(int n) {
        int[][] marks = new int[n][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < n; i++) {
            marks[i][0] = (int) (Math.random() * 100); // Physics
            marks[i][1] = (int) (Math.random() * 100); // Chemistry
            marks[i][2] = (int) (Math.random() * 100); // Math
        }
        return marks;
    }

    // Method to calculate totals, average, and percentage
    public static double[][] calculateResults(int[][] marks) {
        int n = marks.length;
        double[][] results = new double[n][3]; 
        // [Total, Average, Percentage]

        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;     // Round to 2 decimals
            results[i][2] = Math.round(percent * 100.0) / 100.0; // Round to 2 decimals
        }
        return results;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] marks, double[][] results) {
        System.out.printf("%-8s %-8s %-10s %-8s %-8s %-10s %-12s%n", 
                "StudID", "Physics", "Chemistry", "Maths", "Total", "Average", "Percentage");
        System.out.println("-------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-8d %-8d %-10d %-8d %-8.0f %-10.2f %-12.2f%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            int[][] marks = generateMarks(n);
            double[][] results = calculateResults(marks);

            displayScorecard(marks, results);
        }
    }
}

