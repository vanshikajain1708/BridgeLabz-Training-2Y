import java.util.Scanner;

public class UppercaseConversion {

    // Convert string to uppercase using charAt() and ASCII logic
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if lowercase letter (ASCII 'a' to 'z')
            if (ch >= 'a' && ch <= 'z') {
                // Convert to uppercase by subtracting 32
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }

        return result.toString();
    }

    // Compare two strings character by character using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter text: ");
            String input = scanner.nextLine();

            // Using built-in method
            String builtInUpper = input.toUpperCase();

            // Using custom method
            String customUpper = toUpperCaseCustom(input);

            // Compare results
            boolean areEqual = compareStrings(builtInUpper, customUpper);

            System.out.println("\nBuilt-in toUpperCase(): " + builtInUpper);
            System.out.println("Custom toUpperCase:     " + customUpper);
            System.out.println("Are both uppercase strings equal? " + areEqual);
        }
    }
}

