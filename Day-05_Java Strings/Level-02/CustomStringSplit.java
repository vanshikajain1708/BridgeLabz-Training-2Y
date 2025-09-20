import java.util.Scanner;

public class CustomStringSplit {

    // Method to find string length without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // keep accessing until exception
                count++;
            }
        } catch (Exception e) {
            // reached end of string
        }
        return count;
    }

    // Method to split string into words manually
    public static String[] customSplit(String str) {
        int len = findLength(str);

        // First count words
        int wordCount = 1; // at least 1 word if not empty
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store indexes of spaces
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0;
        spaceIndexes[index++] = -1; // start before first word

        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndexes[index++] = i;
            }
        }
        spaceIndexes[index] = len; // end after last word

        // Extract words using indexes
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

    // Method to compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String input = sc.nextLine();

            // Custom split
            String[] customWords = customSplit(input);

            // Built-in split
            String[] builtinWords = input.split(" ");

            // Compare
            boolean areEqual = compareArrays(customWords, builtinWords);

            // Display results
            System.out.println("\nCustom Split Result:");
            for (String w : customWords) {
                System.out.println(w);
            }

            System.out.println("\nBuilt-in Split Result:");
            for (String w : builtinWords) {
                System.out.println(w);
            }

            System.out.println("\nAre both splits equal? " + areEqual);
        }
    }
}
