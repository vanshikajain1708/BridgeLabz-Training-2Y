import java.util.Scanner;

public class CustomTrimExample {

    // Method to find start and end indexes after trimming spaces
    public static int[] customTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Trim leading spaces
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Try-with-resources ensures Scanner is closed automatically
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a string with leading and trailing spaces:");
            String input = sc.nextLine();

            // Custom trim using charAt()
            int[] indices = customTrimIndices(input);
            String trimmedCustom = customSubstring(input, indices[0], indices[1]);

            // Built-in trim
            String trimmedBuiltIn = input.trim();

            // Compare results
            boolean isEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

            // Display results
            System.out.println("Custom trimmed string: \"" + trimmedCustom + "\"");
            System.out.println("Built-in trimmed string: \"" + trimmedBuiltIn + "\"");
            System.out.println("Are both strings equal? " + isEqual);
        }
    }
}

