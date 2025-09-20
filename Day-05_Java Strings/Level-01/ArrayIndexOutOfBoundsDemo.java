import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException (unhandled)
    public static void generateException(String[] names) {
        // Intentionally access index beyond array length
        System.out.println("Accessing invalid index: " + names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException using try-catch
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("⚠️ Caught ArrayIndexOutOfBoundsException!");
            System.out.println("Exception Message: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("⚠️ Caught a generic RuntimeException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter number of names: ");
            int n = scanner.nextInt();
            scanner.nextLine();  // consume newline

            String[] names = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = scanner.nextLine();
            }

            System.out.println("\n=== Generating Exception (Unhandled) ===");
            try {
                generateException(names);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("❌ Exception occurred in generateException()");
                System.out.println("Exception Message: " + e.getMessage());
            }

            System.out.println("\n=== Handling Exception with try-catch ===");
            handleException(names);
        }
    }
}
