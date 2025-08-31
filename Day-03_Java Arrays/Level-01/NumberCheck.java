import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        
        // Try-with-resources automatically closes Scanner after use
        try (Scanner sc = new Scanner(System.in)) {
            
            // Define an array of 5 integer elements
            int[] numbers = new int[5];

            // Take user input for the array elements
            System.out.println("Enter 5 numbers:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            // Check each number
            for (int num : numbers) {
                if (num > 0) {
                    if (num % 2 == 0) {
                        System.out.println(num + " is Positive and Even.");
                    } else {
                        System.out.println(num + " is Positive and Odd.");
                    }
                } else if (num < 0) {
                    System.out.println(num + " is Negative.");
                } else {
                    System.out.println(num + " is Zero.");
                }
            }

            // Compare the first and last elements
            int first = numbers[0];
            int last = numbers[numbers.length - 1];

            System.out.print("\nComparison of first and last element: ");
            if (first == last) {
                System.out.println("Both are equal.");
            } else if (first > last) {
                System.out.println("First element (" + first + ") is greater than last element (" + last + ").");
            } else {
                System.out.println("First element (" + first + ") is less than last element (" + last + ").");
            }
        } 
    }
}
