import java.util.Scanner;

public class HandshakeCalculator {

    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        // try-with-resources for Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of students: ");
            int numberOfStudents = sc.nextInt();

            // Calculating max handshakes
            int handshakes = calculateHandshakes(numberOfStudents);

            // Display result
            System.out.println("The maximum number of possible handshakes among " 
                               + numberOfStudents + " students is: " + handshakes);
        }
    }
}
