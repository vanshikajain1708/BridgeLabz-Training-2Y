import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numberOfStudents = sc.nextInt();

            double[][] marks = new double[numberOfStudents][3]; // 0: physics, 1: chemistry, 2: maths
            double[] percentages = new double[numberOfStudents];
            char[] grades = new char[numberOfStudents];

            // Input marks for each student
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("\nStudent " + (i + 1) + ":");

                for (int j = 0; j < 3; j++) {
                    double mark;
                    String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                    do {
                        System.out.print("Enter marks for " + subject + ": ");
                        mark = sc.nextDouble();
                        if (mark < 0) {
                            System.out.println("Marks must be positive. Try again.");
                        }
                    } while (mark < 0);

                    marks[i][j] = mark;
                }

                // Calculate percentage
                double total = marks[i][0] + marks[i][1] + marks[i][2];
                percentages[i] = (total / 300.0) * 100.0;

                // Assign grade based on percentage
                double perc = percentages[i];
                if (perc >= 80) {
                    grades[i] = 'A';
                } else if (perc >= 70) {
                    grades[i] = 'B';
                } else if (perc >= 60) {
                    grades[i] = 'C';
                } else if (perc >= 50) {
                    grades[i] = 'D';
                } else if (perc >= 40) {
                    grades[i] = 'E';
                } else {
                    grades[i] = 'R';
                }
            }

            // Display results
            System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.printf("%d\t%.2f\t%.2f\t\t%.2f\t%.2f%%\t\t%c\n",
                        i + 1,
                        marks[i][0],
                        marks[i][1],
                        marks[i][2],
                        percentages[i],
                        grades[i]);
            }
        }
    }
}