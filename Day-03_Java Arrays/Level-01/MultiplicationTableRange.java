import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            // Take user input
            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            // Define array for results (6 to 9 → 4 results)
            int[] multiplicationResult = new int[4];

            // Store results in array
            for (int i = 6; i <= 9; i++) {
                multiplicationResult[i - 6] = number * i;
            }

            // Display results
            System.out.println("\nMultiplication Table of " + number + " from 6 to 9:");
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + multiplicationResult[i - 6]);
            }
        }
    }
}
