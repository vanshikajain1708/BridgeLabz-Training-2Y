import java.util.Scanner;

public class CharacterFrequencyNested {

    // Method to find character frequencies using nested loops
    public static String[] findFrequencies(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        // Outer loop: for each character
        for (int i = 0; i < length; i++) {
            freq[i] = 1; // initialize frequency

            // Inner loop: check for duplicates
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark as counted
                }
            }
        }

        // Count how many unique (non-'0') characters we have
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') {
                uniqueCount++;
            }
        }

        // Create 1D String array to store character and frequency
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') {
                result[index] = chars[i] + " - " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Main method: input, call method, and display result
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String[] frequencies = findFrequencies(input);

            System.out.println("\nCharacter Frequencies:");
            for (String entry : frequencies) {
                System.out.println(entry);
            }
        }
    }
}
