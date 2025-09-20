import java.util.Scanner;

public class WordLength2DArray {

    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // End of string
        }
        return count;
    }

    // Method to split a sentence into words (manual split)
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

    // Method to create 2D array [word, length]
    public static String[][] wordWithLengths(String[] words) {
        int len = words.length;
        String[][] result = new String[len][2];

        for (int i = 0; i < len; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i])); // convert int -> String
        }

        return result;
    }

    // Main function
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();

            // Step 1: Split text into words
            String[] words = customSplit(input);

            // Step 2: Get words + lengths in 2D array
            String[][] wordLengthArray = wordWithLengths(words);

            // Step 3: Display result in tabular format
            System.out.println("\nWord\tLength");
            System.out.println("------------------");
            for (int i = 0; i < wordLengthArray.length; i++) {
                String word = wordLengthArray[i][0];
                int length = Integer.parseInt(wordLengthArray[i][1]); // convert back to int
                System.out.println(word + "\t" + length);
            }
        }
    }
}
