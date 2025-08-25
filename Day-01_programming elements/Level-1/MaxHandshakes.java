import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close Scanner
        try (Scanner input = new Scanner(System.in)) {
            // Take input for number of students
            System.out.print("Enter the number of students: ");
            int numberOfStudents = input.nextInt();

            // Calculate maximum number of handshakes using combination formula
            int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

            // Output
            System.out.println("The maximum number of possible handshakes among " 
                               + numberOfStudents + " students is " + maxHandshakes);
        }
    }
}

