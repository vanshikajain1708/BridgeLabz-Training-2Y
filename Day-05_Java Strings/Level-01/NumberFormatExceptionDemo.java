import java.util.Scanner;

public class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException (unhandled)
    public static void generateException(String text) {
        // This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException using try-catch
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("⚠️ Caught NumberFormatException!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught a generic RuntimeException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string to parse as integer: ");
            String input = scanner.nextLine();

            System.out.println("\n=== Generating Exception (Unhandled) ===");
            try {
                generateException(input);
            } catch (NumberFormatException e) {
                System.out.println("❌ Exception occurred in generateException()");
                System.out.println("Exception Message: " + e.getMessage());
            }

            System.out.println("\n=== Handling Exception with try-catch ===");
            handleException(input);
        }
    }
}

