import java.util.Random;

public class StudentScorecard {

    // a. Generate random scores
    public static int[][] generateScores(int studentCount) {
        Random rand = new Random();
        int[][] scores = new int[studentCount][3]; // 3 subjects: PCM

        for (int i = 0; i < studentCount; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(41) + 60; // Random scores between 60 to 100
            }
        }
        return scores;
    }

    // b. Calculate totals, averages, and percentages
    public static double[][] calculateTotals(int[][] scores) {
        int studentCount = scores.length;
        double[][] results = new double[studentCount][3]; // [Total, Average, Percentage]

        for (int i = 0; i < studentCount; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percent * 100.0) / 100.0;
        }

        return results;
    }

    // c. Assign grades
    public static char[] assignGrades(double[][] results) {
        char[] grades = new char[results.length];

        for (int i = 0; i < results.length; i++) {
            double percent = results[i][2];

            if (percent >= 80) grades[i] = 'A';
            else if (percent >= 70) grades[i] = 'B';
            else if (percent >= 60) grades[i] = 'C';
            else if (percent >= 50) grades[i] = 'D';
            else if (percent >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }

        return grades;
    }

    // d. Display scorecard
    public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-12s %-8s\n", 
                          "Physics", "Chemistry", "Math", "Total", "Average", "Percentage", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10.0f %-10.2f %-12.2f %-8c\n",
                              scores[i][0], scores[i][1], scores[i][2],
                              results[i][0], results[i][1], results[i][2],
                              grades[i]);
        }
    }

    // Main method
    public static void main(String[] args) {
        int studentCount = 10;

        int[][] scores = generateScores(studentCount);
        double[][] results = calculateTotals(scores);
        char[] grades = assignGrades(results);

        displayScorecard(scores, results, grades);
    }
}

