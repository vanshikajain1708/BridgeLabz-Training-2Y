import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        // try-with-resources ensures Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {

            // Input number
            System.out.print("Enter a positive integer: ");
            int number = sc.nextInt();

            if (number <= 0) {
                System.out.println("Please enter a positive integer greater than 0.");
            } else {
                int greatestFactor = 1; // Initialize greatest factor

                // Loop from number-1 down to 1
                for (int i = number - 1; i >= 1; i--) {
                    if (number % i == 0) {
                        greatestFactor = i; // Assign the factor
                        break; // Stop the loop after finding the greatest factor
                    }
                }

                System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
            }
        }
    }
}
