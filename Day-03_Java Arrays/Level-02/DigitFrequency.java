import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {  // Try-with-resources
            System.out.print("Enter a number: ");
            long number = sc.nextLong();  // Supports large numbers

            // Convert number to string to find digits easily
            String numStr = Long.toString(Math.abs(number)); // Handle negative numbers

            int[] frequency = new int[10]; // Array to store frequency of digits 0-9

            // Count frequency of each digit
            for (int i = 0; i < numStr.length(); i++) {
                char ch = numStr.charAt(i);
                int digit = ch - '0';  // Convert char to int
                frequency[digit]++;
            }

            // Display frequency of each digit
            System.out.println("Digit\tFrequency");
            for (int i = 0; i < 10; i++) {
                if (frequency[i] > 0) {
                    System.out.println(i + "\t" + frequency[i]);
                }
            }
        }
    }
}