public class NullPointerDemo {

    @SuppressWarnings("null")
    // Method to generate NullPointerException (unhandled inside the method)
    public static void generateNullPointerException() {
        String text = null;

        // Intentionally cause NullPointerException
        System.out.println("Length of text: " + text.length());
    }

    @SuppressWarnings("null")
    // Method to handle NullPointerException using try-catch
    public static void handleNullPointerException() {
        String text = null;

        try {
            // Attempt to access method on null object
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("⚠️ Caught a NullPointerException!");
            System.out.println("Exception Message: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Demonstrating Unhandled NullPointerException ===");
        try {
            generateNullPointerException();  // Will throw exception
        } catch (NullPointerException e) {
            System.out.println("❌ Exception occurred in generateNullPointerException()");
            System.out.println("Exception Message: " + e.getMessage());
        }

        System.out.println("\n=== Handling NullPointerException with try-catch ===");
        handleNullPointerException();  // Exception will be caught inside
    }
}

