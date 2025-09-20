import java.util.Scanner;

public class FirstNonRepeating {

    // Method to find first non-repeating character using charAt()
    public static char findFirstNonRepeatingChar(String text) {
        int[] freq = new int[256]; // Frequency array for all ASCII characters

        // First loop: Count frequency of each character
        int len = getLength(text);
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Second loop: Find first character with frequency 1
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch; // Found the first non-repeating character
            }
        }

        return '\0'; // Return null character if none found
    }

    // Method to get length of a string without using .length()
    public static int getLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return len;
    }

    // Main method to get input and display result
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char result = findFirstNonRepeatingChar(input);

            if (result != '\0') {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating characters found.");
            }
        }
    }
}
