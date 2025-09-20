import java.util.Scanner;

public class CharArrayComparison {

    // Method to return characters manually using charAt()
    public static char[] manualCharArray(String text) {
        int length = text.length();
        char[] result = new char[length];
        for (int i = 0; i < length; i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    // Method to display a char array
    public static void displayCharArray(char[] array, String label) {
        System.out.print(label + ": [");
        for (int i = 0; i < array.length; i++) {
            System.out.print("'" + array[i] + "'");
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Try-with-resources for Scanner
        try (Scanner scanner = new Scanner(System.in)) {
            // Take input string
            System.out.print("Enter a string: ");
            String input = scanner.next();

            // Get character arrays
            char[] manualChars = manualCharArray(input);
            char[] builtInChars = input.toCharArray();

            // Compare the arrays
            boolean areEqual = compareCharArrays(manualChars, builtInChars);

            // Display arrays
            System.out.println();
            displayCharArray(manualChars, "Manual char array");
            displayCharArray(builtInChars, "Built-in toCharArray");

            // Display result
            System.out.println("\nComparison Result: " + (areEqual ? "✅ Arrays match" : "❌ Arrays do not match"));
        }
    }
}
