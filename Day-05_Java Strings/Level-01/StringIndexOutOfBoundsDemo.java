import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException (unhandled)
    public static void generateException(String text) {
        // Access index beyond length to cause exception
        System.out.println("Character at invalid index: " + text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Character at invalid index: " + text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught StringIndexOutOfBoundsException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            System.out.println("\n=== Generating Exception (Unhandled) ===");
            try {
                generateException(input);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("❌ Exception occurred in generateException()");
                System.out.println("Exception Message: " + e.getMessage());
            }

            System.out.println("\n=== Handling Exception with try-catch ===");
            handleException(input);
        }
    }
}

