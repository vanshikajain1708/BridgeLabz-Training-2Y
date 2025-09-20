import java.util.Scanner;

public class StringComparison {

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
        // Try-with-resources to auto-close Scanner
        try (Scanner scanner = new Scanner(System.in)) {

            // Take input from user
            System.out.print("Enter first string: ");
            String string1 = scanner.next();

            System.out.print("Enter second string: ");
            String string2 = scanner.next();

            // Compare using charAt()
            boolean resultCharAt = compareUsingCharAt(string1, string2);

            // Compare using built-in equals()
            boolean resultEquals = string1.equals(string2);

            // Display results
            System.out.println("\nComparison using charAt(): " + resultCharAt);
            System.out.println("Comparison using equals():  " + resultEquals);

            // Check if both methods give the same result
            if (resultCharAt == resultEquals) {
                System.out.println("✅ Both methods returned the same result.");
            } else {
                System.out.println("❌ The methods returned different results.");
            }

        } catch (Exception e) {
            System.out.println("Error reading input: " + e.getMessage());
        }
    }
}
