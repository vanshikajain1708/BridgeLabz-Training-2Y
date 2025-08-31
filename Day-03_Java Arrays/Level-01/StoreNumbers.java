import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            
            // Array to hold up to 10 numbers
            double[] numbers = new double[10];
            double total = 0.0;
            int index = 0;

            System.out.println("Enter numbers (0 or negative number to stop, max 10 numbers):");

            // Infinite loop
            while (true) {
                System.out.print("Enter number " + (index + 1) + ": ");
                double num = sc.nextDouble();

                // Break if number <= 0
                if (num <= 0) {
                    break;
                }

                // Break if array is full
                if (index == numbers.length) {
                    System.out.println("Array is full. Stopping input.");
                    break;
                }

                // Store number and increment index
                numbers[index] = num;
                index++;
            }

            // Display entered numbers and calculate total
            System.out.println("\nNumbers entered:");
            for (int i = 0; i < index; i++) {
                System.out.print(numbers[i] + " ");
                total += numbers[i];
            }

            // Show sum
            System.out.println("\nTotal sum = " + total);
        }
    }
}
