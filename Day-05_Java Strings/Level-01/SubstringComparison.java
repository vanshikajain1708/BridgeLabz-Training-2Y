import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String str1, String str2) {
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
        // Try-with-resources to automatically close Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Input original string
            System.out.print("Enter a string: ");
            String original = scanner.next();

            // Input start and end index
            System.out.print("Enter start index: ");
            int start = scanner.nextInt();

            System.out.print("Enter end index: ");
            int end = scanner.nextInt();

            // Validation
            if (start < 0 || end > original.length() || start >= end) {
                System.out.println("Invalid indices!");
                return;
            }

            // Create substrings
            String manualSubstring = substringUsingCharAt(original, start, end);
            String builtInSubstring = original.substring(start, end);

            // Compare substrings using charAt()
            boolean areEqual = compareUsingCharAt(manualSubstring, builtInSubstring);

            // Display results
            System.out.println("\nSubstring using charAt(): " + manualSubstring);
            System.out.println("Substring using substring(): " + builtInSubstring);
            System.out.println("Comparison Result: " + (areEqual ? "✅ Match" : "❌ Do not match"));

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

