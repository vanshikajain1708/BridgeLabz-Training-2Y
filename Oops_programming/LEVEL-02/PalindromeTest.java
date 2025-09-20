class PalindromeChecker {
    // Attribute
    private final String text;

    // Constructor to initialize text
    public PalindromeChecker(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase(); // Ignore spaces and case
        int left = 0;
        int right = cleanedText.length() - 1;

        while (left < right) {
            if (cleanedText.charAt(left) != cleanedText.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeTest {
    public static void main(String[] args) {
        // Using try-with-resources to automatically close Scanner
        try (java.util.Scanner sc = new java.util.Scanner(System.in)) {
            System.out.print("Enter text to check: ");
            String inputText = sc.nextLine();

            final PalindromeChecker checker = new PalindromeChecker(inputText);
            checker.displayResult();
        }
    }
}

