import java.util.Scanner;

public class LargestAndSecondLargestDigit {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a number: ");
            int number = sc.nextInt();

            int maxDigit = 10;
            int[] digits = new int[maxDigit];
            int index = 0;
            int temp = number;

            // Extract digits and store in array
            while (temp != 0) {
                int lastDigit = temp % 10;
                digits[index] = lastDigit;
                index++;

                if (index == maxDigit) {
                    break; // prevent array overflow
                }

                temp /= 10;
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