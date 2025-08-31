import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        
        // Try-with-resources for Scanner
        try (Scanner sc = new Scanner(System.in)) {
            
            // Get user input
            System.out.print("Enter a number to print its multiplication table: ");
            int number = sc.nextInt();

            // Define an array to store results
            int[] table = new int[10];

            // Store multiplication results in array
            for (int i = 1; i <= 10; i++) {
                table[i - 1] = number * i;
            }

            // Print the multiplication table
            System.out.println("\nMultiplication Table of " + number + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " * " + i + " = " + table[i - 1]);
            }
        }
    }
}
