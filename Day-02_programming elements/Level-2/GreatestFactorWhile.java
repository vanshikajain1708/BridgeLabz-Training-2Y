import java.util.Scanner;

public class GreatestFactorWhile {
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
                int counter = number - 1; // Start from number-1

                // Loop from counter down to 1
                while (counter >= 1) {
                    if (number % counter == 0) {
                        greatestFactor = counter;
                        break; // Stop after finding the greatest factor
                    }
                    counter--;
                }

                System.out.println("Greatest factor of " + number + " besides itself is: " + greatestFactor);
            }
        }
    }
}
