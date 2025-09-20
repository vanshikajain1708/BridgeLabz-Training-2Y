import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative check using start and end index
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive palindrome check
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3a: Reverse string using charAt()
    public static char[] reverseUsingCharAt(String text) {
        int len = text.length();
        char[] reversed = new char[len];

        for (int i = 0; i < len; i++) {
            reversed[i] = text.charAt(len - 1 - i);
        }

        return reversed;
    }

    // Logic 3b: Compare original and reversed char arrays
    public static boolean isPalindromeArrayCompare(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseUsingCharAt(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a text: ");
            String input = scanner.nextLine();

            // Optional: Normalize input (remove spaces, lowercase)
            String normalized = input.replaceAll("\\s+", "").toLowerCase();

            System.out.println("\n--- Palindrome Checks ---");

            // Logic 1
            boolean result1 = isPalindromeIterative(normalized);
            System.out.println("Logic 1 (Iterative): " + (result1 ? "Palindrome" : "Not Palindrome"));

            // Logic 2
            boolean result2 = isPalindromeRecursive(normalized, 0, normalized.length() - 1);
            System.out.println("Logic 2 (Recursive): " + (result2 ? "Palindrome" : "Not Palindrome"));

            // Logic 3
            boolean result3 = isPalindromeArrayCompare(normalized);
            System.out.println("Logic 3 (Array Compare): " + (result3 ? "Palindrome" : "Not Palindrome"));
        }
    }
}
