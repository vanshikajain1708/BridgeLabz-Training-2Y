import java.util.Scanner;

public class CharacterFrequencyWithUniques {

    // Method to get string length without using .length()
    public static int getLength(String text) {
        int len = 0;
        try {
            while (true) {
                text.charAt(len);
                len++;
            }
        } catch (Exception e) {
            // End of string
        }
        return len;
    }

    // Method to find unique characters using charAt() and nested loops
    public static char[] uniqueCharacters(String text) {
        int length = getLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Copy unique characters to final array
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(temp, 0, uniqueChars, 0, uniqueCount);

        return uniqueChars;
    }

    // Method to compute frequencies and return [char, frequency] as String[][]
    public static String[][] getFrequencies(String text) {
        int[] freq = new int[256]; // ASCII character frequency

        int length = getLength(text);

        // Count frequency using ASCII index
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);

        // Create result array
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            result[i][0] = String.valueOf(ch);          // character
            result[i][1] = String.valueOf(freq[ch]);     // frequency
        }

        return result;
    }

    // Main method: input + call methods + display result
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            String[][] freqResult = getFrequencies(input);

            System.out.println("\nCharacter Frequencies:");
            System.out.printf("%-12s %-12s\n", "Character", "Frequency");
            System.out.println("------------------------------");

            for (String[] entry : freqResult) {
                System.out.printf("%-12s %-12s\n", entry[0], entry[1]);
            }
        }
    }
}

