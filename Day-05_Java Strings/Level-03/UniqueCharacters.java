import java.util.Scanner;

public class UniqueCharacters {

    // Method to calculate string length without using .length()
    public static int getLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // End of string reached
        }
        return length;
    }

    // Method to find unique characters using charAt()
    public static char[] findUniqueChars(String text) {
        int length = getLength(text);
        char[] temp = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        // Use System.arraycopy instead of manual copy
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(temp, 0, uniqueChars, 0, uniqueCount);

        return uniqueChars;
    }

    // Main method using try-with-resources
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            char[] unique = findUniqueChars(input); // ✅ capture return value

            System.out.println("Unique characters in the string:");
            for (char c : unique) {
                System.out.print(c + " ");
            }
        }
    }
}

