import java.util.Scanner;

public class FizzBuzzArray {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("Enter a positive integer: ");
            int n = sc.nextInt();

            if (n <= 0) {
                System.out.println("Error: Enter a positive integer.");
                return;
            }

            // Create String array to store results
            String[] results = new String[n];

            // Fill the array with Fizz, Buzz, FizzBuzz or number
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    results[i - 1] = "FizzBuzz";
                } else if (i % 3 == 0) {
                    results[i - 1] = "Fizz";
                } else if (i % 5 == 0) {
                    results[i - 1] = "Buzz";
                } else {
                    results[i - 1] = Integer.toString(i);
                }
            }

            // Display results with position
            for (int i = 0; i < results.length; i++) {
                System.out.println("Position " + (i + 1) + " = " + results[i]);
            }
        }
    }
}
