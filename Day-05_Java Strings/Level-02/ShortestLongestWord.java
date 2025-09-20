import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // end of string reached
        }
        return count;
    }

    // Method to split text into words manually
    public static String[] customSplit(String str) {
        int len = findLength(str);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1;

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = len;

        // Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word += str.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to create 2D array [word, length as string]
    public static String[][] wordWithLengths(String[] words) {
        int len = words.length;
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i])); // only once here
        }

        return result;
    }

    // Method to find shortest and longest word
    public static String[] findShortestAndLongest(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];

        int shortestLen = Integer.parseInt(wordLengthArray[0][1]);
        int longestLen = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] row : wordLengthArray) {
            int len = Integer.parseInt(row[1]);  // necessary conversion once
            if (len < shortestLen) {
                shortestLen = len;
                shortestWord = row[0];
            }
            if (len > longestLen) {
                longestLen = len;
                longestWord = row[0];
            }
        }

        return new String[] { shortestWord, longestWord };
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();

            // Step 1: Split text
            String[] words = customSplit(input);

            // Step 2: Word + length array
            String[][] wordLengthArray = wordWithLengths(words);

            // Step 3: Find shortest and longest
            String[] result = findShortestAndLongest(wordLengthArray);

            // Step 4: Display
            System.out.println("\nWord\tLength");
            System.out.println("------------------");
            for (String[] row : wordLengthArray) {
                System.out.println(row[0] + "\t" + Integer.parseInt(row[1])); // only parse here
            }

            System.out.println("\nShortest Word: " + result[0]);
            System.out.println("Longest Word: " + result[1]);
        }
    }
}
