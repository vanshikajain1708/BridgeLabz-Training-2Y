 import java.util.Scanner;

public class CharacterFrequency {

    // Method to get string length without using .length()
    public static int getLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
            // Reached end of string
        }
        return len;
    }

    // Method to calculate frequency and return 2D array [char, freq]
    public static char[][] findFrequencies(String text) {
        int[] freq = new int[256]; // For ASCII characters
        int len = getLength(text);

        // Count frequency using ASCII index
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Store characters and their frequencies (if not already added)
        char[][] resultTemp = new char[256][2];
        int count = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (freq[ch] > 0) {
                // Add to result
                resultTemp[count][0] = ch;
                resultTemp[count][1] = (char) (freq[ch]); // storing frequency as char
                freq[ch] = 0; // mark as processed
                count++;
            }
        }

        // Final result with actual size
        char[][] result = new char[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = resultTemp[i][0];
            result[i][1] = resultTemp[i][1];
        }

        return result;
    }

    // Main method to get input and display result
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char[][] frequencies = findFrequencies(input);

            System.out.println("\nCharacter Frequencies:");
            System.out.printf("%-10s %-10s\n", "Character", "Frequency");
            System.out.println("------------------------");

            for (char[] entry : frequencies) {
                char ch = entry[0];
                int freq = (int) entry[1]; // convert char back to int
                System.out.printf("%-10s %-10d\n", ch, freq);
            }
        }
    }
}

