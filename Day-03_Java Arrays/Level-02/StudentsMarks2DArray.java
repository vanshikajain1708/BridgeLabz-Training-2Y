public class StudentsMarks2DArray {
    public static void main(String[] args) {
        // Try-with-resources ensures Scanner is automatically closed
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

            // Input number of students
            System.out.print("Enter the number of students: ");
            int numberOfStudents = sc.nextInt();

            // 2D array to store marks [student][subject]
            double[][] marks = new double[numberOfStudents][3]; // 0=Physics, 1=Chemistry, 2=Maths
            double[] percentage = new double[numberOfStudents];
            String[] grade = new String[numberOfStudents];

            // Input marks for each student
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter marks for student " + (i + 1) + ":");
                System.out.print("Physics: ");
                marks[i][0] = sc.nextDouble();
                System.out.print("Chemistry: ");
                marks[i][1] = sc.nextDouble();
                System.out.print("Maths: ");
                marks[i][2] = sc.nextDouble();
            }

            // Calculate percentage and grade
            for (int i = 0; i < numberOfStudents; i++) {
                double total = marks[i][0] + marks[i][1] + marks[i][2];
                percentage[i] = (total / 300) * 100;

                // Assign grade based on percentage
                if (percentage[i] >= 90) {
                    grade[i] = "A+";
                } else if (percentage[i] >= 80) {
                    grade[i] = "A";
                } else if (percentage[i] >= 70) {
                    grade[i] = "B+";
                } else if (percentage[i] >= 60) {
                    grade[i] = "B";
                } else if (percentage[i] >= 50) {
                    grade[i] = "C";
                } else {
                    grade[i] = "F";
                }
            }

            // Display results
            System.out.println("\nStudent\tPhysics\tChemistry\tMaths\tPercentage\tGrade");
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.printf("%d\t%.1f\t%.1f\t\t%.1f\t%.2f%%\t\t%s\n",
                                  (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
            }
        }
    }
}