import java.util.Scanner;

public class StudentVoteChecker {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of students: ");
            int n = scanner.nextInt();
            int[] studentAges = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter age of student " + (i + 1) + ": ");
                studentAges[i] = scanner.nextInt();

                if (studentAges[i] < 0) {
                    System.out.println("Invalid age entered.");
                } else if (studentAges[i] >= 18) {
                    System.out.println("Student " + (i + 1) + " can vote.");
                } else {
                    System.out.println("Student " + (i + 1) + " cannot vote.");
                }
            }
        }
    }
}
