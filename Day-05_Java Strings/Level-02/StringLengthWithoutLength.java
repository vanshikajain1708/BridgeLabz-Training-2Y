import java.util.Scanner;

public class StringLengthWithoutLength {

    // Method to calculate string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Try accessing each character
                count++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return count;
    }

    public static void main(String[] args) {
        // Try-with-resources: Scanner will auto-close after use
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.next(); // use nextLine() if you want full sentence

            // Call custom method and check return value
            int customLength = findLength(input);
            if (customLength >= 0) {
                System.out.println("Length using custom method: " + customLength);
            } else {
                System.out.println("Error: Could not calculate string length.");
            }

            // Compare with built-in length()
            int actualLength = input.length();
            System.out.println("Length using built-in method: " + actualLength);
        }
    }
}
