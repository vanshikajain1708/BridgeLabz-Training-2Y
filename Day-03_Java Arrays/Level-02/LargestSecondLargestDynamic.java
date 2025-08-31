import java.util.Arrays;
import java.util.Scanner;

public class LargestSecondLargestDynamic {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;
            int tempNum = number;

            // Extract digits and dynamically resize array if needed
            while (tempNum != 0) {
                if (index == maxDigit) {
                    // Increase array size by 10 using Arrays.copyOf
                    maxDigit += 10;
                    digits = Arrays.copyOf(digits, maxDigit);
                }

                int lastDigit = tempNum % 10;
                digits[index] = lastDigit;
                index++;
                tempNum /= 10;
            }

            // Find largest and second largest digits
            int largest = 0;
            int secondLargest = 0;

            for (int i = 0; i < index; i++) {
                if (digits[i] > largest) {
                    secondLargest = largest;
                    largest = digits[i];
                } else if (digits[i] > secondLargest && digits[i] != largest) {
                    secondLargest = digits[i];
                }
            }

            // Display results
            System.out.println("Largest digit: " + largest);
            System.out.println("Second largest digit: " + secondLargest);
        }
    }
}