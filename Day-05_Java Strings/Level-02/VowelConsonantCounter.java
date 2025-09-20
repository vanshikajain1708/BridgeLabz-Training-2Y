import java.util.Scanner;

public class VowelConsonantCounter {

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

    // Method to count vowels and consonants
    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        int index = 0;
        try {
            while (true) {
                char c = str.charAt(index);

                String type = checkCharType(c);
                if (type.equals("Vowel")) {
                    vowels++;
                } else if (type.equals("Consonant")) {
                    consonants++;
                }
                index++;
            }
        } catch (Exception e) {
            // end of string
        }

        return new int[]{vowels, consonants};
    }

    // Main method
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String input = sc.nextLine();

            int[] result = countVowelsConsonants(input);

            System.out.println("\nVowels: " + result[0]);
            System.out.println("Consonants: " + result[1]);
        }
    }
}

