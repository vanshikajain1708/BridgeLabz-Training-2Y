import java.util.Scanner;

public class LowercaseConversion {

    // Convert string to lowercase using charAt() and ASCII logic
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if uppercase letter (ASCII 'A' to 'Z')
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32
                ch = (char) (ch + 32);
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
            String builtInLower = input.toLowerCase();

            // Using custom method
            String customLower = toLowerCaseCustom(input);

            // Compare results
            boolean areEqual = compareStrings(builtInLower, customLower);

            System.out.println("\nBuilt-in toLowerCase(): " + builtInLower);
            System.out.println("Custom toLowerCase:     " + customLower);
            System.out.println("Are both lowercase strings equal? " + areEqual);
        }
    }
}

