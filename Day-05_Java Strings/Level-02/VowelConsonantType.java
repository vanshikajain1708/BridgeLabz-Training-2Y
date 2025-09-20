import java.util.Scanner;

public class VowelConsonantType {

    // Method to classify character
    public static String checkCharType(char c) {
        // Convert uppercase to lowercase using ASCII
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }

        // Check if it's a letter
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

    // Method to analyze string and return 2D array [char, type]
    public static String[][] analyzeString(String str) {
        int length = 0;

        // find length manually
        try {
            while (true) {
                str.charAt(length);
                length++;
            }
        } catch (Exception e) {
            // end of string
        }

        String[][] result = new String[length][2];

        for (int i = 0; i < length; i++) {
            char c = str.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }

        return result;
    }

    // Method to display the 2D array in tabular format
    public static void displayTable(String[][] arr) {
        System.out.println("\nCharacter\tType");
        System.out.println("-----------------------------");
        for (String[] row : arr) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            // Analyze the string
            String[][] analysis = analyzeString(input);

            // Display result
            displayTable(analysis);
        }
    }
}

