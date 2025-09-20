import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException (unhandled)
    public static void generateException(String text) {
        // Intentionally use start index greater than end index
        System.out.println("Substring result: " + text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException using try-catch
    public static void handleException(String text) {
        try {
            System.out.println("Substring result: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("⚠️ Caught IllegalArgumentException!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught a generic RuntimeException!");
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
            } catch (IllegalArgumentException e) {
                System.out.println("❌ Exception occurred in generateException()");
                System.out.println("Exception Message: " + e.getMessage());
            }

            System.out.println("\n=== Handling Exception with try-catch ===");
            handleException(input);
        }
    }
}

