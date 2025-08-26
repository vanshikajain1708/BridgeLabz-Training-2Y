import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Use try-with-resources so Scanner closes automatically
        try (Scanner sc = new Scanner(System.in)) {
            
            // Step 1: Get integer input for number
            System.out.print("Enter an integer: ");
            int number = sc.nextInt();

            // Step 2: Initialize count variable
            int count = 0;

            // Handle case when number is 0 (since loop won't run)
            if (number == 0) {
                count = 1;
            } else {
                // Step 3: Use loop until number != 0
                while (number != 0) {
                    // Step 4: Remove last digit
                    number = number / 10;

                    // Step 5: Increase count
                    count++;
                }
            }

            // Step 6: Display result
            System.out.println("Number of digits: " + count);
        }
    }
}

