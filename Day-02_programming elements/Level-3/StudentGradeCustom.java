import java.util.Scanner;

public class StudentGradeCustom {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            // Input marks for 3 subjects
            System.out.print("Enter Physics marks (out of 100): ");
            double physics = sc.nextDouble();

            System.out.print("Enter Chemistry marks (out of 100): ");
            double chemistry = sc.nextDouble();

            System.out.print("Enter Maths marks (out of 100): ");
            double maths = sc.nextDouble();

            // Validate input
            if (physics < 0 || physics > 100 || chemistry < 0 || chemistry > 100 || maths < 0 || maths > 100) {
                System.out.println("Invalid marks entered. Please enter marks between 0 and 100.");
            } else {
                // Calculate total and average
                double total = physics + chemistry + maths;
                double average = total / 3;

                // Determine grade and remarks
                String grade, remarks;

                if (average >= 80) {
                    grade = "A";
                    remarks = "Level 4, above agency-normalized standards";
                } else if (average >= 70) {
                    grade = "B";
                    remarks = "Level 3, at agency-normalized standards";
                } else if (average >= 60) {
                    grade = "C";
                    remarks = "Level 2, below, but approaching agency-normalized standards";
                } else if (average >= 50) {
                    grade = "D";
                    remarks = "Level 1, well below agency-normalized standards";
                } else if (average >= 40) {
                    grade = "E";
                    remarks = "Level 1-, too below agency-normalized standards";
                } else {
                    grade = "R";
                    remarks = "Remedial standards";
                }

                // Display results
                System.out.println("\n--- Result ---");
                System.out.println("Physics: " + physics);
                System.out.println("Chemistry: " + chemistry);
                System.out.println("Maths: " + maths);
                System.out.printf("Average Marks: %.2f\n", average);
                System.out.println("Grade: " + grade);
                System.out.println("Remarks: " + remarks);
            }
        }
    }
}